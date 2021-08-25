import java.util.Scanner;

public class TiposPrimitivos {

	private static Scanner teclado;

	public static void main (String[] args) {
		teclado = new Scanner(System.in);
		System.out.print("Insira seu Nome: ");
		String Nome= teclado.nextLine();
		System.out.print("Insira sua Nota: ");
		float Nota = teclado.nextFloat();
		System.out.format("A Nota de %s foi de: %.1f \n",Nome,Nota);
			
	}

}
