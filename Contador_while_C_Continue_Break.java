
public class Contador_while_C_Continue_Break {

	public static void main(String[] args) {
		int cc = 0;
		while(cc<=10) {                   
			cc++;
			if (cc==2 || cc==4 || cc==9) {
				continue;                 //o comando continue interrompe o la�o voltando para o teste l�gico
			}                             //ou seja reinicia a estrutura de repeti��o ignorando o n�mero da contagem neste caso 
			
			if(cc==7) {                   //o comando Break interrompe o la�o e finaliza a execu�ao de acordo com a instru��o ()
				break;
			}
			System.out.println("Cambalhota "+cc);
			
			
		}

	}

}
