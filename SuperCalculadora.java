import java.util.Scanner;

public class SuperCalculadora {
	public static void main(String[] args) {
		Scanner insira = new Scanner(System.in);
		System.out.print("insira o valor a ser calculado: ");
		int ni = insira.nextInt();
		float r = ni%2;
		System.out.println("O resto da divis�o do seu n�mero por 2 foi: " + r);	
		float r1 = (float) Math.pow(ni, 3);
		System.out.println("O resultado do seu n�mero elevado a 3� foi de: " + r1);
		float r2 = (float) Math.sqrt(ni);
		System.out.printf("A Raiz quadrada do seu n�mero �: %.2f\n" , r2);
		float r3 = (float) Math.cbrt(ni);
		System.out.printf("A Raiz c�bica do seu n�mero �: %.2f\n" , r3);
		float r4 = (float) Math.abs(ni);
		System.out.println("O Valor absoluto do seu n�mero �: " + r4);
		
	}

}
