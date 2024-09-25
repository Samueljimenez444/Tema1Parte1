package parte1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		/*1ºDeclaramos variables*/
		boolean tareas;
		boolean biblio;
		boolean lluvia;
		boolean puedesalir;
		/*2ºCreacion Scanner*/
Scanner lectura1= new Scanner(System.in);
/*2ºDefinimos las variables en base a las respuestas del usuario y le indicamos como debe responder*/
System.out.println("Introduce true o false a las siguientes preguntas para saber si puedes salir o no");
System.out.println("¿Tienes tareas?");
tareas= lectura1.nextBoolean();
System.out.println("¿Esta lloviendo?");
lluvia= lectura1.nextBoolean();
System.out.println("¿Tienes que ir a la biblioteca?");
biblio= lectura1.nextBoolean();
/*3ºOperador logico que "calcula"si el usuario debe o no salir*/
puedesalir = (!lluvia && tareas)|| biblio;
/*4ºPrint que indica que debe hacer el usuario en funcion del operador logico*/
System.out.println(puedesalir ? "Puedes salir" : "No puedes salir");
/*5ºCierre Scanner*/	
lectura1.close();
	}

}