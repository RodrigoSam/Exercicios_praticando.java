import java.util.Scanner;

public class Calculo_Fatorial_while {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira o número que você quer o fatorial: ");
		int c = digite.nextInt();
		int f = 1;
		
		
		while(c>1) {
			f*=c;
			c--;
			
		}
		System.out.print(f);
	}

}
