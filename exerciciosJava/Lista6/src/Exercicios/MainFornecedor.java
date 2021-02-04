package Exercicios;

import java.util.Scanner;

public class MainFornecedor {

	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		String nome,  endereco, telefone;
		double valorCredito,  valorDivida;
		
		System.out.println("Ola Fornecedor!!");
		
		System.out.println("Digite o seu nome ");
		nome = leia.nextLine();
		
		System.out.println("Digite o seu endereço ");
		endereco = leia.nextLine();
		
		System.out.println("Digite o seu telefone ");
		telefone = leia.nextLine();
		
		System.out.println("Digite o valor do Credito ");
		valorCredito = leia.nextDouble();
		
		System.out.println("Digite o valor da Divida ");
		valorDivida = leia.nextDouble();
		
		ClasseFornecedor cliente1 = new ClasseFornecedor(nome,endereco, telefone, valorCredito,  valorDivida);
		
		cliente1.ObterSaldo();
		
	}

}