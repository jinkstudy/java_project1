create sequence sq_coupon_cno;
create sequence sq_employee_eno;
create sequence sq_menu_menuno;
drop sequence sq_menu_menuno;

create sequence sq_order_cus_ono;
create sequence sq_stock_sno;


alter table order_cus add Constraint ck_order_cus_otype check(otype In ('����ũ�ƿ�','����'));

Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'�÷�ȭ��Ʈ',4300,10);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'ī������ ��Ű����',4600,8);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'īǪġ��',4500,30);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'���̽� īǪġ��',4500,10);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'�Ƹ޸�ī��',4100,5);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'���̽� �Ƹ޸�ī��',4100,12);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'����ġ��',3500,25);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'�׸�Ƽ ��',3600,16);
Insert into Menu(menuno,menuname,mprice,mcount) values(sq_menu_menuno.nextval,'������ġ',5000,8);

SELECT  menuname FROM menu order by menuno;


