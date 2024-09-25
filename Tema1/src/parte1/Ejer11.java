package parte1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		float euro;
		float peseta;
		System.out.println("Introduce la cantidad de pesetas y te calculamos su valor en pesetas");
	Scanner Lectura= new Scanner(System.in);
	peseta=Lectura.nextFloat();
    euro= (float) (peseta*0.00601);
    System.out.println("Las pesetas introducidas equivalen a" + " "+ euro + " " + "euros");
    Lectura.close();
	}
	

}