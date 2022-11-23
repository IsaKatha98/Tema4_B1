package tema4;

import java.util.Scanner;

public class Ejercicio7 {
	
	//Estblacemos una función para saber si un número es primo o no.
	static boolean esPrimo (int n) {
		
		boolean esPrimo=true;
		
		for (int i=2; i<=n/2; i++) {
			
			esPrimo=false;
			break;
		}
		
		return esPrimo;
	}
	
	//Hacemos otra función que utilice la anterior y cuyos paramétros será un número real.
	static int div (int num) {
		
		//Establecemos una variable contador.
		int contador=0;
		boolean primo;
		int resultado;
		
		//Hacemos un bucle que vaya probando los divisores.
		for (int i=1; i<=num; i++) {
			
			//Pedimos los números primos.
			primo=esPrimo(i);
			
			if (primo=true) {
				
				 resultado=num%i;
				 
				 System.out.println(i);
				 
				 contador++;
				
			}
			
		
		}
		
		return contador;
	}

	public static void main(String[] args) {
	
		//En el main, declaramos las variables necesarias.
		int num; //Variable número que introducirá el usuario.
		int resultado;
						
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por la consola. */
																			
		Scanner sc= new Scanner (System.in);
																			
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
												
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
						
		//Ahora, invocamos la función eco e insertamos la variable num.
		resultado= div(num);
						
		System.out.println(resultado);
				
		//Cerramos el escáner.
		sc.close();

	}

}
