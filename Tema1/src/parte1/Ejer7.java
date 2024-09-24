package parte1;
import java.util.Scanner;
public class Ejer7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1ºDeclaramos las variables*/
		int Numerotlf;
		String Calle;
		String Nombre;
		/*2ºCreamos los escaneres*/
		Scanner lectura = new Scanner(System.in);
		Scanner lectura2 = new Scanner(System.in);
		Scanner lectura3 = new Scanner(System.in);
		/*3ºCreamos los prints que le indican al usuario que hacer*/
		System.out.println("Introduzca los siguientes datos");
		System.out.println("Nombre:");
		/*4º Le damos valor a la variable en base al input que introduzca el usuario*/
		Nombre = lectura.nextLine();
		System.out.println("Calle:");
		Calle = lectura2.nextLine();
		System.out.println("NºTelefono:");
		Numerotlf = lectura3.nextInt();
		/*5º Le damos salido a los datos introducidos por el usuario*/
		System.out.println("Tus datos han quedado registrados de la siguiente manera:");
		System.out.println(Nombre);
		System.out.println(Calle);
		System.out.println(Numerotlf);
		/*6ºCerramos los escaneres*/
		lectura.close();
		lectura2.close();
		lectura3.close();
	}
}