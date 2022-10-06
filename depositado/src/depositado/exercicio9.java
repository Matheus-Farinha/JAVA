package depositado;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float dinheiro;
		float rendimento;
		float soma;
		
		System.out.println("-Insira o valor depositado para saber seu rendimento ao mês R$");
		dinheiro = input.nextFloat();
		
		rendimento = dinheiro * 0.007f;
		
		soma = rendimento + dinheiro;
		
		System.out.println("-O valor depositado foi R$" + dinheiro);
		System.out.println("-O rendimento mensal desse valor ao mês é R$" + rendimento);
		System.out.println("- O total no final do mês ficará em R$"+ soma);

	}

}
