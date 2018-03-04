USE weibo;
DROP TABLE IF EXISTS `comment`;
DROP TABLE IF EXISTS `user`;
create table user (
	id bigint NOT NULL auto_increment,
	username varchar(20) NOT NULL,
	password varchar(20) NOT NULL,
	create_time datetime NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table comment (
	id bigint NOT NULL auto_increment,
	content varchar(144) NOT NULL,
	user_id bigint NOT NULL,
	create_time datetime NOT NULL,
	PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT charset=utf8;

alter table comment add constraint fk_user_comments foreign key(user_id) references user(id);