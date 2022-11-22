package tema4;

import java.util.Scanner;

public class Ejercicio2 {
	
	//Creamos una función numeros, con parámetros dos números enteros.
	static void numeros(int n1, int n2) {
		
		//Como queremos presentar los números que haya entre n1 y n2, creamos una condición para distinguir el número mayor del menor.
		if (n1>n2) {
			
			//Ahora hacemos un bucle for para que imprima lo que queremos.
			for (int i=n2; i<=n1; i++) {
				
				System.out.println(i);
			}
		
		} else {
			
			for (int i=n1; i<n2; i++) {
				
				System.out.println(i);
			}
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
		
		//Ahora, invocamos la función eco e insertamos la variable num.
		
		numeros(num1,num2);
				
		//Cerramos el escáner.
		sc.close();
				

	}

}
