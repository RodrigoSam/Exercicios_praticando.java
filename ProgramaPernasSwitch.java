import java.util.Scanner;

public class ProgramaPernasSwitch {

	public static void main(String[] args) {
		Scanner dig = new Scanner(System.in);
		System.out.print("Quantas pernas tem?");
		int perna = dig.nextInt();
		System.out.print("Isso é um(a) ");
		String tipo;
		switch (perna) {
		case 1 :
			tipo = "Saci";
			break;
		case 2 :
			tipo = "bipede";
			break;
		case 3:
			tipo = "Tripé";
			break;
		case 4:
			tipo = "Quadrupede";
			break;
		case 6:
			tipo = "Aranha";
			break;
			default:
				tipo = "et";
		}
		System.out.print(tipo);
		}
						
}

