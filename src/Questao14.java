import java.util.Scanner;

public class Questao14 {

	public static void main(String[] args) {
Scanner input = new Scanner(System.in);
		
		System.out.println("informe o tamanho dos vetores");
		int tamanho = input.nextInt();
		char[] vetor = new char[tamanho];
		
			System.out.println("informe os valores do vetor");
			for(int i=0;i<tamanho;i++)
			{
				vetor[i] = input.next().charAt(0);
			}
			
			System.out.println("informe o valor que deseja retirar:");
			char exclui = input.next().charAt(0);
			input.close();
			
			System.out.println("aqui esta o vetor com o elemento retirado:");
			for(int i=0;i<removedor(vetor, exclui).length;i++)
			{
				System.out.print(removedor(vetor, exclui)[i] + " ");
			}
			
	}
	
	public static char[] removedor(char n[], char excluido)
	{
		int cont=0,j=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i] != excluido)
			cont++;
		}
		char[] retorno = new char[cont];
		
		for(int i=0;i<n.length;i++)
		{
			if(n[i] != excluido)
			{
			retorno[j] = n[i];
			j++;
			}
		}
		return retorno;
	}
}

