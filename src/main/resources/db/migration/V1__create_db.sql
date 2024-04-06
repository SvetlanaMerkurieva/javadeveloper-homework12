CREATE TABLE client (
    id IDENTITY PRIMARY KEY,
    name VARCHAR (200) CHECK (LENGTH(name) > 2) NOT NULL
);

CREATE TABLE planet (
    id IDENTITY PRIMARY KEY,
    name VARCHAR (500) NOT NULL
);

CREATE TABLE ticket (
    id IDENTITY PRIMARY KEY,
    created_at TIMESTAMP,
    client_id BIGINT,
    from_planet_id BIGINT,
    to_planet_id BIGINT
);

