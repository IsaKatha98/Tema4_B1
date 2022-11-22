package tema4;

import java.util.Scanner;

public class Ejercicio1 {
	
	
	//Definimos una función llamada eco y con parámetro int n, porque queremos un número entero.
	
	static void eco( int n) {
		
		//Queremos que se imprima n veces el mensaje por lo que necesitamos un bucle for.
		for (int i=1; i<=n; i++) {
			
			System.out.println("Eco...");
		}
		
	}

	public static void main(String[] args) {
	
		//En el main, declaramos las variables necesarias.
		int num; //Variable número que introducirá el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
															
		Scanner sc= new Scanner (System.in);
															
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
								
		System.out.print("Introduzca un número y pulse Intro: ");
		num=sc.nextInt();
		
		//Ahora, invocamos la función eco e insertamos la variable num.
		eco(num);
		
		//Cerramos el escáner.
		sc.close();
		
		
	}

}
