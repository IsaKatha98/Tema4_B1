package tema4;

import java.util.Scanner;

public class Ejercicio8 {

	//Necesitamos una función que tenga como parámetros opcion, rCilindro, aCilindro.
	static double menu (int opcion, double n1, double n2) {
			
		//Declaramos las variables que necesitamos.
		double op=0;
			
		//Como tenemos que distinguir entre las opciones de un menú, haremos un switch.
			
		switch (opcion) {
			
			case 1:
				
				op= n1+n2;
				break;
			
			case 2:
				
				op=n1-n2;
				break;
		
			case 3: 
				
				op=n1*n2;
				break;
				
			case 4:
				
				if (n2!=0&&n1!=0) {
					
					op= n1/n2;
				
				} else {
					
					System.out.println("ERROR. El segundo número debe ser distinto de 0.");
					
				}
				
				break;
			
			
			//En caso de que se introduzca una opción diferente a las posibles
				
			default:
				
				System.out.println("ERROR. Ha elegido una opción no válida.");
				break;
				
			
		}
			
		//Devolvemos el resultado de la función, guardado en la variable op.
		return op;
		
	}
		
	public static void main(String[] args) {
			
		//Declaramos las variables.
			
		int opc;//Variable que introduce el usuario.
		double num1;//Variable que introduce el usuario.
		double num2;//Variable que introduce el usuario.
		double resultado;//Variable que muestra el resultado final.
			
		//Creamos un escáner para poder leer los datos que introduzca el usuario por la consola. 
																
		Scanner sc= new Scanner (System.in);
																
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
			
		System.out.print("Introduzca un número y pulse Intro: ");
		num1=sc.nextDouble();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2=sc.nextDouble();
		System.out.println("""
					Elija la opción que desee: 
					 1-> suma de dos números
					 2-> resta de dos números
					 3-> multipliación de dos números
					 4-> división de dos números
					 
					Usted elige: 
					 """);
		opc=sc.nextInt();
			
		//Ahora, invocamos la función.
			
		resultado= menu (opc, num1, num2);
			
		//Se imprime el resultado.
		System.out.println("El resultado es: "+resultado);
			
		//Cerramos el escáner.
		sc.close();
							

	}

}
