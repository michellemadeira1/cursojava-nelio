package DoWhile;

/* Fazer um programa para ler uma temperatura em celsius e mostrar o equivalente em Fahrenheit.Perguntar se o usuário deseja
repetir (s/n).Caso o usuário digite “s” ,repetir o programa.*/


import java.util.Locale;
import java.util.Scanner;

public class facaEnquanto {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner (System.in);
		
		
		char resp ;
		
	
		
	     do {
	    	 
			System.out.print("Digite a temperatura em celsius: ");
		 double c = sc.nextDouble();
		double	F = 9.0 * c / 5.0 + 32.0;
			
			System.out.printf("Equivalete em fahrenheit: %.2f%n",F);
			
			System.out.println("Deseja repetir (s/n)?");
			 resp= sc.next().charAt(0);
			
		}	while (resp != 'n');
		
		
		sc.close();
	}

}
