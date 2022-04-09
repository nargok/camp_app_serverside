---- drop table ----
DROP TABLE IF EXISTS `item`;

---- create ----
CREATE TABLE item
(
    id bigint NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    weight integer NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
