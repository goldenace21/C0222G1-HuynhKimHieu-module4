
use furama_m4;
insert into customer_type(customer_type_name) value
("Diamond"),
("Platinium"),
("Gold"),
("Silver"),
("Member");

insert into customer
(id_customer,address,birthday,email,gender,id_card,name,phone_number,delete_status,customer_type_id) value
("KH-7465","da nang","2011-05-12","ha@email",1,"756485746","nguyen thu ha","09476385645",0,1),
("KH-3424","hoi an","2001-02-25","hien@email",0,"348675985","huynh kim hien","095736638465",0,2),
("KH-7586","da nang","2011-05-12","ha@email",1,"867589374","nguyen thu ha","09476385645",0,3),
("KH-9275","nha trang","2003-01-02","linh@email",0,"856479263","nguyen thuy linh","09562477634",0,5),
("KH-7254","ha noi","2005-04-23","quang@email",1,"926457264","dang huu quang","097551836434",0,3),
("KH-7265","da lat","2001-09-30","khoi@email",0,"846584584","le khoi","09476386543",0,4),
("KH-2433","quang binh","2002-05-12","minh@email",1,"857467843","huynh nhat minh","0971846394",0,2),
("KH-1534","hue","2001-05-14","quynh@email",1,"857485720","ha nhu quynh","09476385645",0,1);

insert into position (position_name) value 
("Receptionist"),
("Expert"),
("Monitoring"),
("Serve"),
("Manager");

insert into division (division_name) value 
("Sale – Marketing"),
("Administrative"),
("Serve"),
("Manager");

insert into education_degree (education_degree_name) value 
("College"),
("University"),
("Intermediate");

insert into `user` value 
("user1","$2a$12$J7piOgZctBST63h.6qdvzOtYtJn4n4sumBE3.clIWAAmzuBuoaXeq"),
("user2","$2a$12$HowWerJsi5lIxL1e3VsI1OKauOjx0i/19.EGjUcB1cBDljXUd3oau"),
("user3","$2a$12$RmED0A.PYqvxIf0WW80Ce.QgXEP4wJBvzMzWvOmgAiwEZ5Msq8Oge");

insert into `role`(role_name) value 
("ROLE_ADMIN"),
("ROLE_USER");

insert into user_role(user_name,role_id) value 
("user1",1),
("user2",2),
("user3",2);

insert into employee (name,address,birthday,email,id_card,phone_number,salary,division_id,education_degree_id,position_id,user_name) value
("huu trung","hoi an","2011-03-04","trung@gmail","947938493","0932477587","96.45",1,1,1,"user1"),
("bao nhi","da nang","2002-05-02","nhi@gmail","74638493","093544234","45.65",2,2,2,"user2"),
("huynh an","hue","2004-01-12","an@gmail","42345493","0932745323","65.41",3,3,3,"user3"),
("anh tuyet","daklak","2005-11-02","tuyet@gmail","58635493","09862333","32.41",2,1,4,"user3"),
("nhu quynh","quang nam","2002-12-14","quynh@gmail","76635434","0984567","87.41",3,2,5,"user1");



