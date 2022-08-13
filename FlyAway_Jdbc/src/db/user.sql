use phase2;

CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) not null,
  `email` varchar(255) not null,
  `password` varchar(255) not null,
  PRIMARY KEY (`id`)
);

select * from user;

