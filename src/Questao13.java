import java.util.Scanner;

public class Questao13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o tamanho dos vetores");
		int tamanho = input.nextInt();
		char[] vetor1 = new char[tamanho];
		char[] vetor2 = new char[tamanho];

		for(int i=0;i<2;i++)
		{   
			System.out.println("informe os valores do vetor "+(i+1));
			for(int j=0;j<tamanho;j++)
			{
				if(i==0)
				vetor1[j] = input.next().charAt(0);
				
				if(i==1)
				vetor2[j] = input.next().charAt(0);
			}
		}
		input.close();
		
		System.out.println("aqui esta os valores iguais:");
		for(int i=0;i<ocorrencia(vetor1, vetor2).length;i++)
		{
			System.out.print(ocorrencia(vetor1, vetor2)[i] + " ");
		}
	}
	
	public static char[] ocorrencia(char n[], char m[])
	{
		int cont=0, j=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i] == m[i])
			cont++;	
		}
		char[] retorno = new char[cont];
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i] == m[i])
			{
			 retorno[j] = n[i];
			 j++;	 
			}
		}
		return retorno;	
	}
	

}
