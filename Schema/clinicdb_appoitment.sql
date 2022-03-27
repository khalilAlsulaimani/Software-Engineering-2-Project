-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: clinicdb
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `appoitment`
--

DROP TABLE IF EXISTS `appoitment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `appoitment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `time` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `patiantID` int DEFAULT NULL,
  `patiantName` varchar(30) DEFAULT NULL,
  `doctorID` int DEFAULT NULL,
  `doctorName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `patiantID` (`patiantID`),
  KEY `doctorID` (`doctorID`),
  CONSTRAINT `appoitment_ibfk_1` FOREIGN KEY (`patiantID`) REFERENCES `patiant` (`id`),
  CONSTRAINT `appoitment_ibfk_2` FOREIGN KEY (`doctorID`) REFERENCES `doctor` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=61 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `appoitment`
--

LOCK TABLES `appoitment` WRITE;
/*!40000 ALTER TABLE `appoitment` DISABLE KEYS */;
INSERT INTO `appoitment` VALUES (1,8,'0000-00-00',23,'ada wong',2,'Tylor Jackson'),(2,8,'2021-03-04',23,'ada wong',2,'Tylor Jackson'),(3,8,'2021-03-04',23,'ada wong',2,'Tylor Jackson'),(4,8,'2021-03-04',23,'ada wong',2,'Tylor Jackson'),(5,8,'2021-03-04',23,'ada wong',2,'Tylor Jackson'),(6,3,'2021-11-01',23,'ada wong',2002,'majid alsayed'),(7,8,'2021-11-01',23,'ada wong',2,'Tylor Jackson'),(8,8,'2021-11-01',23,'ada wong',2002,'majid alsayed'),(10,8,'2021-11-25',32,'leon kenndy',2002,'majid alsayed'),(11,10,'2021-11-25',32342,'miko',2002,'majid alsayed'),(12,8,'2021-11-25',23,'ada wong',2,'Tylor Jackson'),(13,12,'2021-11-25',32,'leon kenndy',2,'Tylor Jackson'),(17,9,'2021-12-04',23,'ada wong',2,'Tylor Jackson'),(18,8,'2021-12-05',32,'leon kenndy',3,'alexsander flemming'),(19,8,'2021-12-05',32,'leon kenndy',2,'Tylor Jackson'),(20,8,'2022-02-20',23,'ada wong',2,'Tylor Jackson'),(21,9,'2022-02-20',23,'ada wong',2,'Tylor Jackson'),(22,10,'2022-02-20',23,'ada wong',2,'Tylor Jackson'),(23,11,'2022-02-20',23,'ada wong',2,'Tylor Jackson'),(24,8,'2022-02-20',23,'ada wong',3,'alexsander flemming'),(25,9,'2022-02-20',23,'ada wong',3,'alexsander flemming'),(26,10,'2022-02-20',23,'ada wong',3,'alexsander flemming'),(27,11,'2022-02-20',23,'ada wong',3,'alexsander flemming'),(28,8,'2022-02-27',32,'leon kenndy',2,'Tylor Jackson'),(29,9,'2022-02-27',32,'leon kenndy',2,'Tylor Jackson'),(30,10,'2022-02-27',32,'leon kenndy',2,'Tylor Jackson'),(31,11,'2022-02-27',32,'leon kenndy',2,'Tylor Jackson'),(32,12,'2022-02-27',32,'leon kenndy',2,'Tylor Jackson'),(33,15,'2022-02-27',32,'leon kenndy',2,'Tylor Jackson'),(34,8,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(35,9,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(36,10,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(37,11,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(38,12,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(39,13,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(40,14,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(41,14,'2022-03-02',32,'leon kenndy',3,'alexsander flemming'),(42,16,'2022-03-02',32,'leon kenndy',3,'alexsander flemming'),(43,16,'2022-03-02',32,'leon kenndy',2,'Tylor Jackson'),(44,16,'2022-03-01',32,'leon kenndy',3,'alexsander flemming'),(45,15,'2022-03-01',32,'leon kenndy',3,'alexsander flemming'),(46,8,'2022-03-03',32,'leon kenndy',2,'Tylor Jackson'),(47,9,'2022-03-03',32,'leon kenndy',2,'Tylor Jackson'),(48,10,'2022-03-03',32,'leon kenndy',2,'Tylor Jackson'),(49,11,'2022-03-03',32,'leon kenndy',2,'Tylor Jackson'),(50,8,'2022-03-04',32,'leon kenndy',2,'Tylor Jackson'),(51,9,'2022-03-04',32,'leon kenndy',2,'Tylor Jackson'),(52,10,'2022-03-04',32,'leon kenndy',2,'Tylor Jackson'),(53,11,'2022-03-04',32,'leon kenndy',2,'Tylor Jackson'),(54,8,'2022-03-01',32,'leon kenndy',2,'Tylor Jackson'),(55,8,'2022-03-10',32,'leon kenndy',2,'Tylor Jackson'),(56,9,'2022-03-10',32,'leon kenndy',2,'Tylor Jackson'),(57,10,'2022-03-10',32,'leon kenndy',2,'Tylor Jackson'),(58,12,'2022-03-22',32,'leon kenndy',2,'Tylor Jackson'),(59,11,'2022-03-22',32,'leon kenndy',2,'Tylor Jackson'),(60,10,'2022-03-22',32,'leon kenndy',2,'Tylor Jackson');
/*!40000 ALTER TABLE `appoitment` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-27  9:44:38
