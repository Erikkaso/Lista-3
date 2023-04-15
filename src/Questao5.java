import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		int quantidade;
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe quantos numeros voce quer colocar no array");
		quantidade = input.nextInt();
		
		int[] numeros = new int[quantidade];
		int[] copia = new int[quantidade];
		
		System.out.println("informe os numeros que voce quer copiar");
		
		for(int i = 0;i<quantidade;i++)
		{
		numeros[i] = input.nextInt();
		}
		
		input.close();
		for(int i=0;i<quantidade;i++) {
		copia = copiar(numeros,quantidade);
		}
		
		System.out.println("aqui temos os valores originais");
		for(int i=0;i<quantidade;i++) 
		{
			System.out.print("\t"+numeros[i]);
		}
		System.out.println("\ne aqui temos os valores copiados");
		for(int i=0;i<quantidade;i++) 
		{
			System.out.print("\t"+copia[i]);
		}
		
		
	}

	
	public static int[] copiar(int[] n, int q)
	{
		int[] arrayCopiado = new int[q];
		for(int i=0; i<n.length;i++)
		{
			arrayCopiado[i] = n[i];
		}
		return arrayCopiado;
	}
}

	