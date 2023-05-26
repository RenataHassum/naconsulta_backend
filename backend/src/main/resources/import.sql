INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Alex', 'Brown', 'masculino', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Maria', 'Green', 'feminino', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('João', 'Gray', 'masculino', 'joao@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Bruno', 'Red', 'masculino', 'bruno@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Rodrigo', 'Black', 'masculino', 'rodrigo@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Ana', 'Tuner', 'feminino', 'ana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Arthur', 'Joplin', 'masculino', 'arthur@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Igor', 'Jackson', 'masculino', 'Igor@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Joana', 'Aguilera', 'feminino', 'joana@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (nome, sobrenome, sexo, email, password) VALUES ('Cristina', 'Houston', 'feminino', 'cristina@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_PACIENTE');
INSERT INTO tb_role (authority) VALUES ('ROLE_MEDICO');
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

INSERT INTO tb_especialidade (nome) VALUES ('Ortopedista');
INSERT INTO tb_especialidade (nome) VALUES ('Clínico Geral');
INSERT INTO tb_especialidade (nome) VALUES ('Neurologista');
INSERT INTO tb_especialidade (nome) VALUES ('Otorrino');
INSERT INTO tb_especialidade (nome) VALUES ('Ginecologista');

INSERT INTO tb_endereco (logradouro, numero, bairro, cep, sala) VALUES ('Rua Downson', '100', 'Downson', '13208050', '2A');
INSERT INTO tb_endereco (logradouro, numero, bairro, cep, sala) VALUES ('Rua Betina', '200', 'Betina', '14208050', '3B');
INSERT INTO tb_endereco (logradouro, numero, bairro, cep, sala) VALUES ('Rua Houston', '300', 'Houston', '15208050', '4C');
INSERT INTO tb_endereco (logradouro, numero, bairro, cep, sala) VALUES ('Rua Liberty', '400', 'Liberty', '16208050', '5D');

INSERT INTO tb_medico (nome, sobrenome, consulta_Valor, convenio, avaliacao, especialidade_id, endereco_id) VALUES ('Alex', 'Brown', 500.00, true, 5.0, 1, 1);
INSERT INTO tb_medico (nome, sobrenome, consulta_Valor, convenio, avaliacao, especialidade_id, endereco_id) VALUES ('Maria', 'Green', 450.00, false, 4.5, 2, 2);
INSERT INTO tb_medico (nome, sobrenome, consulta_Valor, convenio, avaliacao, especialidade_id, endereco_id) VALUES ('João', 'Gray', 350.00, true, 4.7, 3, 3);
INSERT INTO tb_medico (nome, sobrenome, consulta_Valor, convenio, avaliacao, especialidade_id, endereco_id) VALUES ('Bruno', 'Red', 300.00, false, 4.8, 4, 4);
INSERT INTO tb_medico (nome, sobrenome, consulta_Valor, convenio, avaliacao, especialidade_id, endereco_id) VALUES ('Rodrigo', 'Black', 500.00, true, 4.9, 5, 1);

