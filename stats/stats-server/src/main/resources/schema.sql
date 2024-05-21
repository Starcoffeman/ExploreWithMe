DROP TABLE IF EXISTS hits CASCADE;

CREATE TABLE IF NOT EXISTS hits
(
    id    BIGINT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY NOT NULL,
    app  VARCHAR(255)                                NOT NULL,
    uri VARCHAR(512)                                NOT NULL,
    ip VARCHAR(512) NOT NULL,
    timestamp TIMESTAMP WITHOUT TIME ZONE
);