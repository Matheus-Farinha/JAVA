package comissao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		
		float salario;
		float comissao;
		float soma;
		
		System.out.println("-Entre com seu salário R$");
		salario = input.nextFloat();
		
		
		comissao = salario * 0.15f;
		
		soma = salario + comissao;
		
		System.out.println("-Sua comissão é de R$"+ comissao);
		System.out.println("- E o salário totalizou em R$" + soma);
	}

}
