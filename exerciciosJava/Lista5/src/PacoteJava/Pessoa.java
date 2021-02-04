package PacoteJava;

public class Pessoa {

	// OBJETIVO DA CLASSE
	
	//ATRIBUTOS
	public String nome;
	public char sexo;
	public int anoNascimento;
	public boolean estaViva;
	
	//CONSTRUTORES - Pedreiros da classe
	/*
	public  Pessoa(String nome)
	{
		this.nome = nome;
	}
	*/
	
	public Pessoa(String nome) {

		this.nome = nome;
		
	}

	public Pessoa(String nome, boolean estaViva) {
		this.nome = nome;
		this.estaViva = estaViva;
	}
}
