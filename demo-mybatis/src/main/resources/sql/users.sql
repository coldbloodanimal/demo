drop table if exists users;

/*==============================================================*/
/* Table: users                                                 */
/*==============================================================*/
create table users
(
  id          varchar(32) null,
  username    varchar(32) null,
  password    varchar(32) null,
  create_date datetime null
);