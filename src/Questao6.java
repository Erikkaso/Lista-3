import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		int quantidade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();
		
		int[] numeros = new int[quantidade];
		
		System.out.println("informe os numeros que voce quer organizar");
		
		for(int i = 0;i<quantidade;i++)
		{
		numeros[i] = input.nextInt();
		}
		
		input.close();
		
		System.out.println("aqui esta o vetor ordenado:");
		for(int i=0;i<quantidade;i++) {
		System.out.println(ordenador(numeros)[i]);	
		}			
	}

	
	public static int[] ordenador(int[] n)
	{
	    for(int i=0;i<(n.length-1);i++) 
	    {
	        int iMinimo = i;
	        for(int j=i+1;j<n.length;j++) //verifica qual o menor valor do array
	        {
	            if(n[j] < n[iMinimo]) 
	            {
	            	iMinimo = j;
	            }
	        }      
	        if(iMinimo != i) //verifica se o indice minimo condiz com o valor do indice i
	        {
	            int aux = n[i];
	            n[i] = n[iMinimo];
	            n[iMinimo] = aux;
	        }
	    }
	    return n;
	}
}

	