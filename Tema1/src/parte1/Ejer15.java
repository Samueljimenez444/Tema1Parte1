package parte1;

import java.util.Scanner;
public class Ejer15 {
	public static void main(String[] args) {
		int nota1º;
		int  nota2º;
		int nota3;
		int calculoentero;
		double calculo;
Scanner lectura= new Scanner(System.in);
System.out.println("Introduce tus notas del primer segundo y tercer trimestre en ese orden para calcular la media goblar");
nota1º=lectura.nextInt();
nota2º=lectura.nextInt();
nota3=lectura.nextInt();
calculoentero=(nota1º+nota2º+nota3)/3;
calculo= (nota1º+nota2º+nota3)/3.0;
System.out.println("La nota en el boletin sera un"+ " " + calculoentero );
System.out.println("La nota en el expediente sera un" + " " + calculo );

	}
}