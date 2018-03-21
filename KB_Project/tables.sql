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
values('kimssss','±è»ó¿ì','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point) 
values('kims','Á¤ÀçÇõ','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point)
values('kimads','ÃÖ¼ö¿¬','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point) 
values('kds','µ¥ÀÌÅ¸','01022223333',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point)
values('jjjung','Á¤Á¦Çõ','01022345543',now(),4037111111111111 + RAND() * 888888888888,10000000);
insert into user(id,name,phone,regidate,cardnum,point) 
values('kkiimm','Å´»ó¿ì','01049393302',now(),4037111111111111 + RAND() * 888888888888,10000000);
