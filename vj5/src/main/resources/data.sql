INSERT INTO device (name) VALUES ('Potrosnja vode');
INSERT INTO device (name) VALUES ('Potrosnja Struje');

INSERT INTO client (id, name, address, device_id) VALUES (1, 'Andela', 'split', 1);
INSERT INTO client (id, name, address, device_id) VALUES (2, 'Ana', 'ploce', 2);

INSERT INTO data (year, month, value, device_id) VALUES ('2022', '12', '256', 1);
INSERT INTO data (year, month, value, device_id) VALUES ('2022', '11', '134', 2);