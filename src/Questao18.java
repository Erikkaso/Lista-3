import java.util.Scanner;

public class Questao18 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o dinheiro incial, a taxa de juros e o periodo de cobranca");
		float dinicial = input.nextFloat();
		float taxaJuros = input.nextFloat();
		int periodo = input.nextInt();
		
		input.close();
		
		System.out.println("o valor do juros eh: "+calculoDeJuros(dinicial, taxaJuros, periodo));
	}	

	public static float calculoDeJuros(float d, float t, int p)
	{
		float montante = d*(float)Math.pow(t+1, p); 
		
		float juros = montante - d;
		
		return juros;
	}
	
}