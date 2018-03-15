/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.6.34 : Database - weibo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`weibo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `weibo`;

/*Table structure for table `arthor` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(15) NOT NULL COMMENT '名称',
  `avatar` varchar(128) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `arthor` */

/*Table structure for table `comment` */

DROP TABLE IF EXISTS `comment`;

CREATE TABLE `comment` (
  `id` int(32) NOT NULL AUTO_INCREMENT,
  `content` text COMMENT '评论内容',
  `create_at` timestamp COMMENT '时间',
  `reply_weibo_id` int(32) NOT NULL COMMENT '微博ID',
  `reply_comment_id` int(32) DEFAULT NULL COMMENT '如果非null，则为at回复的comment id',
  `arthor_id` int(32) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`id`),
  KEY `reply-weibo` (`reply_weibo_id`),
  CONSTRAINT `reply-weibo` FOREIGN KEY (`reply_weibo_id`) REFERENCES `weibo` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table comment add constraint fk_user_comments foreign key(arthor_id) references user(id);
alter table comment add constraint fk_comment_comments foreign key (reply_comment_id) references comment(id);
/*Data for the table `comment` */

/*Table structure for table `weibo` */

DROP TABLE IF EXISTS `weibo`;

CREATE TABLE `weibo` (
  `id` int(32) NOT NULL AUTO_INCREMENT COMMENT '微博ID',
  `arthor_id` int(32) NOT NULL COMMENT '用户ID',
  `content` text NOT NULL COMMENT '内容',
  `create_at` timestamp COMMENT '发布时间',
  `image` varchar(128) DEFAULT NULL COMMENT '图片',
  PRIMARY KEY (`id`),
  CONSTRAINT `weibo_arthor` FOREIGN KEY (`arthor_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `weibo` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
