CREATE TABLE `ingredient` (
  `uuid` binary(16) NOT NULL,
  `rank` int(11) DEFAULT NULL,
  `text` varchar(15000) DEFAULT NULL,
  `product_entity_id` binary(16) DEFAULT NULL,
  PRIMARY KEY (`uuid`),
  KEY `FKrdip1uawcktj6dyo4s7ro01fn` (`product_entity_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci