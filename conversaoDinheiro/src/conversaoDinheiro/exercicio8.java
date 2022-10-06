package conversaoDinheiro;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float dolar;
		float conversao;
		
		System.out.println("-Entre com o valor em dolar para converter, $");
		dolar = input.nextFloat();
		
		conversao = dolar * 5.25f;
		
		System.out.println("-O valor convertido em real fica em R$"+ conversao);

	}

}
