package tema4;

import java.util.Scanner;

public class Ejercicio5 {
	
	//Creamos una función vocal de tipo booleano, cuyos parámetros serán un string.
	
	static boolean esVocal (String letra) {
		
		//Declaramos la variable booleana donde guardaremos el resultado de la función.
		 boolean caracter= false;
		
		 //Hacemos una condición para establecer cuando la variable es verdadera o falsa.
		 switch (letra) {
		 
		 case "a","e","i","o", "u": 
			caracter=true;
		 	break;
		 }
		
		//Devolvemos el valor del booleano.
		return caracter;
		
	}

	public static void main(String[] args) {
		
		//Declaramos las variables.
		String letra;//Variable introducida por el usuario.
		boolean vocal;//Variable resultado.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por la consola. */
		
		Scanner sc= new Scanner (System.in);
																	
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
										
		System.out.print("Introduzca un caracter y pulse Intro: ");
		letra=sc.next();
		
		//Pedimos la función y la guardamos en la variable booleana.
		vocal= esVocal (letra);
		
		//Imprimimos el resultado.
		
		System.out.println(vocal);
	}

}
