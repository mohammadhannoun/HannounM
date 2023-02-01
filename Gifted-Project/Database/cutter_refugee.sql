CREATE DATABASE  IF NOT EXISTS `cutter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cutter`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: cutter
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `refugee`
--

DROP TABLE IF EXISTS `refugee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `refugee` (
  `refugee_id` varchar(100) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `email` varchar(254) NOT NULL,
  `phone_number` char(10) NOT NULL,
  `pass` varchar(254) NOT NULL,
  `birth_date` varchar(15) NOT NULL,
  PRIMARY KEY (`refugee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `refugee`
--

LOCK TABLES `refugee` WRITE;
/*!40000 ALTER TABLE `refugee` DISABLE KEYS */;
INSERT INTO `refugee` VALUES (' ',' ',' ',' ','',' ','2022-07-08'),('10010','sami','romman','samiromman@yahoo.com','0790328966','123456','2005-12-28'),('123','sanaa','aldaleel','sanaa@gmail.com','0790321568','123456789','1964-04-16'),('1234','Mohmmad','Hannoun','mohmmadhannoun76@gmail.com','0798981260','1234','2002-12-29'),('12344','yousef','ahmad','yousefahmad22@gmail.com','0790321653','hadsvbiabv233#','2002-01-12'),('20120042','Mohammad','Eyad','hannounmohmmad6@gmail.com','0798989898','1010','2002-12-29'),('4321','Just','Someone','JustSomeone@Gmail.com','0798589585','31556','2002-12-25'),('995','rond','Ahmad','ramisam@gmail.com','0791212586','55','2001-12-05');
/*!40000 ALTER TABLE `refugee` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-21 13:38:57
