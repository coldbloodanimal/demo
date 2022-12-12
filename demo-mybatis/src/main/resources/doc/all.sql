/*==============================================================*/
/* DBMS name:      Sybase SQL Anywhere 12                       */
/* Created on:     2020/4/23 23:05:41                           */
/*==============================================================*/


drop table if exists employee;

drop table if exists "order";

drop table if exists product;

drop table if exists users;

/*==============================================================*/
/* Table: employee                                              */
/*==============================================================*/
create table employee 
(
   id                   bigint                         null,
   employee_name        varchar(32)                    null,
   dept_name            varchar(32)                    null,
   company_name         varchar(32)                    null
);

comment on table employee is 
'employee';

comment on column employee.id is 
'id';

comment on column employee.employee_name is 
'employee_name';

comment on column employee.dept_name is 
'dept_name';

comment on column employee.company_name is 
'company_name';

/*==============================================================*/
/* Table: "order"                                               */
/*==============================================================*/
create table "order" 
(
   id                   varchar(32)                    null,
   user_id              varchar(32)                    null,
   user_name            varchar(32)                    null,
   product_id           varchar(32)                    null,
   product_name         varchar(32)                    null,
   number               int                            null,
   create_date          dateTime                       null
);

comment on table "order" is 
'order';

comment on column "order".id is 
'id';

comment on column "order".user_id is 
'user_id';

comment on column "order".user_name is 
'user_name';

comment on column "order".product_id is 
'product_id';

comment on column "order".product_name is 
'product_name';

comment on column "order".number is 
'number';

comment on column "order".create_date is 
'create_date';

/*==============================================================*/
/* Table: product                                               */
/*==============================================================*/
create table product 
(
   id                   varchar(32)                    null,
   name                 varchar(32)                    null,
   stock                varchar(32)                    null,
   create_date          dateTime                       null
);

comment on table product is 
'product';

comment on column product.id is 
'id';

comment on column product.name is 
'name';

comment on column product.stock is 
'stock';

comment on column product.create_date is 
'create_date';

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users 
(
   id                   varchar(32)                    null,
   username             varchar(32)                    null,
   password             varchar(32)                    null,
   create_date          dateTime                       null,
   phone                varchar(32)                    null
);

comment on table users is 
'users';

comment on column users.id is 
'id';

comment on column users.username is 
'username';

comment on column users.password is 
'password';

comment on column users.create_date is 
'create_date';

comment on column users.phone is 
'phone';

