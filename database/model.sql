CREATE DATABASE IF NOT EXISTS sistema_veiculos;
USE sistema_veiculos;

CREATE TABLE IF NOT EXISTS marca_modelo (
  id INT AUTO_INCREMENT PRIMARY KEY,
  marca VARCHAR(50),
  modelo VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS veiculo (
  id INT AUTO_INCREMENT PRIMARY KEY,
  marca_modelo_id INT,
  ano INT,
  cor VARCHAR(30),
  preco DOUBLE,
  km INT,
  status VARCHAR(30),
  FOREIGN KEY (marca_modelo_id) REFERENCES marca_modelo(id)
);

INSERT INTO marca_modelo (marca, modelo) VALUES
('Honda', 'Civic'),
('Toyota', 'Corolla'),
('Ford', 'Fiesta'),
('Chevrolet', 'Onix'),
('Volkswagen', 'Gol');

INSERT INTO veiculo (marca_modelo_id, ano, cor, preco, km, status) VALUES
(1, 2018, 'Preto', 85000, 56000, 'Disponível'),
(2, 2020, 'Branco', 95000, 30000, 'Disponível'),
(3, 2012, 'Prata', 22000, 120000, 'Vendido'),
(4, 2021, 'Vermelho', 70000, 15000, 'Disponível'),
(5, 2015, 'Azul', 35000, 95000, 'Disponível');

