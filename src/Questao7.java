import java.util.Scanner;

public class Questao7 {

	public static void main(String[] args) {
		int quantidade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();
		
		int[] numeros = new int[quantidade];
		
		System.out.println("informe os numeros que voce quer organizar");
		
		for(int i=0;i<quantidade;i++)
		{
		numeros[i] = input.nextInt();
		}
		
		System.out.println(verificarOrganizacao(numeros));
			
		input.close();
		}			

	
	public static boolean verificarOrganizacao(int[] n) 
	{
	    for(int i=1;i<n.length;i++) 
	    {
	        if(n[i] < n[i-1]) 
	        return false; 
	    }
	    return true;
	}
}

	