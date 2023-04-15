import java.util.Scanner;

public class Questao17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("coloque uma palavra:");
		String palavra = input.nextLine();
		input.close();
		System.out.println(inverter(palavra));
	}
	public static char[] inverter(String p)
	{
		int numeroDeLetras = p.length()-1;
		char[] letrasDaPalavra = new char[p.length()];
		char[] novaPalavra = new char[p.length()];
		
		p.getChars(0, p.length(), letrasDaPalavra, 0);
		
		for(int i=0, j=numeroDeLetras;i<=numeroDeLetras && j>=0;i++, j--)
		{
			novaPalavra[i] = letrasDaPalavra[j];
		}
		return novaPalavra;
	}
	
}
