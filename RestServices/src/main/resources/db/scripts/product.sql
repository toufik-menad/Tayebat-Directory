CREATE TABLE `product` (
  `id` binary(16) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `product_name` varchar(2000) DEFAULT NULL,
  `product_name_de` varchar(2000) DEFAULT NULL,
  `product_name_en` varchar(2000) DEFAULT NULL,
  `product_name_es` varchar(2000) DEFAULT NULL,
  `product_name_fr` varchar(2000) DEFAULT NULL,
  `product_name_it` varchar(2000) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci