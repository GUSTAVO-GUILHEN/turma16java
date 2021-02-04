package Hierarquia;

public class Preguica extends Animal {


	public Preguica(String nome, int idade) 
	{
		super(nome, idade);
	}
	
	
	public void subirArvore()
	{
		System.out.println("Preguica subindo em arvores...");
	}
	
	public void emitirSom()
	{
		System.out.println("AAAAAAHHHHZZZZ");
	}
}