import java.util.Scanner;

public class Exercicio_Repita {

	public static void main(String[] args) {
		Scanner digite=new Scanner(System.in);
		int n;
		int ni = 0;
		int s = 0;
		int cont=0;
		int ac = 0;
		int par = 0;
		int imp = 0;
		String resp;
		do {
			System.out.print("Digite um número: ");
			n = digite.nextInt();
			cont=n;
			ni++;
			if(cont %2 ==0) {
				par++;
			}else { imp++;}
			if(cont>100) {
				ac++;
			}
			s += n;
			System.out.print("Quer continuar [S/N]");
			resp = digite.next();
		    
			
		} while(resp.equals("s"));
		
		System.out.println("O Total de números inseridos é " +ni );
		System.out.println("A soma de todos os valores é " + s);
		System.out.println("O Total de números pares é " + par);
		System.out.println("O Total de números ímpares é " + imp);
		System.out.println("O Total de números a cima de 100 é " + ac);
		System.out.println("A soma de todos os valores é " + s);
		System.out.println("A média de todos os valores é " + s/ni );
	}

}
