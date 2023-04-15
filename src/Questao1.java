import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		int quantidade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe quantos numeros voce quer somar");
		quantidade = input.nextInt();
		
		int[] numeros = new int[quantidade];
		
		System.out.println("informe os numeros que voce quer somar");
		
		for(int i = 0;i<quantidade;i++)
		{
		numeros[i] = input.nextInt();
		}
		
		input.close();
		System.out.print("o valor da soma eh: " + soma(numeros));
	}

	
	public static int soma(int[] n)
	{
		int somar=0;
		for(int i=2; i<n.length-2;i++)
		{
			somar+= n[i];
		}
		return somar;
	}
}

	