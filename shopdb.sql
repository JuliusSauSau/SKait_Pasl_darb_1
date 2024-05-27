-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: shopdb
-- ------------------------------------------------------
-- Server version	8.0.37

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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `description` text,
  `category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES ('1','Bookshelf','$100','A sturdy wooden bookshelf with three shelves.','Furniture'),('10','Paint Brushes','$10','A set of high-quality paint brushes for art and DIY projects.','Tools'),('11','Flashlight','$8','A compact and bright flashlight for emergencies and outdoor activities.','Tools'),('12','Toolbox','$25','A sturdy toolbox for organizing and carrying tools to job sites.','Tools'),('13','Garden Hose','$20','A durable garden hose for watering plants and washing outdoor surfaces.','Tools'),('14','Drill','$50','A versatile power drill for drilling holes and driving screws.','Tools'),('15','Tape Measure','$7','A reliable tape measure for taking accurate measurements in construction and DIY projects.','Tools'),('16','Paint Roller Kit','$12','A kit containing paint rollers and trays for painting walls and ceilings.','Tools'),('2','Laptop','$800','A sleek and powerful laptop for work and entertainment.','Electronics'),('3','Bluetooth Speaker','$50','A portable speaker with wireless connectivity for music on-the-go.','Electronics'),('4','Coffee Maker','$60','An automatic coffee maker for brewing delicious coffee at home.','Appliances'),('5','Running Shoes','$80','High-quality running shoes with excellent cushioning and support.','Apparel'),('6','Hammer','$20','A versatile tool for driving nails and breaking objects.','Tools'),('7','Nails','$5','Assorted nails for various woodworking and construction projects.','Tools'),('8','Saw','$30','A durable hand saw for cutting through wood and other materials.','Tools'),('9','Screwdriver Set','$15','A set of screwdrivers with different tips for various tasks.','Tools');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-27 15:22:30
