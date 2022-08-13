use phase2;

CREATE TABLE `admin` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) not null,
  `email` varchar(255) not null,
  `password` varchar(255) not null,
  PRIMARY KEY (`id`)
);

insert into admin (name, email, password) values ('admin1','admin1@gmail.com','admin1');
select * from admin;

