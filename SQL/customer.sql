DROP TABLE IF EXISTS `Customer`;
CREATE TABLE `Customer` (
  `customerID` varchar(6) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `Password` varchar(15) DEFAULT NULL,
  `Address` varchar(80) DEFAULT NULL,
  `Shop_ID` varchar(2) DEFAULT NULL,
  `Phone` decimal(20,0) DEFAULT NULL,
  PRIMARY KEY (`customerID`),
  KEY `Shop_ID` (`Shop_ID`),
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`Shop_ID`) REFERENCES `shop` (`Shop_ID`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;