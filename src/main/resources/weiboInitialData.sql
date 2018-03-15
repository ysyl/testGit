USE weibo;

insert into user (username, avatar) values ('zhou', 'http://localhost:8080/web/img/avatar/avatar.jpg');
insert into user (username, avatar) values ('od', 'http://localhost:8080/web/img/avatar/avatar.jpg');
insert into user (username, avatar) values ('jay', 'http://localhost:8080/web/img/avatar/avatar.jpg');
insert into user (username, avatar) values ('foo', 'http://localhost:8080/web/img/avatar/avatar.jpg');

insert into weibo(arthor_id, content, image) values (1, '测试微薄1', 'http://localhost:8080/web/img/paella.jpg');
insert into weibo(arthor_id, content, image) values (2, '测试微薄2', 'http://localhost:8080/web/img/paella.jpg');
insert into weibo(arthor_id, content, image) values (3, '测试微薄3', 'http://localhost:8080/web/img/paella.jpg');
insert into weibo(arthor_id, content, image) values (1, '测试微薄4', 'http://localhost:8080/web/img/paella.jpg');

insert into comment(arthor_id, reply_weibo_id, content) values (1, 1, '测试评论1');
insert into comment(arthor_id, reply_weibo_id, content) values (2, 2, '测试评论2');
insert into comment(arthor_id, reply_weibo_id, content) values (3, 3, '测试评论3');
insert into comment(arthor_id, reply_weibo_id, content) values (1, 4, '测试评论4');

insert into comment(arthor_id, reply_weibo_id, reply_comment_id, content )
	values (1, 1, 1, '测试at回复');
insert into comment(arthor_id, reply_weibo_id, reply_comment_id, content )
	values (1, 1, 1, '测试at回复');
insert into comment(arthor_id, reply_weibo_id, reply_comment_id, content )
	values (1, 1, 1, '测试at回复');
insert into comment(arthor_id, reply_weibo_id, reply_comment_id, content )
	values (1, 1, 1, '测试at回复');