CREATE TABLE IF NOT EXISTS client(
   client_id bigint PRIMARY KEY,
   name varchar(30) NOT NULL
);

CREATE SEQUENCE IF NOT EXISTS client_id_client_id_seq
START WITH 1 INCREMENT BY 1;