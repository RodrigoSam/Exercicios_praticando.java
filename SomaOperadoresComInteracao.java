import java.util.Scanner;

public class SomaOperadoresComInteracao {

	public static void main(String[] args) {
	Scanner digite = new Scanner(System.in);
			System.out.print("Insira o primeiro valor: ");
			int n1 = digite.nextInt();
			System.out.print("Insira o segundo valor: ");
			int n2 = digite.nextInt();
					
			float m = (n1 + n2)/2;
			System.out.println("Sua média é " + m);
		}

	}

