CREATE DATABASE jovem_programador;

USE jovem_programador;

CREATE TABLE produtos(
id INT primary key auto_increment,
nome varchar(50),
marca varchar(50),
preco decimal(10,2),
quantidade int,
data date,
categoria varchar(50)
);

select * from produtos;
