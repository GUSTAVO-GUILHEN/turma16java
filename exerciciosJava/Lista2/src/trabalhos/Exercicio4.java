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
			System.out.printf("\nO n�mero � par! E a raiz quadrada dele �: ");
			System.out.println(Math.sqrt(num));
		}
		else
		{
			System.out.printf("\nO n�mero � �mpar! E ele elevado ao quadrado �: ");
			System.out.println(Math.pow(num,2));
		}
		if(num>0){
			System.out.print("\nO n�mero digitado � positivo!");
		}
		if(num<0)
		{
			System.out.print("\nO n�mero digitado � negativo!");	
		}	
	
	}
}

