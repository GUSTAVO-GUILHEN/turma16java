package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CadFun {
	
public static void main(String[] args) {
		
		
		Scanner leia = new Scanner(System.in);
		int matricula,horas;
		int matricula2,horas2;
		String nome,nome2;
		double valorHora,valorHora2;
		double acrescimo;
		char decisao;
		
		System.out.println("Ol� voce � Terceirizado? (S/N)");
		decisao = leia.nextLine().toUpperCase().charAt(0);
		while( decisao != 'S' && decisao !='N')
		{
			System.out.println("Digitou errado!!");
			System.out.println("Ol� voce � Terceirizado? (S/N)");
			decisao = leia.nextLine().toUpperCase().charAt(0);
		}
		
		if (decisao == 'N')
		{
			System.out.println("Ol� Empregado!!");
			System.out.println("Digite sua matricula: ");
			matricula = leia.nextInt();
			leia.nextLine();
			System.out.println("Digite seu nome: ");
			nome = leia.nextLine();
			System.out.println("Digite as horas que trabalhou ");
			horas = leia.nextInt();
			System.out.println("Digite o valor por hora");
			valorHora = leia.nextDouble();
			Empregado cliente1 = new Empregado(nome,matricula,horas,valorHora );
			System.out.println("O salario do primeiro Empregado � " + cliente1.Salario(cliente1.getHoras()));
		}
		
		else if(decisao == 'S')
		{
			
		
			System.out.println("Ol� Empregado numero 2!!");
			System.out.println("Digite sua matricula: ");
			matricula2 = leia.nextInt();
			leia.nextLine();
			System.out.println("Digite seu nome: ");
			nome2 = leia.nextLine();
			System.out.println("Digite as horas que trabalhou ");
			horas2 = leia.nextInt();
			System.out.println("Digite o valor por hora");
			valorHora2 = leia.nextDouble();
			System.out.println("Digite o acrescimo do valor por fora");
			acrescimo = leia.nextDouble();
			Terceiro cliente2 = new Terceiro(horas2,valorHora2,acrescimo);
			System.out.println("O salario do terceirizado � " + cliente2.Salario(cliente2.getHoras()));
		
		}	
	}
}