-- create database  furamaspring;
use furamaspring;
 insert into customer(address,birthday,email,gender,id_card,`name`,phone,`status`,customer_type_id) value
('Da Nang','1996-08-08','cuong@gmail.com',1,222222222,'Tieu Cuong',090333333,0,3),
('Quang Nam','1994-01-01','luan@gmail.com',1,4444444,'Tieu Luan',090888888,0,2),
('Da Lat','2000-02-04','my@gmail.com',0,5555555,'My',090789789,0,2),
('Da Nang','1999-09-09','hao@gmail.com',0,3333333,'Hoang Hao',090222222222,0,2);

insert into customer_type values 
('Diamond'),
('Platinium'),
('Gold'),
('Silver'),
('Member');
