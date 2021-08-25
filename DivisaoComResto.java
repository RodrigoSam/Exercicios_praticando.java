import java.util.Scanner;

public class DivisaoComResto {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.println("Calculo de divisão com Resto");
		System.out.print("Insira o seu numerador: ");
		int n = digite.nextInt();
		System.out.print("Insira seu denominador: ");
		int d = digite.nextInt();
		float t = n / d;
		System.out.print("O Total da sua divisao foi de: ");
		System.out.println(t);
		float rd = n % d;
		System.out.print("O Resto da Sua divisão foi: ");	
		System.out.println(rd);
		

	}

}
