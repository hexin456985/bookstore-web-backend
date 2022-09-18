package com.bookstore_web_backend.websocket;
// 使用slf4j替代直接打印消息及傳統的日志打印方式
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
/*
 On-
 * Open: 表示有浏览器链接过来的时候被调用
 * Close: 
 * Message: 表示浏览器发消息的时候被调用
 * Error:
*/

/*
 * @RestController ~=  @Controller + @ResponseBody
 * 使用RESTful API時，因為通常都是回傳json或xml，無需View Resolver處理來返回頁面
 * 在Controller的API方法前加上@Responsebody來達成省略的部分
 * 使用@RestController將Controller類別中的方法回傳值預設為@ResponseBody
*/
@ServerEndpoint(value = "/api/websocket")
@Component
@RestController
public class WebSocketServer {
    //綫程安全的Set(在concurrent包下
    private static final ConcurrentHashMap<String, Session> SESSIONS = new ConcurrentHashMap<>();
    private final static Logger log = LogManager.getLogger(WebSocketServer.class);

    @OnOpen
    public void onOpen(Session session) {
        log.info("成功建立连接~ 当前总连接数为: " + SESSIONS.size());
    }
    
    @OnClose
    public void onClose() {
        WebSocketServer.SESSIONS.clear();
        //System.out.println(String.format("成功关闭连接~ 当前总连接数为:%s", SESSIONS.size()));
        log.info("成功关闭连接~ 当前总连接数为: " + SESSIONS.size());
    }
    
    @OnMessage
    public void onMessage(String message, Session session) {
        Content2Json jsonData = new Content2Json(message);
               
        if(jsonData.from != null && !jsonData.from.isEmpty) {
            // update or insert
            WebSocketServer.SESSIONS.put(jsonData.from, session);
            if(jsonData.to != null && !jsonData.to.isEmpty() && !jsonData.content.isEmpty()) {
                if(SESSIONS.containsKey(to)) {
                    
                    sendMessage(WebSocketServer.SESSIONS.get(jsonData.to), message);
                }
            }
        }
        log.info("from: {}, to: {}, content: {}", jsonData.from, jsonData.to, jsonData.content);
    }
    
    @OnError
    public void onError(Session session, Throwable error) {
        log.info("发生错误");
        error.printStackTrace();
    }
    /**
     *指定發消息
     *
     * @param message
     */
    public void sendMessage(String message) {
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 廣播消息
     *
     * @param message
     */
    public static void fanoutMessage(String message) {
        SESSIONS.forEach(ws -> ws.sendMessage(message));
    }
}

class Content2Json {
    String message;
    JsonParser jsonParser = JsonParserFactory.getJsonParser();
    
    Content2Json(String msg){
        message = msg;
    }

    String from = (String)json.get("from");  
    String to = (String)json.get("to");
    String content = (String)json.get("content");
}