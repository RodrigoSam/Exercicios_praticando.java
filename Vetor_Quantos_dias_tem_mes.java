
public class Vetor_Quantos_dias_tem_mes {

	public static void main(String[] args) {
		 String mes[] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		 int tot[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 for (int ind = 0 ; ind < mes.length ; ind++) {
			 System.out.println("o mes de "+ mes[ind]+ ", tem "+tot[ind]+" dias!");
		 }
		 
}
}