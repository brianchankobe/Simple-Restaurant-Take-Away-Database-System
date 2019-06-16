DROP TABLE IF EXISTS `Menu`;
CREATE TABLE `Menu` (
  `Item_ID` varchar(6) NOT NULL,
  `Item_name` varchar(40) DEFAULT NULL,
  `Category` varchar(10) DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`Item_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `Menu` VALUES ('000001','Black Tea With Milk Foam 奶盖红玉茗茶','Beverage', 16.00),('000002','Tea With Oreo & Milk Foam 芝士奥利奥奶茶','Beverage', 14.00),('000003','Boba milk tea 波霸奶茶','Beverage', 14.00),('000004','Matcha Latte 抹茶拿铁','Beverage', 21.00), ('000005','French Fries 炸薯条','Food', 10.00), ('000006','Fish & Chips 炸鳕鱼','Food', 18.00),('000007','Beef Noodles 牛肉面','Food', 24.00), ('000008','Curry Beef Rice 咖喱牛肉饭','Food', 26.00);
UNLOCK TABLES;