package parte1;

import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		double kilosp;
		double kilom;
		double eurosp;
		double eurosm;
		Scanner Lectura= new Scanner(System.in);
		Scanner Lectura2= new Scanner(System.in);
		System.out.println("Introduzca los kilos de peras y de manzanas y calcularemos el precio de la fruta");
		kilosp= Lectura.nextDouble();
		kilom= Lectura2.nextDouble();
	eurosp= kilosp*1.95;
	eurosm= kilom*2.35;
	System.out.println("El importe total de peras es de" + " " + eurosp + " " + "euros");
	System.out.println("El importe total de manzanas es de" + " " + eurosm + " " + "euros");
	Lectura2.close();
	Lectura.close();
	}

}
