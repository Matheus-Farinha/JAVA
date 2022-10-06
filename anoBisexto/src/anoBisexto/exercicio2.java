package anoBisexto;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		int ano;
		
		
		System.out.println("-Digite o ano para saber se é bisexto:");
		ano = input.nextInt();
		
		if (ano % 4 == 0) {
			System.out.println("-É um ano bisexto.");
		}
		else {
			System.out.println("-Não é um ano bisexto.");
		}
	}

}
