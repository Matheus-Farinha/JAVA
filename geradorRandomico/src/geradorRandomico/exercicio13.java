package geradorRandomico;

import java.util.Random;
import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random sortido = new Random();

		int premiado = sortido.nextInt(10) + 1;
		int numero;

		System.out.println("--- TENTE ADIVINHAR O NUMERO DE 1 A 10 ---");

		System.out.println(premiado);

		System.out.println("--- INSIRA UM NÚMERO PARA ADIVINHAR:");
		numero = input.nextInt();

		if (premiado == numero) {
			System.out.println("parabens");
		}
		while (numero < premiado) {
			System.out.println("---MAIS UM POUCO---");
			System.out.println("--- INSIRA UM NÚMERO PARA ADIVINHAR:");
			numero = input.nextInt();
			if (premiado == numero) {
				System.out.println("parabens");
			}
			while (numero > premiado) {
				System.out.println("---MENOS UM POUCO---");
				System.out.println("--- INSIRA UM NÚMERO PARA ADIVINHAR:");
				numero = input.nextInt();
				if (premiado == numero) {
					System.out.println("parabens");

				}
			}
		}
	}
}
