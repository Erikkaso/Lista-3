import java.util.Scanner;

public class Questao12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("insira um numero:");
		int numero = input.nextInt();

		input.close();
		
		if(primoVerifica(numero))
		System.out.println("o numero eh primo");
		
		else
		System.out.println("o numero NAO eh primo");	
	}
	
	public static boolean primoVerifica(int n)
	{
		if (n == 2 || n == 3 || n == 5 || n == 7)
			return true;
		
		else if (n%2 != 0 && n%3 != 0 && n%5 != 0 && n%7 != 0)
	    	return true;	
		
		else
			return false;

	}
}
