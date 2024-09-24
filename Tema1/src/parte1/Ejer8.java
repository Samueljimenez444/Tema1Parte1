package parte1;
import java.util.Scanner;
public class Ejer8 {
	public static void main(String[] args) {
		/*1ºDefinimos las variables*/
		String Nombre;
		int edad;
		/*2ºCreamos los escaneres*/
Scanner Lectura1= new Scanner(System.in);
Scanner Lectura2= new Scanner(System.in);
/*3º Print que le indica al usuario que hacer + definimos las variables en base a los inputs del usuario*/
	System.out.println("Introduce Tu nombre");
	Nombre= Lectura1.nextLine();
	System.out.println("Introduce tu edad");
edad=Lectura2.nextInt();	
/*4ºPrint que da como resultado la frase que se buscaba*/
System.out.println("Hola" + " " + Nombre + " " + "tienes" + "  " + edad + " "+  "años" +" " + "que mayor eres");
/*5º Cierre de escaneres*/
Lectura1.close(); 
Lectura2.close();
	
	}
}