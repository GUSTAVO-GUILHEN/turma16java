package trabalhos;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		
		Scanner ler= new Scanner(System.in);
		int n, soma=0;
		do {
			System.out.println("Digite um número");
			n=ler.nextInt();
			soma+=n;
		}while(n!=0);
		
		System.out.println("A soma dos números é "+soma);
	}

}
