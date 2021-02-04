package Exercicios;

public class ClassePessoa {

	public String nome;
	public String endereco;
	public String telefone;
	
	public ClassePessoa()
	{
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public ClassePessoa(String nome, String endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}
	
	public ClassePessoa(String nome, String endereco, String telefone) 
	{
		super();
		this.nome = nome;
		this.endereco = endereco;	
		this.telefone = telefone;
	}
	
}

