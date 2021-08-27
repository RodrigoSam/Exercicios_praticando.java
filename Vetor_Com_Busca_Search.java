import java.util.Arrays;

public class Vetor_Com_Busca_Search {

	public static void main(String[] args) {
		int vet	[] =	{3, 7, 6, 1, 9, 4, 2};
		for (int v:vet){
			System.out.print(v+".");
		}
		System.out.println("");
		int pos = Arrays.binarySearch(vet, 1);
		System.out.print("eu encontrei meu vetor " +pos);

}
}