import java.util.Scanner;
public class ConversorCentigradosFahrenheit {

	public static void main(String[] args) {
		
		float F = 0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Por favor, introduzca un valor en grados centigrados.");
		float C = entrada.nextFloat();
		F =  ((C * 9)/5) + 32;
		System.out.print("El resultado de la conversion a grados fahrenheit es: " + F + "ºF.");
		entrada.close();

	}

}
