package valordaVenda;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		float produto;
		float acrescimo;
		float total;
		
		System.out.print("-Qual o preço de custo produto R$");
		produto = input.nextFloat();
		
		System.out.print("-Qual a porcentagem de acréscimo que deseja %:");
		acrescimo = input.nextFloat();
		
		total = produto * (acrescimo/100);
		
		System.out.println("-O valor do produto com o acréscimo fica em R$" +(produto + total));
	}

}
