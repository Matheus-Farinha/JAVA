package operacoesDoisNumeros;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1;
		int num2;
		float soma;
		float sub;
		float mult;
		double div;
		
		
		System.out.print("-Entre com o primeiro valor:");
		num1 = input.nextInt();
		
		
		System.out.print("-Entre com o segundo valor:");
		num2 = input.nextInt();
		
		
		soma = num1 + num2;
		
		sub = num1 - num2;
		
		mult = num1 * num2;
		
		div = (double) num1 / num2;
		
		
		System.out.println( num1 + " + " + num2  + " = " + soma);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " X " + num2 + " = " + mult);
		System.out.println(num1 + " / " + num2 + " = " + div);
	}

}
