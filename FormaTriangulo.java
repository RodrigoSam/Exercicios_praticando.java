import java.util.Scanner;

public class FormaTriangulo {

	public static void main(String[] args) {
		Scanner valor = new Scanner(System.in);
		System.out.print("Insira o valor dom lado A: ");
		float a = valor.nextFloat();
		System.out.print("Insira o valor dom lado B: ");
		float b = valor.nextFloat();
		System.out.print("Insira o valor dom lado C: ");
		float c = valor.nextFloat();

		if (a < b + c && b < a + c && c < a + b) {
			System.out.print("Forma um triângulo,");
			if (a == b && b == c) {
				System.out.print(" equilátero.");
			} else if (a != b && b != c && a != c) {
				System.out.print(" escaleno.");
			} else {
				System.out.print(" isósceles.");
			}

		} else {
			System.out.print("Não forma um triângulo");
		}
	}
}
