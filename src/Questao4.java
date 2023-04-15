import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		int[] quantidade = new int[2];
		Scanner input = new Scanner(System.in);
		
		System.out.println("infore o tamanho dos dois vetores:");
		for(int i=0;i<2;i++) {
		quantidade[i] = input.nextInt();
		}
		
		int[] numeros1 = new int[quantidade[0]];
		int[] numeros2 = new int[quantidade[1]];
		
		
		for(int i=0;i<2;i++) 
		{
			System.out.println("informe os numeros do vetor " + (i+1));
			for(int j = 0;j<quantidade[i];j++)
			{
			if (i==0)
			numeros1[j] = input.nextInt();
			
			if(i==1)
			numeros2[j] = input.nextInt();
			}
		}
		System.out.println("agora informe qual numero voce quer contar");
		int contador = input.nextInt();
		
		input.close();
		System.out.print("a quantidade de vezes que o valor " + contador + " aparece eh: " + contagemElemento(numeros1, numeros2,contador));
	}

	
	public static int contagemElemento(int[] m, int[] n, int cont)
	{
		int resultado=0;
		for(int i=0; i<m.length;i++)
		{
			if (m[i] == cont)
			resultado++;	
		}
		
		for(int i=0; i<n.length;i++)
		{
			if (n[i] == cont)
			resultado++;	
		}
		
		return resultado;
	}
}

