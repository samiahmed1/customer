DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer`
(
    `customer_id` int unsigned                        NOT NULL AUTO_INCREMENT,
    `name`        varchar(45) COLLATE utf8_unicode_ci NOT NULL,
    `email`       varchar(45) COLLATE utf8_unicode_ci NOT NULL,
    `phone`       varchar(45) COLLATE utf8_unicode_ci NOT NULL,
    `address`     varchar(45) COLLATE utf8_unicode_ci NOT NULL,
    `city`        varchar(45) COLLATE utf8_unicode_ci NOT NULL,
    `state`       varchar(50) COLLATE utf8_unicode_ci NOT NULL,
    `zip_code`    varchar(5) COLLATE utf8_unicode_ci  NOT NULL,
    PRIMARY KEY (`customer_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_unicode_ci COMMENT ='maintains customer details';