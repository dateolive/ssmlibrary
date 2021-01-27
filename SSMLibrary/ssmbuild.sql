# Host: localhost  (Version: 5.5.47)
# Date: 2021-01-27 22:09:41
# Generator: MySQL-Front 5.3  (Build 4.234)

/*!40101 SET NAMES utf8 */;

#
# Structure for table "books"
#

CREATE TABLE `books` (
  `bookID` int(10) NOT NULL AUTO_INCREMENT COMMENT '书id',
  `bookName` varchar(100) NOT NULL COMMENT '书名',
  `bookCounts` int(11) NOT NULL COMMENT '数量',
  `detail` varchar(200) NOT NULL COMMENT '描述',
  KEY `bookID` (`bookID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "books"
#

INSERT INTO `books` VALUES (1,'Java',1,'从入门到放弃'),(2,'MySQL',10,'从删库到跑路'),(3,'Linux',5,'从进门到进牢'),(4,'算法学习',1000,'acm入门'),(5,'机器学习',1,'python');

#
# Structure for table "user"
#

CREATE TABLE `user` (
  `userID` int(10) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `userName` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(200) NOT NULL COMMENT '密码',
  KEY `userID` (`userID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'admin','357159.');
