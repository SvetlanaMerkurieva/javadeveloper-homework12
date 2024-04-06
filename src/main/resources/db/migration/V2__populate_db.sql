INSERT INTO client
(name)
VALUES
('Valentyn Perlovko'),
('Ruslan Velychko'),
('Tetyana Mastoluk'),
('Iryna Skrypnik'),
('Yriy Ignor'),
('Katerina Sosedko'),
('Anton Peremozhets'),
('Oleksander Potroshko'),
('Volodymyr Zverev'),
('Svitlana Merkurieva');

INSERT INTO planet
(name)
VALUES
('Mars'),
('Merkuriy'),
('Earth'),
('Saturn'),
('Uran');

INSERT INTO ticket
(created_at, client_id, from_planet_id, to_planet_id)
VALUES
('2024-04-04 05:38:15', 1, 3, 1),
('2024-04-04 05:38:20', 2, 3, 2),
('2024-04-04 05:38:32', 3, 3, 4),
('2024-04-04 05:38:49', 4, 3, 5),
('2024-04-04 05:38:58', 5, 3, 1),
('2024-04-04 05:39:04', 6, 3, 2),
('2024-04-04 05:39:28', 7, 3, 4),
('2024-04-04 05:40:36', 8, 3, 5),
('2024-04-04 05:41:44', 9, 3, 1),
('2024-04-04 05:45:12', 10, 2, 3);