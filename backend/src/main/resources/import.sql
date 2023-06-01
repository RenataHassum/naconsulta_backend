INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Alex', 'Brown', 'masculino', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Maria', 'Green', 'feminino', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Arthur', 'Gray', 'masculino', 'arthur@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('John', 'Doe', 'masculino', 'john.doe@example.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Emma', 'Johnson', 'feminino', 'emma@example.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Michael', 'Smith', 'masculino', 'michael.smith@example.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Sophia', 'Brown', 'feminino', 'sophia.brown@example.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Daniel', 'Taylor', 'masculino', 'daniel.taylor@example.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('Olivia', 'Johnson', 'feminino', 'olivia.johnson@example.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_Name, last_Name, gender, email, password) VALUES ('William', 'Anderson', 'masculino', 'william.anderson@example.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');
INSERT INTO tb_role (authority) VALUES ('ROLE_DOCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_USER');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 2);

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (5, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (6, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (7, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (8, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (9, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (10, 3);

INSERT INTO tb_specialization (name) VALUES ('Ortopedista');
INSERT INTO tb_specialization (name) VALUES ('Oftalmologia');
INSERT INTO tb_specialization (name) VALUES ('Psiquiatria');
INSERT INTO tb_specialization (name) VALUES ('Nutrologia');

INSERT INTO tb_state (name) VALUES ('São Paulo');
INSERT INTO tb_state (name) VALUES ('Rio de Janeiro');

INSERT INTO tb_city (name, state_id) VALUES ('São Paulo', 1)
INSERT INTO tb_city (name, state_id) VALUES ('Rio de Janeiro', 2)

INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room, city_id) VALUES ('Main Street', '123', 'Downtown', '12345', 'Apt 1B', 1);
INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room, city_id) VALUES ('Park Avenue', '456', 'Downson', '67890', 'Suite 5C', 1);
INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room, city_id) VALUES ('Elm Street', '789', 'Suburbia', '54321', 'Unit 2D', 2);
INSERT INTO tb_address (public_Place, number, neighborhood, zip_Code, room, city_id) VALUES ('Oak Road', '987', 'Woodland', '09876', 'Apt 3A', 2);

INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Alex', 'Brown', 450.00, true, 4.9, 1, 1);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Maria', 'Green', 480.00, false, 5.0, 2, 2);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('Arthur', 'Gray', 380.00, true, 4.9, 3, 3);
INSERT INTO tb_doctor (first_Name, last_Name, appointment_Price, insurance, evaluation, specialization_id, address_id) VALUES ('John', 'Doe', 420.00, false, 4.8, 4, 4);

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-01-01T14:45:00Z', 'fratura no tornozelo', 'dor intensa e inchaço no tornozelo após uma queda', 4, 1, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-02-02T10:30:00Z', 'lesão no ombro', 'dor e dificuldade de movimentação no ombro após atividade física intensa', 8, 1, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-03-03T14:45:00Z', 'dor nas articulações', 'dor no joelho', 5, 1, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-04-04T10:30:00Z', 'fratura no tornozelo', 'inchaço e dificuldade de movimentação após queda', 7, 1, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-05-05T09:30:00Z', 'dor nas costas', 'dor na região lombar', 10, 1, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-06-06T14:45:00Z', 'dor nas articulações', 'dor no joelho', 9, 1, NOW());

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-06-07T11:00:00Z', '', '', 8, 1, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-07-08T16:20:00Z', '', '', 5, 1, NOW());

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-01-09T14:45:00Z', 'dor nos olhos', 'vermelhidão e irritação nos olhos', 9, 2, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-02-10T10:30:00Z', 'visão turva', 'dificuldade em enxergar claramente', 5, 2, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-03-11T14:45:00Z', 'exame de rotina', 'visão embaçada e dificuldade de enxergar à noite', 4, 2, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-04-12T09:30:00Z', 'conjuntivite', 'coceira, vermelhidão e secreção nos olhos', 7, 2, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-05-13T16:20:00Z', 'prescrição de óculos', 'dificuldade em enxergar de perto', 10, 2, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-06-14T11:00:00Z', 'tratamento de glaucoma', 'pressão ocular elevada e perda gradual de visão', 3, 2, NOW());

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-06-15T11:00:00Z', '', '', 4, 2, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-07-16T16:20:00Z', '', '', 9, 2, NOW());

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-01-17T14:45:00Z', 'ansiedade', 'sintomas de ansiedade, como nervosismo e preocupação excessiva', 2, 3, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-02-18T10:30:00Z', 'depressão', 'sintomas de depressão, como tristeza profunda e falta de energia', 7, 3, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-03-19T14:45:00Z', 'depressão', 'tristeza persistente, perda de interesse e baixa energia', 4, 3, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-04-20T09:30:00Z', 'ansiedade', 'preocupação excessiva, inquietação e tensão muscular', 7, 3, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-05-21T16:20:00Z', 'transtorno bipolar', 'mudanças de humor extremas, alternando entre mania e depressão', 10, 3, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-06-22T11:00:00Z', 'transtorno de estresse pós-traumático', 'flashbacks, pesadelos e evitação de gatilhos traumáticos', 5, 3, NOW());

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-06-23T11:00:00Z', '', '', 1, 3, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-07-24T16:20:00Z', '', '', 10, 3, NOW());

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-01-25T14:45:00Z', 'dificuldade para emagrecer', 'dificuldade em perder peso mesmo com dieta e exercícios', 5, 4, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-02-26T10:30:00Z', 'intolerância alimentar', 'sintomas de intolerância a certos alimentos, como inchaço e desconforto abdominal', 8, 4, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-03-27T14:45:00Z', 'deficiência de vitamina D', 'fraqueza muscular e dores ósseas', 3, 4, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-04-28T09:30:00Z', 'intolerância à lactose', 'inchaço abdominal e desconforto após consumo de laticínios', 7, 4, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-05-29T16:20:00Z', 'anemia ferropriva', 'fadiga, palidez e falta de ar', 10, 4, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2023-06-30T11:00:00Z', 'obesidade', 'ganho de peso excessivo e dificuldade em emagrecer', 8, 4, NOW());

INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-06-01T11:00:00Z', '', '', 5, 4, NOW());
INSERT INTO tb_appointment (date, diagnosis, symptom, user_id, doctor_id, created_At) VALUES (TIMESTAMP WITH TIME ZONE '2024-07-02T16:20:00Z', '', '', 3, 4, NOW());
