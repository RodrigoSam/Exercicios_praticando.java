import java.util.Scanner;

public class Verificador_Par_impar {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira um n�mero para descobrir se ele � par ou �mpar: ");
		float n = digite.nextFloat();
		float res = n%2;
		
		if (res==0) {
			System.out.print("Seu n�mero � par!!");
		}else {
			System.out.print("Seu n�mero � �mpar!!");
		}
				
		

	}

}
