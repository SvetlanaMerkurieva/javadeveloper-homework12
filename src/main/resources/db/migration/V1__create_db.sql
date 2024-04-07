CREATE TABLE client (
    id IDENTITY PRIMARY KEY,
    name VARCHAR (200) CHECK (LENGTH(name) > 2)
);

CREATE TABLE planet (
    id VARCHAR(20) PRIMARY KEY CHECK (id ~ '^[A-Z0-9]+$'),
    name VARCHAR (500)
);

CREATE TABLE ticket (
    id IDENTITY PRIMARY KEY,
    created_at TIMESTAMP WITH TIME ZONE DEFAULT CURRENT_TIMESTAMP,
    client_id BIGINT,
    from_planet_id VARCHAR(20),
    to_planet_id VARCHAR(20)
);

SET TIME ZONE '0:00';



