DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
  `workerID` varchar(6) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `Phone` decimal(10,0) DEFAULT NULL,
  `Shop_ID` varchar(2) DEFAULT NULL,
  `Address` varchar(80) DEFAULT NULL,
  PRIMARY KEY (`workerID`),
  KEY `Shop_ID` (`Shop_ID`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`Shop_ID`) REFERENCES `shop` (`Shop_ID`) ON DELETE SET NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

insert into `employee` VALUES ('000001','Brian','11111111','01','Luo Wu District'), 
('000002','Leo','11111112','02','Nanshan District'),('000003','Amy','1111113','03','Futian District'),
('000004','Tom','1111114','04','Yantian District');