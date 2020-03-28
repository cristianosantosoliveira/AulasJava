package cursojava.executavel;

public class While {

	public static void main(String[] args) {
		
		
		/* Estrutura While */ 
		
		int numero = 0;
		
		while(numero <= 3) {
		
			System.out.println("O numero atual 'WHILE' é: " + numero);
			numero ++;
		}
		System.out.println("============= SEPARADOR ================");
		/* Estrtura Do While */
		
		int numero2 = 0;
		do { /* Primeiro executar e depois verifica*/
		
			System.out.println("O numero atual 'DO WHILE' é: " + numero2);
			numero2++;
		} while (numero2 <= 3); 

	}
}