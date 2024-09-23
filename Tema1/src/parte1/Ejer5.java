package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		/*1ºCreacion de las variables*/
		float radio;
		float diametro;
		float calculol;
		float calculoa;
		/*2ºCreacion del escaner*/
		Scanner sc = new Scanner(System.in);
		/*3ºPrint que le indica al usuario que debe introducir */
		System.out.println("Introduce el radio de la circunferencia en cm para calcular su longitud y diametro");
		/*4ºLe damos valores a las variables en funcion de lo que introduzca el usuario realizando calculos*/
		radio = sc.nextInt();
		diametro = radio * 2;
		calculoa = (float) (Math.PI * radio * radio);
		calculol = (float) (diametro * Math.PI);
		/*5ºSe realiza un print de los resultados de las operaciones matematicas*/
		System.out.println("El area de la circunferencia es igual a" + " " + calculoa + "cms");
		System.out.println("La longitud de la circunferencia es igual a" + " " + calculol + "cms");
		/*6º Se cierra el escaner*/
		sc.close();
	}

}
