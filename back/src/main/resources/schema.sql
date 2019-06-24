use web;

drop table if exists basket;
drop table if exists comment;
drop table if exists post;
drop table if exists category;
drop table if exists product;
drop table if exists user;

create table user(
    seq bigint primary key auto_increment,
    id varchar(100) unique not null,
    password varchar(255) not null ,
    name varchar(255) not null ,
    homeNumber bigint,
    phoneNumber bigint not null ,
    postNumber integer not null ,
    locate varchar(255) not null,
    email varchar(255) not null
)engine = InnoDB default charset=utf8;

create table product(
    id bigint primary key auto_increment,
    name varchar(255) not null,
    filepath varchar(255) not null,
    publisher varchar(255)
)engine = InnoDB default charset=utf8;

create table category(
    id bigint primary key auto_increment,
    name varchar(255) not null,
    parent bigint,
    foreign key (parent) references category (id)
        on update cascade on delete cascade
)engine = InnoDB default charset=utf8;

create table post(
     id bigint primary key auto_increment,
     productId bigint not null,
     price integer not null,
     mainCategory bigint not null,
     subCategory bigint not null,
     productInfo text,
     purchaseInfo text,
     foreign key (productId) references product (id)
         on update cascade
         on delete cascade,
     foreign key (mainCategory, SubCategory) references Category(parent, id)
         on update cascade
         on delete cascade
)engine = InnoDB default charset = utf8mb4;

create table basket(
   id bigint primary key auto_increment,
   userId bigint not null,
   productId bigint not null,
   cnt integer not null,
   foreign key (userId) references user (seq)
       on update cascade
       on delete cascade,
   foreign key (productId) references product (id)
       on update cascade
       on delete cascade
)engine = InnoDB default charset = utf8mb4;

create table comment(
    id bigint primary key auto_increment,
    userId bigint not null,
    postId bigint not null,
    content text not null,
    created datetime default current_timestamp,
    updated datetime default current_timestamp on update current_timestamp,
    foreign key (userId) references user (seq)
        on update cascade
        on delete cascade,
    foreign key (postId) references post (id)
        on update cascade
        on delete cascade
)engine = InnoDB default charset = utf8mb4;

