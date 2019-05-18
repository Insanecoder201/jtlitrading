# jtlitrading
Jtli associates trading application


Run this script after starting mysql db.

Create db as jtlidb, as this is configured in application.properties

After creating jtlidb, switch to jtlidb and run following script.

Run following script for tables

create table admin_info(
	pk_seq int not null auto_increment primary key,
	username varchar(40) not null,
	password varchar(100) not null
);


create table call_info(
	pk_seq int not null auto_increment primary key,
	calltype varchar(1) not null,
	callinfo varchar(1000) not null,
	calldate date
);

create table user_info(
	pk_seq int not null auto_increment primary key,
	emailid varchar(50) not null,
	phoneno varchar(11) not null,
	privilege varchar(1) not null,
	entrydate date,
	enddate date,
	status varchar(1) not null
	
);


create table frequency_info(
	pk_seq int not null auto_increment primary key,
	phoneno varchar(11) not null,
	freq int not null,
	month date
);


create table charge_info(
	pk_seq int not null auto_increment primary key,
	freq int not null,
	charge int
);

insert into charge_info values(1, 5, 50);
insert into charge_info values(2, 10, 60);
insert into charge_info values(3, 15, 70);
insert into charge_info values(4, 20, 80);
insert into charge_info values(5, 22, 90);


insert into admin_info values(1, 'jtliassociates@gmail.com', '6286eee33bc6604b5ea77ccdd82836c8');//sumedh@chingo1234

After running above script, clean install your app and run as spring application.

access localhost:8080/welcome, you should get the error on console.
