-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: megrendelesek
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `rendeles`
--

DROP TABLE IF EXISTS `rendeles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rendeles` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rendeloid` int DEFAULT NULL,
  `osszeg` int DEFAULT NULL,
  `darabszam` int DEFAULT NULL,
  `teljesitve` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rendeles`
--

LOCK TABLES `rendeles` WRITE;
/*!40000 ALTER TABLE `rendeles` DISABLE KEYS */;
INSERT INTO `rendeles` VALUES (1,1,500,1111,1),(2,2,300,2,1),(4,4,4411,23,1),(7,6,23200,11,0),(8,7,45000,22,0),(9,7,12300,12,1),(10,7,1230,1,1),(11,8,123000,33,1),(12,8,100000,11,0),(13,7,12000,5,0),(16,17,200,2,0),(17,4,2232,33,1);
/*!40000 ALTER TABLE `rendeles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `szemely`
--

DROP TABLE IF EXISTS `szemely`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `szemely` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nev` varchar(45) COLLATE utf8mb3_hungarian_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8mb3_hungarian_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_hungarian_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `szemely`
--

LOCK TABLES `szemely` WRITE;
/*!40000 ALTER TABLE `szemely` DISABLE KEYS */;
INSERT INTO `szemely` VALUES (1,'Nagy Béla','arany@kaki.hu'),(2,'Jó Irén','nunus@gmail.com'),(4,'Jó Jancsii','kdfigik@ggiig.hu'),(6,'Gáspár Dávid','davidg@gmail.com'),(7,'Kiss Kázmér','kk1234@gmail.com'),(8,'Nagy Elemér','varta@gmail.com'),(16,'Nagy Miklós','telapo@gmail.com'),(17,'Joó Róbert','joorobi@citromail.hu'),(19,'Kovács Bélabá','kakimaki@kuki.hu'),(22,'Mukika','Maki@mukimaki.hu'),(24,'Vazul néni','tekerd@lea.hangerot');
/*!40000 ALTER TABLE `szemely` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-19 17:57:03
