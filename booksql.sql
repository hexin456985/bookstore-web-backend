# drop database bookstore_web;
create database bookstore_web;
use bookstore_web;


create table userInfo(
    userId integer auto_increment primary key,
    userNames varchar(32) unique not null,
    userPassword varchar(32),
    userEmail varchar(32)
)engine = Innodb, default charset = utf8;

create table bookCategoryInfo (
	bookCategoryId integer auto_increment primary key,
    bookCategoryName varchar(32) unique not null,
    bookCategoryDescription varchar(128)
)engine = Innodb, default charset = utf8;

create table bookInfo (
	bookId integer auto_increment primary key,
    bookPrice decimal(10, 5) not null,
    bookNames varchar(128) unique not null,
    bookAuthor varchar(128) not null,
    bookDescription varchar(128)
)engine = Innodb, default charset = utf8;


create table bookWithCategory (
	bookId integer not null,
    bookCategoryId integer not null,
    foreign key(bookId) references bookInfo(bookId)
    on delete cascade
    on update cascade,
    foreign key(bookCategoryId) references bookCategoryInfo(bookCategoryId)
	on delete cascade
    on update cascade,
    primary key(bookId, bookCategoryId)
)engine = Innodb, default charset = utf8;


create table product (
	productId integer auto_increment primary key,
    bookId integer not null,
    sellerId integer not null,
    productDescription varchar(128),
    productPrice decimal(10, 5) not null,
    foreign key(bookId) references bookInfo(bookId)
	on delete cascade
    on update cascade,
    foreign key(sellerId) references userInfo(userId)
	on delete cascade
    on update cascade
)engine = Innodb, default charset = utf8;



insert into userInfo(userNames, userPassword, userEmail) values('leo', '123', 'leo@qq.com');
insert into userInfo(userNames, userPassword, userEmail) values('yunhuai', '456', 'yunhuai@qq.com');
insert into userInfo(userNames, userPassword, userEmail) values('ningma', '789', 'ningma@qq.com');
insert into userInfo(userNames, userPassword, userEmail) values('fargo', '000', 'fargo@qq.com');


insert into bookCategoryInfo(bookCategoryName, bookCategoryDescription) values('恐怖', '小说');#1
insert into bookCategoryInfo(bookCategoryName, bookCategoryDescription) values('悬疑', '小说');#2
insert into bookCategoryInfo(bookCategoryName, bookCategoryDescription) values('计算机科学', '科学');#3
insert into bookCategoryInfo(bookCategoryName, bookCategoryDescription) values('天文学', '科学');#4
insert into bookCategoryInfo(bookCategoryName, bookCategoryDescription) values('生物科学', '科学');#5
insert into bookCategoryInfo(bookCategoryName, bookCategoryDescription) values('艺术', '杂志');#6
insert into bookCategoryInfo(bookCategoryName, bookCategoryDescription) values('摄影', '杂志');#7
