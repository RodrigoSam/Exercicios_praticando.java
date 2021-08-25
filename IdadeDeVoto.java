import java.util.Scanner;

public class IdadeDeVoto {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.print("Insira o ano do seu nascimento: ");
		int an = digite.nextInt();
		int id = 2021 - an;
		System.out.print("Você tem "+id+" Anos,");
		Object sit = ((id>=16 && id <18) || (id >70)) ? " seu voto é opcional":" seu voto é obrigatório";
		/*nesse caso usando ternário não conseguimos usar uma terceira opção como abaixo de 16 ser proibido
		para isso usaremos condicionais*/ 
		System.out.print(sit);


	}

}
