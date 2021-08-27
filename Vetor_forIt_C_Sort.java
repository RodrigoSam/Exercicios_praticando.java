import java.util.Arrays;

public class Vetor_forIt_C_Sort {

	public static void main(String[] args) {
		
		double num[] = {3.5, 5.9, -1.9, 8.6, -4.3};
		Arrays.sort(num);   //sort coloca o vetor em ordem
		
		for(double valor : num) {
			System.out.print(valor+" ");
		}
		
		

}
}