

INSERT INTO client (id, name, address) VALUES (1, 'Andela', 'doverska');
INSERT INTO client (id, name, address) VALUES (2, 'Ana', 'odeska');
INSERT INTO client (id, name, address) VALUES (3, 'Gabrijela', 'kominska');
INSERT INTO client (id, name, address) VALUES (4, 'Sandro', 'opuzenska');
INSERT INTO client (id, name, address) VALUES (5, 'Marin', 'zagrebacka');

INSERT INTO device (name, client_Id) VALUES ('Potrosnja vode',1);
INSERT INTO device (name, client_Id) VALUES ('Potrosnja Struje',2);
INSERT INTO device (name, client_Id) VALUES ('Potrosnja Goriva',3);
INSERT INTO device (name, client_Id) VALUES ('Potrosnja Plina',4);
INSERT INTO device (name, client_Id) VALUES ('Mjerenje Temperature',5);

INSERT INTO data (year, month, value, device_id) VALUES ('2022', '12', '256', 1);
INSERT INTO data (year, month, value, device_id) VALUES ('2022', '11', '123', 2);