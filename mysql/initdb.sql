CREATE TABLE `test`.`ordre_mission` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(250) NOT NULL,
  `date_debut` DATETIME NOT NULL,
  `date_fin` DATETIME NOT NULL,
  `numero_om` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));
