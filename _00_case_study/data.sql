
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
