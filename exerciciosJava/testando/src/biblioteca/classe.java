package biblioteca;

import java.util.Scanner;

public class classe {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;
		int contador = 0;
		int soma = 0;
		
		System.out.print("Digite um numero de 1 a 9: ");
		numero = ler.nextInt();
		do 
		{
			contador++;
			if (contador <=1)
			{
				System.out.print(contador);
			}
			else 
			{
				System.out.print("+"+contador);
			}
			soma+=contador;
		}
		
		while (contador<numero);
		System.out.print(" = "+soma);
			
		
		
	}

}
