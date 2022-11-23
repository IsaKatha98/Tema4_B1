package tema4;

import java.util.Scanner;

public class Ejercicio6 {
	
	static boolean esPrimo (int n) {
		
		boolean esPrimo=true;
		
		for (int i=2; i<=n/2; i++) {
			
			esPrimo=false;
			break;
		}
		
		return esPrimo;
	}

	public static void main(String[] args) {
		
		//En el main, declaramos las variables necesarias.
		int num; //Variable número que introducirá el usuario.
		boolean primo;
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por la consola. */
																	
		Scanner sc= new Scanner (System.in);
																	
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
										
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
				
		//Ahora, invocamos la función eco e insertamos la variable num.
		primo= esPrimo(num);
				
		System.out.println(primo);
		
		//Cerramos el escáner.
		sc.close();

	}

}
