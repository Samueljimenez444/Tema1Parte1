package parte1;

import java.util.Scanner;
public class Ejer14 {

	public static void main(String[] args) {

			int nota1º;
			int  nota2º;
			int nota3;
			double calculo;
	Scanner lectura= new Scanner(System.in);
	System.out.println("Introduce tus notas del primer segundo y tercer trimestre en ese orden para calcular la media goblar");
	nota1º=lectura.nextInt();
	nota2º=lectura.nextInt();
	nota3=lectura.nextInt();
	calculo= (nota1º+nota2º+nota3)/3;
	System.out.println("La nota en el boletin sera un"+ " " + calculo );
	System.out.println("La nota en el expediente sera un" + " " + (double) calculo );
	}
	}