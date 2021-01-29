package trabalhos;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
	
		int num;
		System.out.print("Insira o numero:\n");
		num= ler.nextInt();

	
		if(num%2==0 )
		{
			System.out.printf("\nO número é par! E a raiz quadrada dele é: ");
			System.out.println(Math.sqrt(num));
		}
		else
		{
			System.out.printf("\nO número é ímpar! E ele elevado ao quadrado é: ");
			System.out.println(Math.pow(num,2));
		}
		if(num>0){
			System.out.print("\nO número digitado é positivo!");
		}
		if(num<0)
		{
			System.out.print("\nO número digitado é negativo!");	
		}	
	
	}
}

