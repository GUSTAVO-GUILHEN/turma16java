package Estudos;

import java.util.Locale;
import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //define o tipo de padronização
		//area = base * altura / 2
		Scanner leia = new Scanner(System.in);//instaciar = criar
		double base1, altura1, area1;
		double base2, altura2, area2;
		double base3, altura3, area3;
		double local;
		
		System.out.println("Digite a base do primeiro triangulo: ");
		base1 = leia.nextDouble();
		System.out.println("Digite a altura do primeiro triangulo: ");
		altura1 = leia.nextDouble();
		
		area1 = ((base1 * altura1) / 2 );
		
		System.out.printf("A area do primeiro triangulo informado é %.2f\n", area1);
		
		System.out.println("Digite a base do segundo triangulo: ");
		base2 = leia.nextDouble();
		System.out.println("Digite a altura do segundo triangulo: ");
		altura2 = leia.nextDouble();
		
		area2 = ((base2 * altura2) / 2 );
		
		System.out.printf("A area do segundo triangulo informado é %.2f\n", area2);
		
		System.out.println("Digite a base do terceiro triangulo: ");
		base3 = leia.nextDouble();
		System.out.println("Digite a altura do terceiro triangulo: ");
		altura3 = leia.nextDouble();
		
		area3 = ((base3 * altura3) / 2 );
		
		System.out.printf("A area do terceiro triangulo informado é %.2f", area3);
		
		if (area1>area2 && area1>area3)
 	   {
 	   local = area1;
 	   }
    else
 	   {
 	   local = area2;
 	   }
    
    if(local > area3)
 	   {
 	   System.out.printf("O número maior é: %d", local);
 	   }
    else
    {
 	   
 	   System.out.printf("O número maior é: %d", area3);
    }
		
		

	}

}