package cursojava.executavel;

public class PrimeiraClasseJava {

	/* main � um metodo auto executavel em Java */
	public static void main(String[] args) {

		double nota1 = 100;
		double nota2 = 20;
		double nota3 = 100;
		double nota4 = 80;
		double media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		if (media >= 70) {
			System.out.println("Prab�ns, Aluno Aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Recupera��o: " + media);

		} else {
			System.out.println("Aluno Reprovado: " + media);
		}
	}

}