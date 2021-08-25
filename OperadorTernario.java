
public class OperadorTernario {

	public static void main(String[] args) {
		int n1, n2 ,r;
		n1=12;
		n2=6;
		//r = (n1>n2) ? 1:0;
		/* Se o n1 for maior que o n2 o operador ternário lê a primeira op~çao depois da ?
		 * caso contrário se o n2 for maior que o n1 então ele lê a opção após os : */
		 //r = (n1>n2) ? n1:n2; 
		 // o operador ternario tbm aceita variáveis
		r = (n1>n2) ? n1+n2 : n1-n2; 
		// e também expressões 
		System.out.print(r);
 
	}

}
