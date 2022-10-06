package conversaoTemp;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float temp;
		float f;
		
		
		System.out.print("-Entre com um valor em °C:");
		temp = input.nextFloat();
		
		f = (temp * 1.8f) + 33.8f;
		
		System.out.println("-A temperatura convertida em Fahrenheit é "+ f + "°F");

	}

}
