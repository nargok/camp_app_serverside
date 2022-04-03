---- drop table ----
DROP TABLE IF EXISTS `member`;

---- create ----
CREATE TABLE member
(
    id bigint NOT NULL AUTO_INCREMENT,
    name varchar(32) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
