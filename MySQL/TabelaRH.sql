create database db_RH;
use db_RH;
create table tb_funcionarios(
	id bigint auto_increment,
    nome varchar(255) not null,
    cargo varchar(255) not null,
    salario decimal(10,2) not null, 
    endereço varchar(300) not null,
    primary key(id)
);

insert into tb_funcionarios(nome, cargo, salario, endereço) values ("João da Silva", "Técnico de TI", 2000.00, "Rua Qualquer, 255");

insert into tb_funcionarios(nome, cargo, salario, endereço) values ("Ana Lima", "Diretora", 8000.00, "Rua dos Ricos, 60");

insert into tb_funcionarios(nome, cargo, salario, endereço) values ("Carlito Teves", "Desenvolvedor Jr.", 1543.21, "Rua da Vida, 135");

insert into tb_funcionarios(nome, cargo, salario, endereço) values ("Joelma Pinheiro", "Recepcionista", 1500.00, "Rua Chimbinha, 412");

insert into tb_funcionarios(nome, cargo, salario, endereço) values ("Bino de Souza", "Caminhoneiro", 3000.00, "Rua da Cilada, 171");

select * from tb_funcionarios;

select nome, cargo, salario, endereço from tb_funcionarios where salario >= 2000;

select nome, cargo, salario, endereço from tb_funcionarios where salario < 2000;

update tb_funcionarios set salario = 4500.00 where id = 5;