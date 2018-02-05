-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: restaurante
-- ------------------------------------------------------
-- Server version	8.0.1-dmr-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `menu` (
  `nombre` varchar(50) DEFAULT NULL,
  `CDisponible` int(11) DEFAULT NULL,
  `TPreparacion` int(11) DEFAULT NULL,
  `categoria` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `menu`
--

LOCK TABLES `menu` WRITE;
/*!40000 ALTER TABLE `menu` DISABLE KEYS */;
INSERT INTO `menu` VALUES ('caldo de bola',20,10,'sopas'),('caldo de pata',20,10,'sopas'),('caldo de gallina',20,10,'sopas'),('caldo de mondongo',20,10,'sopas'),('caldo de vagre',20,10,'sopas'),('sancocho de pescado',20,10,'sopas'),('chupe de pescado',20,10,'sopas'),('sancocho blanco',20,10,'sopas'),('guatita',20,10,'Arroces'),('arroz con menestra y chuleta',20,14,'Arroces'),('arroz con menestra y carne',20,14,'Arroces'),('arroz con menestra y pollo',20,15,'Arroces'),('Arroz con pesacado frito',20,12,'Arroces'),('cazuela',20,12,'Arroces'),('pollo hornado con ensalada',20,12,'Arroces'),('ensalada rusa',20,13,'ensaladas'),('ensalada de verduras',20,13,'ensaladas'),('ensalada de camaron',20,13,'ensaladas'),('ensalada de pollo',20,18,'ensaladas'),('ensalada de veteraba',20,18,'ensaladas'),('coca cola',20,5,'gaseosas'),('fioravanti',20,5,'gaseosas'),('sprite',20,5,'gaseosas'),('inca cola',20,5,'gaseosas'),('all natural',20,5,'aguas'),('dasanni',20,5,'aguas'),('cielo',20,5,'aguas'),('guiti',20,5,'aguas'),('pilsener',20,5,'alcohol'),('club verde',20,5,'alcohol'),('club premium roja',20,5,'alcohol'),('brahma',20,5,'alcohol'),('naranja',20,5,'jugos naturales'),('mora',20,5,'jugos naturales'),('maracuya',20,5,'jugos naturales'),('limon',20,5,'jugos naturales'),('papaya',20,5,'jugos naturales');
/*!40000 ALTER TABLE `menu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-02-04 19:36:24
