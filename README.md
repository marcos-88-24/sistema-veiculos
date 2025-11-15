Sistema de Gestão de Veículos

Este projeto é um sistema simples de gestão de veículos desenvolvido em Java com integração ao banco de dados MySQL. O objetivo é permitir o controle de informações de marcas, modelos e veículos, seguindo operações básicas de CRUD (Create, Read, Update, Delete).

Funcionalidades do Sistema

Cadastro de marcas e modelos

Cadastro de veículos

Listagem completa dos veículos cadastrados

Atualização de preço, quilometragem e status

Exclusão de veículos

Conexão direta com banco de dados utilizando JDBC

Arquitetura Utilizada (MVC)

O projeto segue o padrão MVC (Model – View – Controller):

Model: classes que representam as entidades do sistema (Veiculo, Marca, Modelo).

Controller: responsável por controlar o fluxo do programa e interagir com o usuário.

Database/DAO: contém a conexão com o MySQL e os comandos SQL para manipulação dos dados.

Essa separação facilita a organização do código, manutenção e futuras melhorias.

Tecnologias Utilizadas

Java

MySQL

JDBC (Driver de conexão)

Como Executar

Criar o banco MySQL usando o arquivo model.sql.

Ajustar usuário e senha do MySQL no arquivo Conexao.java.

Compilar e executar o projeto em qualquer IDE Java (NetBeans, Eclipse, IntelliJ, VSCode, etc.).
