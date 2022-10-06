package raioCirculo;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float raio;
		float area;
		
		System.out.println("-Entre com a medida do raio em M:");
		raio = input.nextFloat();
		
		area = 3.14f * (raio * raio);
		
		System.out.println("-A área do círculo em metros: "+ area + "M²");

	}

}
