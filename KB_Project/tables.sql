create database kb_project default character set utf8;

create table user(
u_id int primary key AUTO_INCREMENT,
id varchar(12) NOT NULL,
name varchar(5) NOT NULL,
phone varchar(11) NOT NULL,
regi_date date NOT NULL,
card_num bigint NOT NULL,
point bigint NOT NULL );
ALTER TABLE user AUTO_INCREMENT=20000000;

insert into user(id,name,phone,regi_date,card_num,point)
values('kb1','김상우','01012345678',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb2','정재혁','01025232345',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point)
values('kb3','최수연','01015852186',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb4','데이타','01078952185',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point)
values('kb5','케이비','01082852121',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb6','정광철','01089212395',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb7','노태진','01097859856',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb8','서승표','01087775218',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb9','임희교','01092359888',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb10','박성준','01077456585',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb11','최원준','01095332111',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb12','김현우','01099998745',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb13','안성수','01071234567',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb14','한명수','01045675455',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb15','김경식','01087779518',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb16','이웅','01011235648',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb17','설정훈','01075487979',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb18','염인선','01023422354',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb19','에이콘','01078974568',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb20','노브레이크','01071121321',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb21','김국민','01071221584',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb22','이대한','01055658978',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb23','강민국','01065248797',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb24','이지은','01021132254',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb25','아이유','01077854512',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb26','아이린','01088652312',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb27','옥주현','01044758912',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb28','이효리','01062127845',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb29','이진','01018975432',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb30','성유리','01064521897',now(),4037111111111111 + RAND() * 888888888888,10000000);


