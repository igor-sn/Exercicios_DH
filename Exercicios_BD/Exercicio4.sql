CREATE DATABASE empresa;

USE empresa;

CREATE TABLE depto(
	depto_nro VARCHAR(7) PRIMARY KEY,
    nome_depto VARCHAR(30) NOT NULL,
    localizacao VARCHAR(30) NOT NULL);
    
INSERT INTO depto VALUES 
    ("D-000-1", "Software", "Los Tigres"),
	("D-000-2", "Sistemas", "Guadalupe"),
	("D-000-3", "Contabilidade", "La Roca"),
	("D-000-4", "Vendas", "Plata");


CREATE TABLE funcionario(
	cod_fuc VARCHAR(6) PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    sobrenome VARCHAR(30) NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    data_alta VARCHAR(30) NOT NULL,
    salario BIGINT NOT NULL,
    comissão  BIGINT NOT NULL,
    depto_nro VARCHAR(7) NOT NULL,
    CONSTRAINT fk_FunDepto FOREIGN KEY (depto_nro) REFERENCES depto (depto_nro));

INSERT INTO funcionario 
VALUES ("E-0001", "César", "Piñero", "Vendedor", "12/05/2018", 80000, 15000, "D-000-4"),
("E-0002", "Yosep", "Kowaleski", "Analista", "14/07/2015", 140000, 0, "D-000-2"),
("E-0003", "Mariela", "Barrios", "Diretor", "05/06/2014", 185000, 0, "D-000-3"),
("E-0004", "Jonathan", "Aguilera", "Vendedor", "03/06/2015", 85000, 10000, "D-000-4"),
("E-0005", "Daniel", "Brezezicki", "Vendedor", "03/03/2018", 83000, 10000, "D-000-4"),
("E-0006", "Mito", "Barchuk", "Presidente", "05/06/2014", 190000, 0, "D-000-3"),
("E-0007", "Emilio", "Galarza", "Desenvolvedor", "02/08/2014", 60000, 0, "D-000-1");

/*1. Selecione o nome, cargo e localização dos departamentos onde os vendedores
trabalham.*/
SELECT f.nome, f.cargo, d.nome_depto, d.localizacao
FROM funcionario f
INNER JOIN depto d ON f.depto_nro = d.depto_nro
WHERE f.cargo="Vendedor";

/*2. Visualize departamentos com mais de cinco funcionários.*/
SELECT d.nome_depto, COUNT(f.nome) AS qtd_func
FROM funcionario f
INNER JOIN depto d ON f.depto_nro = d.depto_nro
GROUP BY d.nome_depto
HAVING qtd_func > 5;

/*3. Exiba o nome, salário e nome do departamento dos funcionários que têm o mesmo
cargo que 'Mito Barchuk'.*/
SELECT f.nome, f.cargo, f.salario, d.nome_depto
FROM funcionario f
INNER JOIN depto d ON f.depto_nro = d.depto_nro
WHERE f.cargo IN (SELECT cargo FROM funcionario WHERE nome = "Mito Barchuk");

/*4. Mostre os dados dos funcionários que trabalham no departamento de contabilidade,
ordenados por nome.*/
SELECT f.nome, d.nome_depto
FROM funcionario f
INNER JOIN depto d ON f.depto_nro = d.depto_nro
WHERE d.nome_depto = "Contabilidade"
ORDER BY f.nome;

/*5. Mostre o nome do funcionário que tem o menor salário.*/
SELECT nome, sobrenome
FROM funcionario
WHERE salario = (SELECT MIN(salario) FROM funcionario);

/*6. Mostre os dados do funcionário que tem o maior salário no departamento 'Vendas'.*/
SELECT f.nome, f.sobrenome, f.cargo, f.salario, f.comissão, d.nome_depto
FROM funcionario f
INNER JOIN depto d ON f.depto_nro = d.depto_nro
AND f.salario = (SELECT MAX(salario) FROM funcionario f
INNER JOIN depto d ON f.depto_nro = d.depto_nro
WHERE d.nome_depto = "Vendas")
LIMIT 1;


