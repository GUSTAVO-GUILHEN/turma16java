package trabalhos;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

				Scanner ler = new Scanner (System.in);
				
				int idade;
				
				System.out.print("Insira a idade do nadador:\n");
				idade= ler.nextInt();
				
				if(idade>= 10 && idade<=14)
				{
					System.out.print("Infantil");
				}
				else if(idade>= 15 && idade<=17)
				{
					System.out.print("Juvenil");
				}
				else if(idade>= 18 && idade <=25) 
				{
					System.out.print("Adulto");
				}
				else
				{
					System.out.print("Idade inv�lida!");
				}
				
			}

		
	}

