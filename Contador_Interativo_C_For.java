import java.util.Scanner;

public class Contador_Interativo_C_For {

	public static void main(String[] args) {
		Scanner digite = new Scanner (System.in);
		System.out.print("Insira um n�mero para iniciar a contagem: ");
		int i = digite.nextInt();
		System.out.print("Insira um n�mero que dar� fim a contagem: ");
		int f = digite.nextInt();
		System.out.print("Insira de quanto em quanto voc� quer contar : ");
		int inc = digite.nextInt();
		
	
		
		if (i<f) {		
		for (int c=i ; c <=f ; c+=inc) {
			System.out.print(c+"...");		
			}
		         } else {
						
						for (int c=i ;  c >=f ; c-=inc ){
							System.out.print(c+"...");
					    }
			
			                       }
                                             }
                                         }
