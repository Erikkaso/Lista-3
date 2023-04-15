import java.util.Scanner;

public class Questao10 {

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
			System.out.println("informe os numeros que voce quer por no vetor " + (i+1));
			for(int j=0;j<quantidade[i];j++)
			{
			if (i==0)
			numeros1[j] = input.nextInt();
			
			if(i==1)
			numeros2[j] = input.nextInt();
			}
		}
		
		input.close();
		System.out.print(compara(numeros1,numeros2,quantidade));
	}

	
	public static boolean compara(int[] m, int[] n, int[] q)
	{
		if(q[0] != q[1])
		return false;
		
		for(int i=0; i<m.length;i++)
		{
			if(m[i]!=n[i])
			return false;
		}
	return true;	
	}
}

