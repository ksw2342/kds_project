create table user(
u_id int NOT NULL PRIMARY KEY AUTO_INCREMENT,
id varchar(50) NOT NULL,
name varchar(50) NOT NULL,
phone varchar(50) NOT NULL,
regidate date NOT NULL,
cardnum bigint NOT NULL,
point int NOT NULL

);
ALTER TABLE user AUTO_INCREMENT=2000000;

insert into user(id,name,phone,regidate,cardnum,point)
values('kimssss','����','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point) 
values('kims','������','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point)
values('kimads','�ּ���','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point) 
values('kds','����Ÿ','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point)
values('jjjung','������','01022345543',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point) 
values('kkiimm','Ŵ���','01049393302',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point) 
values('kkssww','�̻��','01049393302',now(),4037111111111111 + RAND() * 888888888888,10000000);

