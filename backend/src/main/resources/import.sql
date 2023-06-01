INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Alex', 'Brown', 'masculino', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Maria', 'Green', 'feminino', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('João', 'Gray', 'masculino', 'joao@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_USER');
INSERT INTO tb_role (authority) VALUES ('ROLE_DOCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 3);

INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);

INSERT INTO tb_specialization (name) VALUES ('Ortopedista');
INSERT INTO tb_specialization (name) VALUES ('Clínico Geral');

INSERT INTO tb_state (name) VALUES ('São Paulo');
INSERT INTO tb_state (name) VALUES ('Rio de Janeiro');

INSERT INTO tb_city (name, state_id) VALUES ('São Paulo', 1)
INSERT INTO tb_city (name, state_id) VALUES ('Rio de Janeiro', 2)

INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room, city_id) VALUES ('Rua Downson', '100', 'Downson', '13208050', '2A', 1);
INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room, city_id) VALUES ('Rua Flower', '560', 'Downcarl', '13208050', '2A', 1);

INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Alex', 'Brown', 500.00, true, 5.0, 1, 1);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Maria', 'Green', 350.00, true, 4.8, 2, 1);

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-05-31T19:18:00Z', 'dor1', 'dor1', 3, 1);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-06-20T08:10:00Z', 'dor2', 'dor2', 3, 1);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-06-06T08:10:00Z', 'dor2B', 'dor2B', 3, 1);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-08-05T09:20:00Z', 'dor3', 'dor3', 3, 1);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-09-05T10:30:00Z', 'dor4', 'dor4', 3, 2);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-10-05T11:40:00Z', 'dor5', 'dor5', 3, 2);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-11-05T12:50:00Z', 'dor6', 'dor6', 3, 2);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-12-05T13:50:00Z', 'dor7', 'dor7', 1, 2);
