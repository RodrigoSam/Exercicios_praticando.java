
public class OperadorTernario {

	public static void main(String[] args) {
		int n1, n2 ,r;
		n1=12;
		n2=6;
		//r = (n1>n2) ? 1:0;
		/* Se o n1 for maior que o n2 o operador tern�rio l� a primeira op~�ao depois da ?
		 * caso contr�rio se o n2 for maior que o n1 ent�o ele l� a op��o ap�s os : */
		 //r = (n1>n2) ? n1:n2; 
		 // o operador ternario tbm aceita vari�veis
		r = (n1>n2) ? n1+n2 : n1-n2; 
		// e tamb�m express�es 
		System.out.print(r);
 
	}

}
