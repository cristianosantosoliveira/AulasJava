package cursojava.executavel;

public class EstruturaRepeticaoContinue {

	public static void main(String[] args) {
		// Estrutura Repeti��o e Continue

		for (int numero = 0; numero <= 10; numero++) {
			if (numero == 3 || numero == 6 || numero == 9) {
				System.out.println("Faz um stop " + numero);
				continue;
			}
			System.out.println("Processando la�o de repeti��o");
		}

	}

}
