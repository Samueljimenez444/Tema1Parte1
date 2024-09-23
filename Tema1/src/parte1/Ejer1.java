package parte1;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		/* 1º Definimos nuestra variable numero */
		int numero;
		/* 2º Creamos un print que le indique al usuario que escriba un numero */
		System.out.println("Escribe un numero");
		/*
		 * 3ºCreamos el escaner con el que le preguntaremos al usuario el valor de la
		 * variable
		 */
		Scanner sc = new Scanner(System.in);
		/* 4ºDefinimos a la variable en base al valor que le da el usuario */
		numero = sc.nextInt();
		/* 5ºSe muestra en pantalla el numero mostrado por el usuario */
		System.out.println("El numero elegido ha sido" + " " + numero);
		/* 6º Cerramos el Scanner y terminamos */
		sc.close();
	}

}
