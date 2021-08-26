import java.util.Scanner;

public class Somador_Numeros_Do_While {

	public static void main(String[] args) {
	Scanner digite=new Scanner(System.in);
	int n;
	int s = 0;
	String resp;
	do {
		System.out.print("Digite um número: ");
		n = digite.nextInt();
		s += n;
		System.out.print("Quer continuar [S/N]");
		resp = digite.next();
		
		
	} while(resp.equals("s"));
	System.out.print("A soma de todos os valores é " + s);
	} 

}
