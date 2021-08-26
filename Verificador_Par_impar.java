import java.util.Scanner;

public class Verificador_Par_impar {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira um número para descobrir se ele é par ou ímpar: ");
		float n = digite.nextFloat();
		float res = n%2;
		
		if (res==0) {
			System.out.print("Seu número é par!!");
		}else {
			System.out.print("Seu número é ímpar!!");
		}
				
		

	}

}
