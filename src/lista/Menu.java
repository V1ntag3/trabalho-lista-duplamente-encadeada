package lista;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		String nome;

		while (op != 6) {
			System.out.println(
					"\nOpções: \n1. Inserir no inicio\n2. Inserir no final\n3. Buscar nome\n4. Marcar como excluído\n5. Mostrar todos os nomes da lista\n6. Sair da aplicação\n");
			op = Integer.parseInt(sc.nextLine());

			switch (op) {

			case 1:
				System.out.println("Digite o nome:\n");
				nome = sc.nextLine();
				lista.InserirNoInicio(nome);
				break;

			case 2:
				System.out.println("Digite o nome:\n");
				nome = sc.nextLine();
				lista.InserirNoFim(nome);
				break;

			case 3:
				System.out.println("Digite o nome:\n");
				nome = sc.nextLine();
				if (lista.buscar(nome) == true) {
					System.out.println("\nO nome " + nome + " foi encontrado!");
				} else {
					System.out.println("\nO nome " + nome + " não foi encontrado!");
				}
				break;

			case 4:
				System.out.println("Digite o nome:\n");
				nome = sc.nextLine();
				if (lista.MarcarComoExcluido(nome) == false) {
					System.out.println("\nO nome " + nome + " não foi encontrado!");
				}
				break;

			case 5:
				lista.ImprimirLista();
				break;

			case 6:
				System.out.println("\nPrograma encerrado!");
				break;

			default:
				System.out.println("\nOpção inválida!");
				break;

			}
		}
		sc.close();

	}

}
