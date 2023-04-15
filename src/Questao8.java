import java.util.Scanner;

public class Questao8 {

	public static void main(String[] args) {
		int quantidade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();
		
		int[] numeros = new int[quantidade];
		
		System.out.println("informe os numeros que voce quer:");
		
		for(int i=0;i<quantidade;i++)
		{
		numeros[i] = input.nextInt();
		}
		
		System.out.println("informe os k-esimo maior numero que voce quer:");
		int kesimo = input.nextInt();
		
		input.close();
		
		numeros = ordenador(numeros);
		
		System.out.println(kesimoNumero(numeros,kesimo));
	}	

	public static int kesimoNumero(int[] x, int k)
	{
		if (k>x.length)
		return -1;
		
		return x[x.length-k];
	}
	
	public static int[] ordenador(int[] n)
	{
	    for(int i=0;i<(n.length-1);i++) 
	    {
	        int iMinimo = i;
	        for(int j=i+1;j<n.length;j++) 
	        {
	            if(n[j] < n[iMinimo]) 
	            {
	            	iMinimo = j;
	            }
	        }      
	        if(iMinimo != i)
	        {
	            int aux = n[i];
	            n[i] = n[iMinimo];
	            n[iMinimo] = aux;
	        }
	    }
	    return n;
	}	
}
