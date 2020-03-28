package cursojava.executavel;

public class OperacoesLogicasAninhadas {

	/* main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		double nota1 = 100;
		double nota2 = 20;
		double nota3 = 100;
		double nota4 = 80;
		double media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		/* Operadores Logicos Aninhados */

		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Prabéns, Aluno Aprovado: " + media);
			} else {
				System.out.println("Aluno em recuperação: " + media);
			}

		} else {
			System.out.println("Aluno Reprovado: " + media);
		}

	}

}
