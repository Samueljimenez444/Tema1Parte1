package parte1;
import java.util.Scanner;
public class Ejer6 {
	public static void main(String[] args) {
		/*1ºDeclaramos las variables*/
		float Numero;
		float Numero2;
		float M;
		float S;
		float R;
		float D;
		/* 2ºCreamos los escaneres que leeran el input que introduzca el usuario */
		Scanner lectura = new Scanner(System.in);
		Scanner lectura2 = new Scanner(System.in);
		/* 3ºCreamos un print que le indica al usuario que tiene que hacer */
		System.out.println("Elije dos numeros");
		/* 4ºDefinimos las operaciones que realizaran las varibles y las definimos */
		Numero = lectura.nextFloat();
		Numero2 = lectura2.nextFloat();
		D = Numero / Numero2;
		S = Numero + Numero2;
		R = Numero - Numero2;
		M = Numero * Numero2;
		/* 5º Printeamos los resultadoos */
		System.out.println("Los resultados son de las operaciones son");
		System.out.println("La suma ha dado como resultado" + " " + S);
		System.out.println("La resta ha dado como resultado" + " " + R);
		System.out.println("La multiplicacion ha dado como resultado" + " " + M);
		System.out.println("La division ha dado como resultado" + " " + D);
		/* 6º Cerramos los escaneres */
		lectura.close();
		lectura2.close();
	}
}