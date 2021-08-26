import java.util.Scanner;

public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner digite = new Scanner(System.in);
		System.out.println("Lembrando que a representação do Delta de uma equação de segundo grau é: ");
		System.out.println("▲=B²-4*2*c");	
		System.out.println("Insira os termos de sua equação de segundo grau");
		System.out.print("Insira o termo a: ");
		float a = digite.nextFloat();
		System.out.print("Insira o termo b: ");
		float b = digite.nextFloat();
		System.out.print("Insira o termo c: ");
		float c = digite.nextFloat();
		double d = Math.pow (b, 2) - 4 * a * c;
		System.out.print("▲ é = ");
		System.out.println(d);
		if(d<0) {
			System.out.println("Não existem raízes Reais");
		}else {
			System.out.println("Existem raízes Reais");
		}
		
		

	}

}
