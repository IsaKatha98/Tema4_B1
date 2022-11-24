package tema4;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Creamos una función numeros, con parámetros dos números enteros.
	static void numeros(int n1, int n2) {
		
		for (int i=n1; i<=n2; i++) {
			
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
	
		//Declaramos las variables.
		
		int num1;//Variable que solicitamos al usuario.
		int num2;//Variable que solicitamos al usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
															
		Scanner sc= new Scanner (System.in);
															
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número y pulse Intro: ");
		num1=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2=sc.nextInt();
		
		//Como queremos presentar los números que haya entre num1 y num2, debemos asegurarnos que num1 es menor que num2.
		//Esto se hace en el main, no en la función.
		if (num1<num2) {
					
			//Invocamos la función.
					
			numeros(num1, num2);
			
		} else {
					
			//Aquí, invocamos la función numeros pero sobreescribimos las variables al revés, para asegurarnos que la pequeña es
			//la primera que se lee.
		
			numeros(num2, num1);
		}
				
		//Cerramos el escáner.
		sc.close();
				
	}

}
