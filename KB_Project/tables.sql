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
values('kb1','����','01012345678',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb2','������','01025232345',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point)
values('kb3','�ּ���','01015852186',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb4','����Ÿ','01078952185',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point)
values('kb5','���̺�','01082852121',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb6','����ö','01089212395',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb7','������','01097859856',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb8','����ǥ','01087775218',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb9','����','01092359888',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb10','�ڼ���','01077456585',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb11','�ֿ���','01095332111',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb12','������','01099998745',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb13','�ȼ���','01071234567',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb14','�Ѹ��','01045675455',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb15','����','01087779518',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb16','�̿�','01011235648',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb17','������','01075487979',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb18','���μ�','01023422354',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb19','������','01078974568',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb20','��극��ũ','01071121321',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb21','�豹��','01071221584',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb22','�̴���','01055658978',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb23','���α�','01065248797',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb24','������','01021132254',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb25','������','01077854512',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb26','���̸�','01088652312',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb27','������','01044758912',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb28','��ȿ��','01062127845',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb29','����','01018975432',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regi_date,card_num,point) 
values('kb30','������','01064521897',now(),4037111111111111 + RAND() * 888888888888,10000000);


