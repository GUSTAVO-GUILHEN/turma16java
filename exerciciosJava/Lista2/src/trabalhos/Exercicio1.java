package trabalhos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1;
		int n2;
		int n3;
        int local;
		
		System.out.print("Digite o primeiro n�mero:   \n");
		n1 = ler.nextInt();
		
		System.out.print("Digite o segundo n�mero:    \n");
		n2 = ler.nextInt();
		
		System.out.print("Digite o terceiro n�mero:   \n");
		n3 = ler.nextInt();
		
       if (n1 > n2)
    	   {
    	   local = n1;
    	   }
       else
    	   {
    	   local = n2;
    	   }
       
       if(local > n3)
    	   {
    	   System.out.printf("O n�mero maior �: %d", local);
    	   }
       else
       {
    	   
    	   System.out.printf("O n�mero maior �: %d", n3);
       }
		
	}

}
