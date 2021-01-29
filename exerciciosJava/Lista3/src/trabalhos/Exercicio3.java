package trabalhos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main (String args []){  
		
		Scanner ler= new Scanner(System.in);
		int idade=0, contador21=0, contador50=0;
		while(idade !=-99) {
			System.out.println("Qual a sua idade?");
			idade = ler.nextInt();
			if(idade<21 && idade>=0) {
				contador21++;
			}else if(idade>50){
				contador50++;
			}
		}
		System.out.println("Total de pessoas com menos de 21 anos: "+contador21);
		System.out.println("Total de pessoas com mais de 50 anos: "+contador50);
	}
}