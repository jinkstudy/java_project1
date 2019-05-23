create sequence sq_coupon_cno;
create sequence sq_employee_eno;
create sequence sq_menu_menuno;
create sequence sq_order_cus_ono;
create sequence sq_stock_sno;


alter table order_cus add Constraint ck_order_cus_otype check(otype In ('테이크아웃','매장'));