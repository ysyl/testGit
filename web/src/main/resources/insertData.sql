USE weibo;


insert into user (username, password, create_time) values ("zhou", 123456, now());
insert into user (username, password, create_time) values ("od", 1234567, now());
insert into user (username, password, create_time) values ("bapi", 2123456, now());

insert into comment(content, user_id, create_time) values ("评论内容1", 1, now());
insert into comment(content, user_id, create_time) values ("评论内容2", 2, now());
insert into comment(content, user_id, create_time) values ("评论内容3", 3, now());
insert into comment(content, user_id, create_time) values ("评论内容1", 1, now());

