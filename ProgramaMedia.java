import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira sua primeira nota: ");
		float n1 = digite.nextFloat();
		System.out.print("Insira sua segunda nota: ");
		float n2 = digite.nextFloat();
		float m = (n1+n2)/2;
		if (m>=7.5){
			System.out.print("Sua média foi "+m+" , Parábens você foi aprovado!");
		}else
			System.out.print("Sua média foi "+m+" , você foi reprovado!");
	}

}
