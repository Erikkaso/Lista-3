import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe quantos numeros ira calcular:");
		int quantidade = input.nextInt();
		
		int[] numeros = new int[quantidade];
		int[] pesos = new int[quantidade];
		
		System.out.println("informe um numero e seu peso correspondente");
		for(int i=0;i<quantidade;i++) 
		{
			numeros[i] = input.nextInt();
			pesos[i] = input.nextInt();
			
		}
		input.close();
		System.out.print("o valor da Media Ponderada eh: " + mediaPonderada(numeros, pesos));
	}

	
	public static float mediaPonderada(int[] m, int[] n)
	{
		int somaPesos =0,somaDivisores=0;
		float resultado=0;
		
		for(int i=0;i<m.length;i++)
		{
			somaDivisores += m[i]*n[i];
			somaPesos += n[i];
		}
		
		resultado = (float)somaDivisores/somaPesos;
		
		return resultado;
	}
}

