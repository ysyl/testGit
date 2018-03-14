USE weibo;

insert into user (username, avatar) values ('zhou', 'localhost:8080/web/img/avatar/avatar.jpg');
insert into user (username, avatar) values ('od', 'localhost:8080/web/img/avatar/avatar.jpg');
insert into user (username, avatar) values ('jay', 'localhost:8080/web/img/avatar/avatar.jpg');
insert into user (username, avatar) values ('foo', 'localhost:8080/web/img/avatar/avatar.jpg');

insert into weibo(arthor, content, image) values (1, '测试微薄1', 'localhost:8080/web/img/paella.jpg');
insert into weibo(arthor, content, image) values (2, '测试微薄2', 'localhost:8080/web/img/paella.jpg');
insert into weibo(arthor, content, image) values (3, '测试微薄3', 'localhost:8080/web/img/paella.jpg');
insert into weibo(arthor, content, image) values (1, '测试微薄4', 'localhost:8080/web/img/paella.jpg');

insert into comment(arthor, reply, content) values (1, 1, '测试评论1');
insert into comment(arthor, reply, content) values (2, 2, '测试评论2');
insert into comment(arthor, reply, content) values (3, 3, '测试评论3');
insert into comment(arthor, reply, content) values (1, 4, '测试评论4');
