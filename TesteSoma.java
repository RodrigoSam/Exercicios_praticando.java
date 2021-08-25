import java.util.Scanner;

public class TesteSoma {

	private static Scanner digite;

	public static void main(String[] args) {
		digite = new Scanner(System.in);
		System.out.print("Insira o primeiro valor: ");
		int num1 = digite.nextInt();
		System.out.print("Insira o segundo valor: ");
		int num2 = digite.nextInt();
		int result = num1 + num2;
		System.out.print("A Soma dos valores é :" + result);		

	}

}
