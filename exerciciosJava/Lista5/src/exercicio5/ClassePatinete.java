package exercicio5;

import java.util.Scanner;

public class ClassePatinete {

	private String cor;
	private String modelo;
	private int velocidadeAtual;
	
	public void cor( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("A cor do patinete é: ");
		cor = leia.next();
		
	}
	
	public void modelo( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O Modelo é: " );
		modelo = leia.next();
	}
	
	public void velocidadeAtual()
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe a velocidade inicial do patinete: ");
		velocidadeAtual = leia.nextInt();
	}
	
	
	public void mostrarTela ()
	{
	System.out.println("\nA cor do Patinete é: " + cor + " "+ "\nModelo: "+  modelo +  " "+ "\nVelocidade atual: " + velocidadeAtual + "Km/h");
	}
	
}

