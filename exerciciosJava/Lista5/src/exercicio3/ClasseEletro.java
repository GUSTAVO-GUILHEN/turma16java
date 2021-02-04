package exercicio3;

import java.util.Scanner;

public class ClasseEletro {

	private String marca;
	private String modelo;
	private int produto;
	
	public void marca( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a marca do produto: ");
		marca = leia.next();
		
	}
	
	public void modelo( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O Modelo é: " );
		modelo = leia.next();
	}
	
	public void codigo()
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o codigo do produto: ");
		produto = leia.nextInt();
	}
	
	public void mostrarTela ()
	{
	System.out.println("\n" + marca + " "+ "Modelo: "+  modelo +  " "+ "Codigo: " + produto);
	}
	
}

