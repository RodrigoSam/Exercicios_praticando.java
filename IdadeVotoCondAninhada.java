import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class IdadeVotoCondAninhada {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira o ano do seu nascimento: ");
		int an = digite.nextInt();
		int id = 2021 - an;
		System.out.print("Voc� tem "+id+" Anos,");
		if (id<16) {
			System.out.print(" voc� n�o possui a idade m�nima para votar.");			
					}else if(id>=16) {
						System.out.print(" seu voto � facultativo");
									} else if(id>=18 && id<=70) {
										System.out.print(" seu voto � obrigat�rio");
									} 		else {
												System.out.print(" seu voto � facultativo");
									}
	
		
	}

}
