package parte1;
import java.util.Scanner;
public class Ejer10 {
	public static void main(String[] args) {
		/*1ºCreamos las variables*/
		boolean esPar;
		int numero;
		  /*2ºCreamos el Scanner*/
        Scanner scanner = new Scanner(System.in);

        /*3ºInstruccion para el usuario*/
        System.out.print("Por favor, ingrese un número: ");
        /*4ºDefinimos las variables en base al input del usuario y usando el modulo "%"*/
        numero = scanner.nextInt();
        esPar = (numero % 2 == 0);

        /*5ºMuestra el resultado*/
        System.out.println("¿El número es par? " + esPar);

        /*6ºCerrramos el Scanner*/
        scanner.close();
    }
}