package trabalhos;

	import java.util.Scanner;
		
	public class Exercicio2 {

		public static void main(String[] argss){
	        Scanner ent = new Scanner(System.in);
	        int num, contPar = 0, contImpar = 0;
	        
	        for(int i = 1; i <= 10; i++){
	            System.out.println("Digite o " + i + "º número");
	            num = ent.nextInt();
	            
	            if(num % 2 == 0){
	                contPar++;
	            }

	            // para informar números impares
	            
	            if(num % 2 == 1){
	                contImpar++;
	            }
	            
	        }
	        
	        System.out.println("Foram digitados " + contPar + " números pares ");
	        System.out.print("E " + contImpar + " números ímpares");
	        
	    }
		
		
}