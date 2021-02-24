CREATE TABLE IF NOT EXISTS currency_api_ussage (
         id int8 NOT NULL,
         nazwa varchar(128) DEFAULT NULL,
         data_zakupu timestamp without time zone,
         kolor varchar(128) DEFAULT NULL
);
