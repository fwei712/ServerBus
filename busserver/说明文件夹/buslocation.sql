/*
Navicat MySQL Data Transfer
Source Host     : localhost:3306
Source Database : test
Target Host     : localhost:3306
Target Database : test
Date: 2013-05-18 22:54:47
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for buslocation
-- ----------------------------
DROP TABLE IF EXISTS `buslocation`;
CREATE TABLE `buslocation` (
  `id` int(11) NOT NULL,
  `busid` int(11) DEFAULT NULL,
  `end` int(11) DEFAULT NULL,
  `start` int(11) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `latitude` double DEFAULT NULL,
  `speed` float DEFAULT NULL,
  `rotationangle` float DEFAULT NULL,
  `recdate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of buslocation
-- ----------------------------
INSERT INTO `buslocation` VALUES ('1', '45', '0', '1', '1', '108.999395', '34.222573', '0', '0', '2013-05-16 13:24:10');
INSERT INTO `buslocation` VALUES ('2', '45', '0', '1', '1', '108.993709', '34.231461', '0', '0', '2013-05-16 13:27:52');
INSERT INTO `buslocation` VALUES ('3', '45', '0', '1', '1', '108.989804', '34.23767', '0', '0', '2013-05-16 13:32:02');
INSERT INTO `buslocation` VALUES ('4', '45', '0', '1', '1', '108.988023', '34.240632', '0', '0', '2013-05-16 13:36:58');
INSERT INTO `buslocation` VALUES ('5', '45', '0', '1', '1', '108.988259', '34.250956', '0', '0', '2013-05-16 13:39:58');
INSERT INTO `buslocation` VALUES ('6', '45', '0', '1', '1', '108.980985', '34.251098', '0', '0', '2013-05-16 13:42:53');
INSERT INTO `buslocation` VALUES ('7', '45', '0', '1', '1', '108.975964', '34.251044', '0', '0', '2013-05-16 13:46:58');
INSERT INTO `buslocation` VALUES ('8', '45', '0', '1', '1', '108.972509', '34.253244', '0', '0', '2013-05-16 13:51:25');
INSERT INTO `buslocation` VALUES ('9', '45', '0', '1', '1', '108.971221', '34.260036', '0', '0', '2013-05-16 13:54:08');
INSERT INTO `buslocation` VALUES ('10', '45', '0', '1', '1', '108.964527', '34.25954', '0', '0', '2013-05-16 13:56:34');
INSERT INTO `buslocation` VALUES ('11', '45', '0', '1', '1', '108.958679', '34.25962', '0', '0', '2013-05-16 14:00:58');
INSERT INTO `buslocation` VALUES ('12', '45', '0', '1', '1', '108.953819', '34.25962', '0', '0', '2013-05-16 14:02:23');
INSERT INTO `buslocation` VALUES ('13', '45', '0', '1', '1', '108.948004', '34.259549', '0', '0', '2013-05-16 14:08:25');
INSERT INTO `buslocation` VALUES ('14', '45', '0', '1', '1', '108.939646', '34.259469', '0', '0', '2013-05-16 14:11:58');
INSERT INTO `buslocation` VALUES ('15', '45', '0', '1', '1', '108.935022', '34.259478', '0', '0', '2013-05-16 14:16:34');
INSERT INTO `buslocation` VALUES ('16', '25', '0', '1', '1', '108.999739', '34.222111', '0', '0', '2013-05-15 10:16:04');
INSERT INTO `buslocation` VALUES ('17', '25', '0', '1', '1', '108.99637', '34.227141', '0', '0', '2013-05-15 10:20:54');
INSERT INTO `buslocation` VALUES ('18', '25', '0', '1', '1', '108.993033', '34.232455', '0', '0', '2013-05-15 10:26:33');
INSERT INTO `buslocation` VALUES ('19', '25', '0', '1', '1', '108.987433', '34.239577', '0', '0', '2013-05-15 10:30:23');
INSERT INTO `buslocation` VALUES ('20', '25', '0', '1', '1', '108.979633', '34.236242', '0', '0', '2013-05-15 10:35:28');
INSERT INTO `buslocation` VALUES ('21', '25', '0', '1', '1', '108.969483', '34.231949', '0', '0', '2013-05-15 10:38:36');
INSERT INTO `buslocation` VALUES ('22', '25', '0', '1', '1', '108.963915', '34.230614', '0', '0', '2013-05-15 10:42:39');
INSERT INTO `buslocation` VALUES ('23', '25', '0', '1', '1', '108.963754', '34.235945', '0', '0', '2013-05-15 10:46:42');
INSERT INTO `buslocation` VALUES ('24', '25', '0', '1', '1', '108.963625', '34.241617', '0', '0', '2013-05-15 10:49:13');
INSERT INTO `buslocation` VALUES ('25', '25', '0', '1', '1', '108.963534', '34.24551', '0', '0', '2013-05-15 10:54:45');
INSERT INTO `buslocation` VALUES ('26', '25', '0', '1', '1', '108.963384', '34.250902', '0', '0', '2013-05-15 10:54:45');
INSERT INTO `buslocation` VALUES ('27', '25', '0', '1', '1', '108.96332', '34.252836', '0', '0', '2013-05-15 10:57:32');
INSERT INTO `buslocation` VALUES ('28', '25', '0', '1', '1', '108.963234', '34.255492', '0', '0', '2013-05-15 11:02:56');
INSERT INTO `buslocation` VALUES ('29', '25', '0', '1', '1', '108.963175', '34.258046', '0', '0', '2013-05-15 11:05:45');
INSERT INTO `buslocation` VALUES ('30', '25', '0', '1', '1', '108.963137', '34.260431', '0', '0', '2013-05-15 11:07:32');
INSERT INTO `buslocation` VALUES ('31', '25', '0', '1', '1', '108.963089', '34.262705', '0', '0', '2013-05-15 11:10:34');
INSERT INTO `buslocation` VALUES ('32', '25', '0', '1', '1', '108.963068', '34.264793', '0', '0', '2013-05-15 11:13:53');
INSERT INTO `buslocation` VALUES ('33', '25', '0', '1', '1', '108.962976', '34.270264', '0', '0', '2013-05-15 11:15:36');
INSERT INTO `buslocation` VALUES ('34', '25', '0', '1', '1', '108.962917', '34.27346', '0', '0', '2013-05-15 11:19:09');
INSERT INTO `buslocation` VALUES ('35', '25', '0', '1', '1', '108.962885', '34.274755', '0', '0', '2013-05-15 11:23:37');
