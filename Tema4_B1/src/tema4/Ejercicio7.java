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
	
		//Hacemos un bucle que vaya probando los divisores.
		for (int i=1; i<=num; i++) {
		
			//Solicitamos los divisores de num.
			if (num%i==0) {
				
				//De esos divisores, pedimos los números primos, a través de la función esPrimo.
				if (esPrimo(i)) {
				
				 contador++;	
				}
			}
		}
		
		//Devolvemos la variable contador.
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
						
		//Ahora, invocamos la función div e insertamos la variable num.
		resultado= div(num);
						
		System.out.println(num+" tiene "+resultado+" divisores primos.");
				
		//Cerramos el escáner.
		sc.close();

	}

}
