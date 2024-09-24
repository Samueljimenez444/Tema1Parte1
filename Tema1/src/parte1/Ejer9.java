package parte1;
import java.util.Scanner;
public class Ejer9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1ºCreamos las variables*/
		int edad;
		boolean esMayorDeEdad;
		/*2ºCreacion Scanner*/
		 Scanner scanner = new Scanner(System.in);

	      /*3ºIndicacion para el usuario*/
	        System.out.print("Por favor, ingrese su edad: ");
	        /*4ºDefinimos la variable edad en base al imput del usuario*/
	        edad = scanner.nextInt();

	        /*5ºDeterminar si el usuario es mayor de edad usando el boolean*/
	       esMayorDeEdad = (edad >= 18);

	       /*6ºMostramos el resultado*/
	        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
	        
	        /*Cerramos el scanner*/
	        scanner.close();
	}
	
	}
