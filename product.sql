/*
SQLyog Ultimate v12.14 (64 bit)
MySQL - 5.7.27-log 
*********************************************************************
*/
/*!40101 SET NAMES utf8 */;

create table `product` (
	`blockchainId` int (11),
	`productName` varchar (768),
	`category` varchar (768),
	`ipfsImageHash` varchar (768),
	`ipfsDescHash` varchar (768),
	`auctionStartTime` bigint (20),
	`auctionEndTime` bigint (20),
	`price` varchar (768),
	`productCondition` int (11),
	`productStatus` int (11)
); 
