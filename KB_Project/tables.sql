create database kb_project default character set utf8;

create table user(
u_id int PRIMARY KEY AUTO_INCREMENT,
id varchar(50) NOT NULL,
name varchar(50) NOT NULL,
phone varchar(50) NOT NULL,
regi_date date NOT NULL,
card_num bigint NOT NULL,
point int NOT NULL );
ALTER TABLE user AUTO_INCREMENT=2000000;

insert into user(id,name,phone,regi_date,card_num,point)
values('kimssss','����','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kims','������','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point)
values('kimads','�ּ���','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kds','����Ÿ','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point)
values('jjjung','������','01022345543',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kkiimm','Ŵ���','01049393302',now(),4037111111111111 + RAND() * 888888888888,10000000);
