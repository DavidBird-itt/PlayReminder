# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table address (
  id                            bigint auto_increment not null,
  street1                       varchar(255),
  street2                       varchar(255),
  town                          varchar(255),
  post_code                     varchar(255),
  constraint pk_address primary key (id)
);

create table basket (
  id                            bigint auto_increment not null,
  member_email                  varchar(255),
  constraint uq_basket_member_email unique (member_email),
  constraint pk_basket primary key (id)
);

create table fees (
  id                            bigint auto_increment not null,
  utility                       double not null,
  council_tax                   double not null,
  phone_bill                    double not null,
  other                         double not null,
  landlord_fee                  double not null,
  our_fee                       double not null,
  property_id                   bigint,
  constraint uq_fees_property_id unique (property_id),
  constraint pk_fees primary key (id)
);

create table order_item (
  id                            bigint auto_increment not null,
  quantity                      integer not null,
  price                         double not null,
  order_id                      bigint,
  basket_id                     bigint,
  property_id                   bigint,
  constraint uq_order_item_property_id unique (property_id),
  constraint pk_order_item primary key (id)
);

create table payment (
  id                            bigint auto_increment not null,
  amt_paid                      double not null,
  date_paid                     timestamp,
  constraint pk_payment primary key (id)
);

create table property (
  id                            bigint auto_increment not null,
  num_beds                      integer not null,
  num_baths                     integer not null,
  price                         double not null,
  stock                         integer not null,
  landlord_email                varchar(255),
  aid                           bigint,
  constraint uq_property_aid unique (aid),
  constraint pk_property primary key (id)
);

create table rent_due (
  member_email                  varchar(255),
  id                            bigint,
  price                         double not null,
  due_date                      timestamp,
  constraint uq_rent_due_member_email unique (member_email)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  member_email                  varchar(255),
  constraint pk_shop_order primary key (id)
);

create table style (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_style primary key (id)
);

create table style_property (
  style_id                      bigint not null,
  property_id                   bigint not null,
  constraint pk_style_property primary key (style_id,property_id)
);

create table user (
  type                          varchar(31) not null,
  email                         varchar(255) not null,
  role                          varchar(255),
  fname                         varchar(255),
  lname                         varchar(255),
  phone                         varchar(255),
  date_joined                   date,
  password                      varchar(255),
  constraint pk_user primary key (email)
);

alter table basket add constraint fk_basket_member_email foreign key (member_email) references user (email) on delete restrict on update restrict;

alter table fees add constraint fk_fees_property_id foreign key (property_id) references property (id) on delete restrict on update restrict;

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_property_id foreign key (property_id) references property (id) on delete restrict on update restrict;

alter table property add constraint fk_property_landlord_email foreign key (landlord_email) references user (email) on delete restrict on update restrict;
create index ix_property_landlord_email on property (landlord_email);

alter table property add constraint fk_property_aid foreign key (aid) references address (id) on delete restrict on update restrict;

alter table rent_due add constraint fk_rent_due_member_email foreign key (member_email) references user (email) on delete restrict on update restrict;

alter table shop_order add constraint fk_shop_order_member_email foreign key (member_email) references user (email) on delete restrict on update restrict;
create index ix_shop_order_member_email on shop_order (member_email);

alter table style_property add constraint fk_style_property_style foreign key (style_id) references style (id) on delete restrict on update restrict;
create index ix_style_property_style on style_property (style_id);

alter table style_property add constraint fk_style_property_property foreign key (property_id) references property (id) on delete restrict on update restrict;
create index ix_style_property_property on style_property (property_id);


# --- !Downs

alter table basket drop constraint if exists fk_basket_member_email;

alter table fees drop constraint if exists fk_fees_property_id;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_property_id;

alter table property drop constraint if exists fk_property_landlord_email;
drop index if exists ix_property_landlord_email;

alter table property drop constraint if exists fk_property_aid;

alter table rent_due drop constraint if exists fk_rent_due_member_email;

alter table shop_order drop constraint if exists fk_shop_order_member_email;
drop index if exists ix_shop_order_member_email;

alter table style_property drop constraint if exists fk_style_property_style;
drop index if exists ix_style_property_style;

alter table style_property drop constraint if exists fk_style_property_property;
drop index if exists ix_style_property_property;

drop table if exists address;

drop table if exists basket;

drop table if exists fees;

drop table if exists order_item;

drop table if exists payment;

drop table if exists property;

drop table if exists rent_due;

drop table if exists shop_order;

drop table if exists style;

drop table if exists style_property;

drop table if exists user;

