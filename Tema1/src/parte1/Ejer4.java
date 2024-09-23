package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		/* 1º Nombramos las variables */
		float nota1;
		float nota2;
		float total;
		/*
		 * 2ºCreamos el Print que le indica al usuario el input que tiene que introducir
		 */
		System.out.println("Introduzca las notas del alumno para hacer una media aritmetica");
		try (/* 3ºCreamos los escaneres */
				Scanner sc = new Scanner(System.in)) {
			Scanner sc2 = new Scanner(System.in);
			/* 4ºDefinimos los valores de las variables en funcion del usuario */
			nota1 = sc.nextInt();
			nota2 = sc2.nextInt();
			/* (Lineas adicionales añadidas) */
			if (nota1 < 0)
				System.out.println("La nota seleccionada no es valida");
			if (nota2 < 0)
				System.out.println("La nota seleccionada no es valida");
			/* 6º Linea de Codigo que realiza el calculo total de la media */
			total = (nota1 + nota2) / 2;
			/* 7ºPrint del resultado */
			System.out.println("La nota media del alumno es" + " " + total);
			/* 8ºCierre de los dos escaneres */
			sc2.close();
			sc.close();
		}
	}

}
