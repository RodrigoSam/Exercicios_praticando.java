import java.util.Scanner;

public class JogodoGenio {

	public static void main(String[] args) {
	Scanner	digite = new Scanner (System.in);	
    System.out.println("Vou pensar em valor entre 1 e 5 tente adivinhar");
    double n = 1 + Math.random()*(6-1);
    int valor =(int) n;
    System.out.print("Qual o seu palpite? ");
    int vdu = digite.nextInt();
    String f1 = "Acertou Mizaravi";
    String f2 = "Errou! Eu Pensei no número "+ valor;
    
    String res = (vdu == valor) ? f1:f2;
    
    System.out.print(res);
       
    
    

	}

}
