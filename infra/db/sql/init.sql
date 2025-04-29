CREATE SCHEMA healenium AUTHORIZATION healenium_user;
GRANT USAGE ON SCHEMA healenium TO healenium_user;
                      -- Create Liquibase internal tables
CREATE TABLE IF NOT EXISTS databasechangeloglock (
                                                     id INT NOT NULL,
                                                     locked BOOLEAN NOT NULL,
                                                     lockgranted TIMESTAMP,
                                                     lockedby VARCHAR(255),
    PRIMARY KEY (id)
    );

INSERT INTO databasechangeloglock (id, locked) VALUES (1, false);

CREATE TABLE IF NOT EXISTS databasechangelog (
                                                 id VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    filename VARCHAR(255) NOT NULL,
    dateexecuted TIMESTAMP NOT NULL,
    orderexecuted INT NOT NULL,
    exectype VARCHAR(10) NOT NULL,
    md5sum VARCHAR(35) NULL,
    description VARCHAR(255) NULL,
    comments VARCHAR(255) NULL,
    tag VARCHAR(255) NULL,
    liquibase VARCHAR(20) NULL,
    PRIMARY KEY (id, author, filename)
    );
