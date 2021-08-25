
public class MostrarNumeroAleatorio {

	public static void main(String[] args) {
		double ale = Math.random();
		double n = 5+ ale * (10-5);
		/*para trocar o parametro de sorteio(random), basta trocar os numeros de começo e fim da equação*/
		System.out.printf("%.2f",n);
		/*para reduzir as casas decimais usa-se o printf e a variavel fica fora da string,
		dividida por , na ordem em que se encontra dentro da declaração*/

	}

}
