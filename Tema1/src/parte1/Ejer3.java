package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		/* Creacion variables */
		int año;
		int añonaci;
		int total;
		/* Le damos a la variable "año" el valor de 2024 */
		año = 2024;
		/* Le preguntamos al usuario en que año nacio */
		System.out.println("¿En que año naciste?");
		/* Creamos el scanenr */
		Scanner sc = new Scanner(System.in);
		/*
		 * Le damos el valor a la variable "añonaci" el valor que el usario meta en el
		 * input
		 */
		añonaci = sc.nextInt();
		if (2024<añonaci) {
		System.out.println("Esa edad no es valida");
		}
		else {
		/* Se calcula el valor del año del usuario a traves de la variable total */
		total = año - añonaci;
		/* Se printea el resultado al usuario */
		System.out.println("Tienes" + " " + total + " "+ "años de edad");}
		/* Se cierra el Scanner */
		sc.close();

	}

}
