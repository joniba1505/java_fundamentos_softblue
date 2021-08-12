package modulo3;

import java.util.Scanner;

public class FatorialRecursivo {

	public static void main(String[] args) {
		Scanner EntradaFatorial = new Scanner(System.in);
		System.out.println("Digite um valor para calcular o seu fatorial:");
		int valor = EntradaFatorial.nextInt();
		
		//Calcula o fatorial do valor
		int fatorial = calcularFatorial(valor);

		System.out.println("O fatorial de " + valor + "é " + fatorial);
	}

	/*
	 * Uma das formas de implementar o cálculo do fatorial é utilizar uma chamada recursiva, isto é,
	 * a função chama ela mesma.
	 */
	static int calcularFatorial(int num) {
		if (num == 0) {
			//para num == 0, o fatorial é 1
			return 1;
		}
	
//caso contrário, o fatorial é o 		 número multiplicado pelo fatorial do seu antecessor
	return num * calcularFatorial(num-1);
	}
}
