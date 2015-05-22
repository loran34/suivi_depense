CREATE TABLE `suivi_depenses`.`ordre_mission` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(250) NOT NULL,
  `date_debut` DATETIME NOT NULL,
  `date_fin` DATETIME NOT NULL,
  `numero_om` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));

CREATE TABLE `suivi_depenses`.`type_depense` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(250) NOT NULL,
  `montant` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `description_UNIQUE` (`description` ASC));

CREATE TABLE `suivi_depenses`.`depenses` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `id_ordre_mission` INT UNSIGNED NOT NULL,
  `description` VARCHAR(250) NOT NULL,
  `montant_rembourse` DECIMAL(8,2) NOT NULL,
  `montant_depense` DECIMAL(8,2) NOT NULL,
  `ecart` DECIMAL(8,2) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `depense_om_idx` (`id_ordre_mission` ASC),
  CONSTRAINT `depense_om`
    FOREIGN KEY (`id_ordre_mission`)
    REFERENCES `suivi_depenses`.`ordre_mission` (`id`)
    ON DELETE CASCADE
    ON UPDATE NO ACTION);

