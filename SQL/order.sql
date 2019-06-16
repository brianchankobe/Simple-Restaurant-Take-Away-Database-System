DROP TABLE IF EXISTS `Order`;
CREATE TABLE `Order` (
  `Order_id` varchar(6) NOT NULL,
  `customerID` varchar(6) DEFAULT NULL,
  `date` varchar(20) DEFAULT NULL,
  `Food_List` varchar(500) DEFAULT NULL,
  `Total_Price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`Order_ID`),
  KEY `customerID` (`customerID`),
  CONSTRAINT `order_ibfk_1` FOREIGN KEY (`customerID`) REFERENCES `customer` (`customerID`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
