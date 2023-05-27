INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Alex', 'Brown', 'masculino', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Maria', 'Green', 'feminino', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('João', 'Gray', 'masculino', 'joao@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Bruno', 'Red', 'masculino', 'bruno@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Rodrigo', 'Black', 'masculino', 'rodrigo@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Ana', 'Tuner', 'feminino', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Arthur', 'Joplin', 'masculino', 'arthur@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Igor', 'Jackson', 'masculino', 'igor@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Joana', 'Aguilera', 'feminino', 'joana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Cristina', 'Houston', 'feminino', 'cristina@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_USER');
INSERT INTO tb_role (authority) VALUES ('ROLE_DOCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 3);

INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 3);

INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);

INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 2);

INSERT INTO tb_user_role (user_id, role_id) VALUES (5, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (5, 2);

INSERT INTO tb_user_role (user_id, role_id) VALUES (6, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (7, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (8, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (9, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (10, 1);

INSERT INTO tb_specialization (name) VALUES ('Ortopedista');
INSERT INTO tb_specialization (name) VALUES ('Clínico Geral');
INSERT INTO tb_specialization (name) VALUES ('Neurologista');
INSERT INTO tb_specialization (name) VALUES ('Otorrino');
INSERT INTO tb_specialization (name) VALUES ('Ginecologista');

INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room) VALUES ('Rua Downson', '100', 'Downson', '13208050', '2A');
INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room) VALUES ('Rua Betina', '200', 'Betina', '14208050', '3B');
INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room) VALUES ('Rua Houston', '300', 'Houston', '15208050', '4C');
INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room) VALUES ('Rua Liberty', '400', 'Liberty', '16208050', '5D');

INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Alex', 'Brown', 500.00, true, 5.0, 1, 1);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Maria', 'Green', 450.00, false, 4.5, 2, 2);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('João', 'Gray', 350.00, true, 4.7, 3, 3);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Bruno', 'Red', 300.00, false, 4.8, 4, 4);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Rodrigo', 'Black', 500.00, true, 4.9, 5, 1);

INSERT INTO tb_telephone (telephone, user_id) VALUES ('11998765431', 1);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11898765432', 1);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11798765433', 2);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11698765434', 2);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11598765435', 3);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11498765436', 3);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11398765437', 4);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11298765438', 4);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11198765439', 5);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11098765431', 5);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11998765432', 6);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11898765433', 7);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11798765434', 8);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11698765435', 9);
INSERT INTO tb_telephone (telephone, user_id) VALUES ('11598765436', 10);

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2020-07-05T07:00:00Z', 'Lombalgia', 'Dores fortes na lombar', 10, 1);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-08-06T08:10:00Z', 'Bursite', 'Dores no ombro', 9, 1);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-09-07T09:20:00Z', 'Sinusite', 'Dores de cabeça', 8, 2);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-10-08T10:30:00Z', 'Rinite', 'Alergia respiratória', 7, 2);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2020-11-09T11:40:00Z', 'AVC', 'Confusão mental', 6, 3);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-12-10T12:50:00Z', 'Enxaqueca', 'Sensibilidade luz, som e dores de cabeça', 5, 3);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2022-01-11T13:60:00Z', 'Desvio do septo', 'Dificuldade respirar, coriza', 7, 4);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-02-12T14:00:00Z', 'Amigdalite', 'Mau hálito, inchaço dos gânglios', 3, 4);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2020-03-13T15:10:00Z', 'Candidíase', 'Ardor vaginal', 9, 5);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2021-04-14T16:20:00Z', 'Nódulo benigno no seio esquerdo', 'Desconforto', 6, 5);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2020-07-05T07:00:00Z', 'Covid', 'Febre alta', 10, 2);
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id) VALUES (TIMESTAMP WITH TIME ZONE '2023-11-12T09:00:00Z', '', '', 7, 1);