package exercicio7;

import java.util.Scanner;

public class ClassePaciente {

	private String nome;
	private String descricao;
	private int registro;
	
	public void nome( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do paciente: ");
		nome = leia.next();
		
	}
	
	public void codigo()
	{
		Scanner leia = new Scanner(System.in);
		System.out.println("Informe o registro do paciente: ");
		registro = leia.nextInt();
	}
	public void descricao( ) 
	{
		Scanner leia = new Scanner(System.in);
		
		System.out.println("O paciente está bem? Sim / Não :" );
		descricao = leia.next();
	}
	
	public void mostrarTela ()
	{
	System.out.println("\nO paciente: " + nome + "\nCom o registro número: "+ " "+  registro +  " "+ "\nO paciente encontra-se bem?: " + descricao);
	}
	
}
