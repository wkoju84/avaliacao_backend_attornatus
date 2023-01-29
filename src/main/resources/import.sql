INSERT INTO pessoa (nome, data_nascimento, endereco_atual) VALUES ('Lewis Hamilton', '11/11/1991', TRUE);
INSERT INTO pessoa (nome, data_nascimento, endereco_atual) VALUES ('Fabiano', '02/08/1984', FALSE);
INSERT INTO pessoa (nome, data_nascimento, endereco_atual) VALUES ('Vitória Alencar', '20/12/1989', TRUE);
INSERT INTO pessoa (nome, data_nascimento, endereco_atual) VALUES ('Hugo Martins', '30/01/1990', FALSE);
INSERT INTO pessoa (nome, data_nascimento, endereco_atual) VALUES ('Pâmela Martins', '23/03/2006', TRUE);
INSERT INTO pessoa (nome, data_nascimento, endereco_atual) VALUES ('Róger Guedes', '27/07/1987', FALSE);

INSERT INTO endereco (logradouro, cep, numero, cidade) VALUES ('Rua Farroupilha', '09911-211', 's/n', 'Porto Alegre');
INSERT INTO endereco (logradouro, cep, numero, cidade) VALUES ('Rua Osmar Santos', '09956-541', '522', 'Pedroso');
INSERT INTO endereco (logradouro, cep, numero, cidade) VALUES ('Rua da Caçamba', '09878-011', '10', 'Porto de Galinhas');
INSERT INTO endereco (logradouro, cep, numero, cidade) VALUES ('Rua Elisa Oliveira', '09999-100', '3452', 'Amargosa');
INSERT INTO endereco (logradouro, cep, numero, cidade) VALUES ('Rua das Belezas', '09984-015', '1022', 'Sorocaba');


INSERT INTO pessoa_endereco (pessoa_id, endereco_id) VALUES (1, 3);
INSERT INTO pessoa_endereco (pessoa_id, endereco_id) VALUES (2, 2);
INSERT INTO pessoa_endereco (pessoa_id, endereco_id) VALUES (3, 1);
INSERT INTO pessoa_endereco (pessoa_id, endereco_id) VALUES (2, 3);
INSERT INTO pessoa_endereco (pessoa_id, endereco_id) VALUES (4, 2);
INSERT INTO pessoa_endereco (pessoa_id, endereco_id) VALUES (5, 3);