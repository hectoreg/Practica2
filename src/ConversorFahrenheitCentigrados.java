import java.util.Scanner;
public class ConversorFahrenheitCentigrados {

	public static void main(String[] args) {
		
		float C = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor, introduzca un valor en grados fahrenheit.");
		float F = entrada.nextFloat();
		C =  ((F  - 32) * 5) / 9;
		System.out.print("El resultado de la conversion a grados centigrados es: " + C + "ºC.");
		entrada.close();

	}

}
