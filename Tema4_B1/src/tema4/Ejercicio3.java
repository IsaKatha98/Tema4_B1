package tema4;

import java.util.Scanner;

public class Ejercicio3 {

	//Necesitamos una función que tenga como parámetros opcion, rCilindro, aCilindro.
	static void cilindro (int opcion, double rCilindro, double aCilindro) {
		
		//Declaramos las variables que necesitamos.
		
		double area;
		double volumen;
		
		//Como tenemos que distinguir entre dos opciones de un menú, haremos un switch.
		
		switch (opcion) {
		
		case 1-> { 
			
			//Aquí hacemos el bloque de instrucciones para hallar el área del cilindro.
			
			area= 2*Math.PI*rCilindro*(rCilindro+aCilindro);
			
			//Imprimimos el resultado.
			System.out.println("El área del cilindro es: "+String.format("%.2f",area));
			
		}
		
		case 2-> {
			
			//Hacemos el bloque de instrucciones para hallar el volumen del cilindro.
			
			volumen= Math.PI*(rCilindro*rCilindro)*aCilindro;
			
			//Se imprime el resultado.
			System.out.println("El volumen del cilindro es: "+String.format("%.2f",volumen));
		}
		
		//En caso de que se introduzca un caso diferente de 1 o 2.
		default-> {
			
			System.out.println("ERROR. Ha elegido una opción no válida.");
			
		}
		
		}
	}
	
	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int opc;//Variable que introduce el usuario.
		double radio;//Variable que introduce el usuario.
		double altura;//Variable que introduce el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
															
		Scanner sc= new Scanner (System.in);
															
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.println("Elija la opción que desee: 1, para hallar el área del cilindro y 2, para hallar el volumen: ");
		opc=sc.nextInt();
		System.out.print("Introduzca el radio del cilindro y pulse Intro: ");
		radio=sc.nextDouble();
		System.out.print("Introduzca la altura del cilindro y pulse Intro: ");
		altura=sc.nextDouble();
		
		//Ahora, invocamos la función.
		
		cilindro (opc, radio, altura);
		
		//Cerramos el escáner.
		sc.close();
						
	
	}

}
