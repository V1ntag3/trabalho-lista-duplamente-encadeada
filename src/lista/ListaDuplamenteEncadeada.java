package lista;

public class ListaDuplamenteEncadeada {
	private Node inicio;
	private Node fim;

	private class Node {
		private String item;
		private Node prox;
		private Node anterior;
		private boolean ativo;
	}

	public ListaDuplamenteEncadeada() {
		inicio = null;
		fim = null;
	}

	public boolean buscar(String nome) {
		Node aux = inicio;
		while (aux != null) {
			if (nome.equalsIgnoreCase(aux.item) && aux.ativo == true) {
				return true;
			}
			aux = aux.prox;
		}
		return false;

	}

	public void InserirNoInicio(String nome) {
		Node elem = new Node();
		if (inicio == null && fim == null) {
			elem.item = nome;
			inicio = elem;
			fim = elem;
			elem.ativo = true;
			System.out.println("\nO nome " + nome + " foi inserido com sucesso!");
		} else {
			if (buscar(nome) != true) {
				elem.item = nome;
				elem.prox = inicio;
				inicio = elem;
				elem.prox.anterior = inicio;
				elem.ativo = true;
				System.out.println("\nO nome " + nome + " foi inserido com sucesso!");
			} else {
				System.out.println("\nO nome " + nome + " já existe!");
			}

		}
	}

	public void InserirNoFim(String nome) {
		Node elem = new Node();
		if (inicio == null && fim == null) {
			elem.item = nome;
			inicio = elem;
			fim = elem;
			elem.ativo = true;
			System.out.println("\nO nome " + nome + " foi inserido com sucesso!");
		} else {

			if (buscar(nome) != true) {
				elem.item = nome;
				elem.anterior = fim;
				fim = elem;
				elem.anterior.prox = fim;
				elem.ativo = true;
				System.out.println("\nO nome " + nome + " foi inserido com sucesso!");
			} else {
				System.out.println("\nO nome " + nome + " já existe!");
			}

		}

	}

	public boolean MarcarComoExcluido(String nome) {
		Node aux = inicio;
		while (aux != null) {
			if (nome.equalsIgnoreCase(aux.item) && aux.ativo == true) {
				System.out.println("\nO nome " + aux.item + " foi marcado como excluído.");
				aux.ativo = false;

				return true;
			}
			aux = aux.prox;
		}
		return false;
	}

	public void ImprimirLista() {
		Node aux = inicio;
		System.out.println("\nLista:");
		while (aux != null) {
			if (aux.ativo == true) {
				System.out.println(aux.item);
			}
			aux = aux.prox;
		}
	}

}
