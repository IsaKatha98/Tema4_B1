package tema4;

import java.util.Scanner;

public class Ejercicio4 {
	
	//Creamos una función mayor, con parámetros dos números enteros.
	static int mayor (int n1, int n2) {
		
		//Declaramos una variable donde se guardará el valor mayorm, y la inicializamos como n1.
		int max=n1;
		
		//Para distinguir cuál es el mayor de los dos, utilizaremos una condición if-else.
		if (n2>n1) {
			
			max=n2;
		}
		
		//Devolvemos el resultado de la condición.
		return max;
	}

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num1;//Variable que solicitamos al usuario.
		int num2;//Variable que solicitamos al usuario.
		int resultado;//Variable que mostrará el resultado de la función.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por la consola. */
																	
		Scanner sc= new Scanner (System.in);
																	
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
										
		System.out.print("Introduzca un número y pulse Intro: ");
		num1=sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2=sc.nextInt();
				
		//Ahora, invocamos la función mayor e insertamos las variables num. El resultado de la función se guardará en la variable resultado.
				
		resultado = mayor(num1, num2);
		
		//Imprimimos el resultado.
		System.out.println("El mayor de ambos números es: "+resultado);
						
		//Cerramos el escáner.
		sc.close();
						
		
	}

}
