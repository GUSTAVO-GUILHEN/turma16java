create database db_ecommerce;
use db_ecommerce;
create table tb_produtos(
	id bigint auto_increment,
    nome varchar(255) not null,
    marca varchar(255) not null,
    preço decimal(10,2) not null, 
    cor varchar(300) not null,
    primary key(id)
);

insert into tb_produtos(nome, marca, preço, cor) values ("Borracha", "FaberCastle", 3.50, "branca");

insert into tb_produtos(nome, marca, preço, cor) values ("Caderno", "Cadrin", 20.00, "preto");

insert into tb_produtos(nome, marca, preço, cor) values ("Pente", "Loreal", 10.00, "rosa");

insert into tb_produtos(nome, marca, preço, cor) values ("Dicionario", "Michaelis", 50.00, "preto");

insert into tb_produtos(nome, marca, preço, cor) values ("Fone", "Apple", 600.00, "branco");

insert into tb_produtos(nome, marca, preço, cor) values ("Carteira", "Tech12", 20.00, "marrom");

insert into tb_produtos(nome, marca, preço, cor) values ("Mouse", "HMaston", 30.00, "preto");

insert into tb_produtos(nome, marca, preço, cor) values ("Palheta", "Destiny", 2.00, "roxa");

select * from tb_produtos;

select nome, marca, preço, cor from tb_produtos where preço >= 500;

select nome, marca, preço, cor from tb_produtos where preço < 500;

update tb_produtos set preço = 700.00 where id = 7;