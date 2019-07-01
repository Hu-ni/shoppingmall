use web;

insert into category (name)
values ('상의(남)'),
       ('하의(남)'),
       ('상의(여)'),
       ('하의(여)'),
       ('구두'),
       ('가방'),
       ('소품');

insert into category (name, parent)
values ('셔츠',1),
       ('T셔츠',1),
       ('폴로 픽',1),
       ('니트/스웨터',1),
       ('가디건',1),
       ('아우터',1);

insert into category (name, parent)
values ('바지',2),
       ('반바지', 2),
       ('청바지',2);

insert into category (name, parent)
values ('티/탑',3),
       ('블라우스/셔츠',3),
       ('후디/스윗셔츠',3),
       ('니트/스웨터',3),
       ('가디건',3),
       ('아우터',3);

insert into category (name, parent)
values ('스커트',4),
       ('바지/레깅스',4);

insert into category (name, parent)
values ('힐',5),
       ('로퍼/플렛',5),
       ('스니커즈',5),
       ('센들',5),
       ('부츠',5);

insert into category (name, parent)
values ('백팩', 6),
       ('토트/숄더백', 6),
       ('크로스백',  6),
       ('클러치', 6);

insert into category (name, parent)
values ('안경', 7),
       ('팔찌', 7),
       ('셀카봉', 7);