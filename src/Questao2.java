import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		int[] quantidade = new int[2];
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o tamanho dos dois vetores:");
		for(int i=0;i<2;i++) {
		quantidade[i] = input.nextInt();
		}
		
		int[] numeros1 = new int[quantidade[0]];
		int[] numeros2 = new int[quantidade[1]];
		
		
		for(int i=0;i<2;i++) 
		{
			System.out.println("informe os numeros que voce quer somar do vetor " + (i+1));
			for(int j = 0;j<quantidade[i];j++)
			{
			if (i==0)
			numeros1[j] = input.nextInt();
			
			if(i==1)
			numeros2[j] = input.nextInt();
			}
		}
		
		input.close();
		System.out.print("o valor da media eh: " + media(numeros1, numeros2));
	}

	
	public static float media(int[] m, int[] n)
	{
		float resultado, soma = 0, somaDosDenomidadores = m.length + n.length;
		for(int i=0; i<m.length;i++)
		{
			soma+= m[i];
		}
		
		for(int i=0; i<n.length;i++)
		{
			soma+= n[i];
		}
		
		
		resultado = soma/somaDosDenomidadores;
		
		return resultado;
	}
}

