package prestacao;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	float compra;
	float parcela;
	
	System.out.println("-Qual o valor da compra R$");
	compra = input.nextFloat();
	
	parcela = compra / 5;
	
	System.out.println("- O valor total da compra é R$" + compra);
	System.out.println("- O valor dividido em 5 parcela é de R$"+ parcela);
	}

}
