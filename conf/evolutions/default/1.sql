# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table author (
  id                        integer auto_increment not null,
  author_name               varchar(255),
  email                     varchar(255),
  website                   varchar(255),
  password                  varchar(255),
  constraint pk_author primary key (id))
;

create table comment (
  id                        integer auto_increment not null,
  post_id                   integer,
  commentator_name          varchar(255),
  comment_date              datetime,
  comment_content           varchar(255),
  constraint pk_comment primary key (id))
;

create table post (
  id                        integer auto_increment not null,
  author_id                 integer,
  posting_date              datetime,
  post_title                varchar(255),
  post_content              varchar(255),
  constraint pk_post primary key (id))
;

alter table comment add constraint fk_comment_post_1 foreign key (post_id) references post (id) on delete restrict on update restrict;
create index ix_comment_post_1 on comment (post_id);
alter table post add constraint fk_post_author_2 foreign key (author_id) references author (id) on delete restrict on update restrict;
create index ix_post_author_2 on post (author_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table author;

drop table comment;

drop table post;

SET FOREIGN_KEY_CHECKS=1;

