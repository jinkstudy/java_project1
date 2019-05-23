create sequence sq_coupon_cno;
create sequence sq_employee_eno;
create sequence sq_menu_menuno;
drop sequence sq_menu_menuno;

create sequence sq_order_cus_ono;
create sequence sq_stock_sno;


alter table order_cus add Constraint ck_order_cus_otype check(otype In ('테이크아웃','매장'));

Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'플랫화이트',4300,10);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'카라멜라테 마키아토',4600,8);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'카푸치노',4500,30);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'아이스 카푸치노',4500,10);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'아메리카노',4100,5);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'아이스 아메리카노',4100,12);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'초코치노',3500,25);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'그린티 라떼',3600,16);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'샌드위치',5000,8);

SELECT  menuname FROM menu order by menuno;


