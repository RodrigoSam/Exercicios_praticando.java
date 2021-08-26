
public class Contador_while_C_Continue_Break {

	public static void main(String[] args) {
		int cc = 0;
		while(cc<=10) {                   
			cc++;
			if (cc==2 || cc==4 || cc==9) {
				continue;                 //o comando continue interrompe o laço voltando para o teste lógico
			}                             //ou seja reinicia a estrutura de repetição ignorando o número da contagem neste caso 
			
			if(cc==7) {                   //o comando Break interrompe o laço e finaliza a execuçao de acordo com a instrução ()
				break;
			}
			System.out.println("Cambalhota "+cc);
			
			
		}

	}

}
