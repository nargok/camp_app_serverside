---- drop table ----
DROP TABLE IF EXISTS `project`;

---- create ----
CREATE TABLE project
(
    id         bigint       NOT NULL AUTO_INCREMENT,
    title      varchar(255) NOT NULL,
    place      varchar(255) NOT NULL,
    start_date DATE         NOT NULL,
    end_date   DATE         NOT NULL,
    memo       TEXT,
    created_at TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
