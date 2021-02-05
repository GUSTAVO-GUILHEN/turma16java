package Hierarquia;

public class Preguica extends Animal{

	
	public Preguica(String nome, int idade) {
		super(nome, idade);
		
	}
	public String arvore() {
		return "Subir em árvores";
	}
	public String somPreguica() {
		return "Bocejar";
	}

}