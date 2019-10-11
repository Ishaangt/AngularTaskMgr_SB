-- Adminer 4.7.3 MySQL dump

SET NAMES utf8;
SET time_zone = '+00:00';
SET foreign_key_checks = 0;
SET sql_mode = 'NO_AUTO_VALUE_ON_ZERO';

SET NAMES utf8mb4;

CREATE DATABASE `taskmgr` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `taskmgr`;

DROP TABLE IF EXISTS `MEMBERS`;
CREATE TABLE `MEMBERS` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) NOT NULL,
  `STATUS` varchar(255) NOT NULL,
  `REGION_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FKb7i1nf9s4sibn8vunvgyop0yu` (`REGION_ID`),
  CONSTRAINT `FKb7i1nf9s4sibn8vunvgyop0yu` FOREIGN KEY (`REGION_ID`) REFERENCES `REGION` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `MEMBERS` (`ID`, `NAME`, `STATUS`, `REGION_ID`) VALUES
(1,	'Soumyajyoti',	'Available',	1),
(2,	'Pratik P',	'Available',	1),
(3,	'Shubham Sharma',	'Busy',	1),
(4,	'RajKiran',	'Busy',	1),
(5,	'Nidhi Tyagi',	'Available',	4),
(6,	'Aparna Tyagi',	'Available',	4),
(7,	'Santosh Sarani',	'Busy',	4),
(8,	'Kushal Verma',	'Busy',	4),
(9,	'Rahul Kumar',	'Available',	2),
(10,	'Rahul Agarwal',	'Available',	2),
(11,	'Ajay Rana',	'Busy',	2),
(12,	'Nitish Singh',	'Busy',	2),
(13,	'Ishaan Gupta',	'Available',	3),
(14,	'Mayank Walia',	'Available',	3),
(15,	'Rahul Lahiri',	'Busy',	3),
(16,	'Amit M',	'Busy',	3);

DROP TABLE IF EXISTS `PROJECTS`;
CREATE TABLE `PROJECTS` (
  `PROJECT_ID` int(11) NOT NULL,
  `DATE_OF_START` datetime DEFAULT NULL,
  `PROJECT_NAME` varchar(255) DEFAULT NULL,
  `TEAM_SIZE` int(11) DEFAULT NULL,
  PRIMARY KEY (`PROJECT_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `PROJECTS` (`PROJECT_ID`, `DATE_OF_START`, `PROJECT_NAME`, `TEAM_SIZE`) VALUES
(110,	'2019-09-26 11:34:08',	'Siterra',	2);

DROP TABLE IF EXISTS `REGION`;
CREATE TABLE `REGION` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `REGION` varchar(100) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `REGION` (`ID`, `REGION`) VALUES
(1,	'North'),
(2,	'South'),
(3,	'East'),
(4,	'West');

DROP TABLE IF EXISTS `REGION_SUMMARY`;
CREATE TABLE `REGION_SUMMARY` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `REGION` varchar(255) NOT NULL,
  `TEAM_MEM_COUNT` int(11) NOT NULL,
  `TMP_UNV_MEM` int(11) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `REGION_SUMMARY` (`ID`, `REGION`, `TEAM_MEM_COUNT`, `TMP_UNV_MEM`) VALUES
(1,	'East',	20,	4),
(2,	'West',	15,	2),
(3,	'South',	25,	7),
(4,	'North',	10,	0);

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1),
(1);

-- 2019-10-11 17:27:15
