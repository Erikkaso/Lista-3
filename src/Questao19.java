import java.util.Scanner;

public class Questao19 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("informe o numero:");
		int numero = input.nextInt();
		input.close();
		System.out.println(verificarNumero(numero));
	}

	public static boolean verificarNumero(int n) {

		int soma=0;

		for(int i = 1; i < n; i++)
        {
			if(n % i == 0)
            soma = soma + i;
        }
		if(soma == n)
		return true;
		
		return false;
	}
}
