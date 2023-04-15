import java.util.Scanner;

public class Questao11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o numero que voce quer como base");
		int base = input.nextInt();
		
		System.out.println("informe o numero que voce quer como expoente");
		int expoente = input.nextInt();
		input.close();
		
		System.out.println("o valor da potencia eh: "+potencia(base,expoente));
	}	

	public static int potencia(int a, int e)
	{
		int pot=1;
		for(int i=0;i<e;i++)
		{
			pot*=a;
		}	
		return pot;
	}
	
}