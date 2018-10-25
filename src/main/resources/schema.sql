create table ticket
(
   id integer not null,
   name varchar(255) not null,
   severity integer,
   assignee varchar(255) not null,
   owner varchar(255) not null,
   description varchar(255) not null,
   comments varchar(255),
   
   primary key(id)
);