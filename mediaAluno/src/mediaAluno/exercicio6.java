package mediaAluno;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String nome;
		float nota;
		int cont;
		float media;
		
		
		
		System.out.println("-Digite seu nome:");
		nome = input.nextLine();
		cont = 1;
		nota = 0;
		while (cont <= 3) {
			System.out.println("-Qual a nota do aluno:");
			nota += input.nextFloat();
			cont ++;
		}
		
		media = nota / 3;
		
		System.out.println("-A média do aluno " + nome + " é de " + media);

	}

}
