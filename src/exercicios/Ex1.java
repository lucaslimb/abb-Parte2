package exercicios;

import java.util.Scanner;

import arvores.ABBInt;

public class Ex1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		ABBInt abb = new ABBInt();
		
		
		int opcao;
		do {
			System.out.println("0 - Sair");
			System.out.println("1 - Inserir");
			System.out.println("2 - Apresentar ABB");
			opcao = input.nextInt();
			switch (opcao) {
			case 0:
				System.out.println("Programa encerrado!");
				break;
			case 1:
				System.out.println("Valor a ser inserido: ");
				int valor = input.nextInt();
				abb.root = abb.inserir(abb.root, valor);
				break;
			case 2:
				System.out.println("\n *** Apresentacao da ABB em ordem crescente ***");
				abb.show(abb.root);
				System.out.println("\n");
				break;
			default:
				System.out.println("Opcao invalida");
			}
		} while(opcao!=0);
		
	}

}
