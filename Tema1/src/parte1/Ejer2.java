package parte1;

import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		/* 1º Definimos las variables edadaño2 y total */
		int edadaño2;
		int total;
		/* Creamos un print que le indica al usuario que escriba su edad */
		System.out.println("Escribe tu edad");
		/* Creamos el scanner que leera el input del usuario */
		Scanner sc = new Scanner(System.in);
		/*
		 * Definimos el valor de la variable "edadaño2" en funcion del valor del input
		 * del usuario y el valor de "total" sera el de edadaño2 + 1
		 */
		edadaño2 = sc.nextInt();
		total = edadaño2 + 1;
		/*
		 * El programa Printeara el resultado total (edad del usuario el año que viene)
		 */
		System.out.println("Tu edad el año que viene sera" + " " + total);
		/* Cerramos el scanner */
		sc.close();
	}

}
