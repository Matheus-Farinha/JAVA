package consumoMedio;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float combustivel;
		float distancia;
		float resultado;
		
		System.out.print("-Quantos KM você percorreu:");
		distancia = input.nextInt();
		System.out.print("Quanto de combustível em L:");
		combustivel = input.nextInt();
		
		resultado = distancia / combustivel;
		
		System.out.println("-O consumo médio é " + resultado + "KM/L");
	}

}
