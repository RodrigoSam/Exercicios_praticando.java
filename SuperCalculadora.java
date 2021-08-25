import java.util.Scanner;

public class SuperCalculadora {
	public static void main(String[] args) {
		Scanner insira = new Scanner(System.in);
		System.out.print("insira o valor a ser calculado: ");
		int ni = insira.nextInt();
		float r = ni%2;
		System.out.println("O resto da divisão do seu número por 2 foi: " + r);	
		float r1 = (float) Math.pow(ni, 3);
		System.out.println("O resultado do seu número elevado a 3º foi de: " + r1);
		float r2 = (float) Math.sqrt(ni);
		System.out.printf("A Raiz quadrada do seu número é: %.2f\n" , r2);
		float r3 = (float) Math.cbrt(ni);
		System.out.printf("A Raiz cúbica do seu número é: %.2f\n" , r3);
		float r4 = (float) Math.abs(ni);
		System.out.println("O Valor absoluto do seu número é: " + r4);
		
	}

}
