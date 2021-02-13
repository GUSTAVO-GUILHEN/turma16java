create database db_escola;
use db_escola;
create table tb_aluno(
	id bigint auto_increment,
    nome varchar(255) not null,
    matricula decimal(10,2) not null,
    ano decimal(10,2) not null, 
    nota decimal(10,2) not null,
    primary key(id)
);

insert into tb_aluno(nome, matricula, ano, nota) values ("Ana", 00001, 1, 5.00);

insert into tb_aluno(nome, matricula, ano, nota) values ("Gabriel", 00002, 2, 6.00);

insert into tb_aluno(nome, matricula, ano, nota) values ("Clara", 00003, 3, 4.00);

insert into tb_aluno(nome, matricula, ano, nota) values ("Breno", 00004, 1, 10.00);

insert into tb_aluno(nome, matricula, ano, nota) values ("José", 00005, 2, 7.50);

insert into tb_aluno(nome, matricula, ano, nota) values ("Jeferson", 00006, 2, 2.00);

insert into tb_aluno(nome, matricula, ano, nota) values ("Matheus", 00007, 3, 8.00);

insert into tb_aluno(nome, matricula, ano, nota) values ("Henrique", 00008, 1, 6.99);

select * from tb_aluno;

select nome, matricula, ano, nota from tb_aluno where nota >= 7.00;

select nome, matricula, ano, nota from tb_aluno where nota < 7.00;

update tb_aluno set nota = 9.00 where id = 8;