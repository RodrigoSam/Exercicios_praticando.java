import java.util.Scanner;

public class VerificadorIdade {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira o ano do seu nascimento: ");
		int an = digite.nextInt();
		int id = 2021 - an;
		System.out.print("Você tem "+id+" Anos,");
		Object r = (id>=18) ? " e já atingiu a maior idade":" e ainda é menor de idade";
			System.out.print(r);
		
	}

}
