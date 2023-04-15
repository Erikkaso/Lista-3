import java.util.Scanner;

public class Questao15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("coloque uma palavra:");
		String palavra = input.nextLine();
		input.close();
		System.out.println(verificarPalindromo(palavra));
	}
	public static boolean verificarPalindromo(String p)
	{
		int numeroDePalavras = p.length()-1;
		char[] letrasDaPalavra = new char[p.length()];
		
		p.getChars(0, p.length(), letrasDaPalavra, 0);
		
		for(int i=0, j=numeroDePalavras;i<=numeroDePalavras && j>=0;i++, j--)
		{
			if(letrasDaPalavra[i] != letrasDaPalavra[j])
			return false;
		}
		return true;
	}
	
}
