package com.bookstore_web_backend.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;


// 將ServerEndpointExporter类作为spring的xml配置文件中的<beans>，作爲Spring 框架在運行時管理的對象
@Configuration
public class WebSocketConfig {
    // @ServerEndpoint() 這個標註來註記他為 WebSocket 服務
    //用ServerEndpointExporter扫描@ServerEndpoint，以便客戶端能連接上
    @Bean
    public ServerEndpointExporter serverEndpointExporter()
    {
        return new ServerEndpointExporter();
    }
}