CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `quantity` int(45) DEFAULT NULL,
  `description` varchar(450) DEFAULT NULL,
  `photo` varchar(45) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL,
  `createiondate` datetime   DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
)