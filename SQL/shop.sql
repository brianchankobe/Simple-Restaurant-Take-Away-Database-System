DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
  `Shop_ID` varchar(2) NOT NULL,
  `Shop_Name` varchar(20) DEFAULT NULL,
  `Address` varchar(80) DEFAULT NULL,
  `Phone` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`Shop_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `shop` VALUES 
('01','HiTEA(KK Mall Shop)','KK Mall, Lohu District, Shenzhen', '12345678'),
('02','HiTEA(The Mixc--Luohu)','The Mixc, Lohu District, Shenzhen', '21345678'),
('03','HiTEA(Coco Park Shop)','Coco Park, Futian District, Shenzhen', '54321123'),
('04','HiTEA(The Mixs--Nanshan)','The Mixc2, Nanshan District, Shenzhen', '98765432');
UNLOCK TABLES;