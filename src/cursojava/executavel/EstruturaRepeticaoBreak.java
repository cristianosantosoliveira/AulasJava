package cursojava.executavel;

public class EstruturaRepeticaoBreak {

	public static void main(String[] args) {
		// Estrutura de repetição com for e Break em Java

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3) {
				System.out.println("Faz um stop ");
				System.out.println("Estou parando de executar ");
				break;
			}
		}

	}

}
