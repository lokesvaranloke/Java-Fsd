use phase2;

CREATE TABLE `flight` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) not null,
  `source` varchar(255) not null,
  `destination` varchar(255) not null,
  `date` varchar(255) not null,
  `time` varchar(255) not null,
  `price` int(20) not null,
  PRIMARY KEY (`id`)
);