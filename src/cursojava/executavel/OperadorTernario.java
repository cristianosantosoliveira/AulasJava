package cursojava.executavel;

public class OperadorTernario {

	/* main é um metodo auto executavel em Java */
	public static void main(String[] args) {

		double nota1 = 100;
		double nota2 = 20;
		double nota3 = 0;
		double nota4 = 50;
		double media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		String saidaResultado;
		/* São para micro validações */
		saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 40 && media <= 69) ? "Aluno em recuperação" : "Aluno Reprovado";

		System.out.println(" Media: " + media + " Status: " + saidaResultado);

	}

}
