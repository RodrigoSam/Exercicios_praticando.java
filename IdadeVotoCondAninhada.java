import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class IdadeVotoCondAninhada {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira o ano do seu nascimento: ");
		int an = digite.nextInt();
		int id = 2021 - an;
		System.out.print("Você tem "+id+" Anos,");
		if (id<16) {
			System.out.print(" você não possui a idade mínima para votar.");			
					}else if(id>=16) {
						System.out.print(" seu voto é facultativo");
									} else if(id>=18 && id<=70) {
										System.out.print(" seu voto é obrigatório");
									} 		else {
												System.out.print(" seu voto é facultativo");
									}
	
		
	}

}
