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
			System.out.print("Digite um n�mero: ");
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
		
		System.out.println("O Total de n�meros inseridos � " +ni );
		System.out.println("A soma de todos os valores � " + s);
		System.out.println("O Total de n�meros pares � " + par);
		System.out.println("O Total de n�meros �mpares � " + imp);
		System.out.println("O Total de n�meros a cima de 100 � " + ac);
		System.out.println("A soma de todos os valores � " + s);
		System.out.println("A m�dia de todos os valores � " + s/ni );
	}

}
