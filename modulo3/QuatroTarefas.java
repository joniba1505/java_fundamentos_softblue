package modulo3;

public class QuatroTarefas {

	public static void main(String[] args) {
		//1. Impressão dos números de 10 a 25
		for (int i=10; i<=25; i++) {
			System.out.println(i);
		}
		
		//2. Impressão da soma dos números de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
		int soma = 0;
		for (int i=1; i<=99; i+=2) {
			soma+=i;
		}
		System.out.println("A soma dos números ímpares de 1 a 99 é " + soma);
	
	//3. Começando em 0, imprima os números seguintes, enquanto a soma dos números já
		//impressos for menor que 100.

		soma = 0;
		int contador = 0;
		while (soma < 100) {
			System.out.println(contador);
			contador++;
			soma+=contador;
		}
	
	//4. Impressão da tabuada do 9 (até o décimo valor).
	int valorInicial = 9;
	contador = 1;
	while (contador <= 10) {
		System.out.println(valorInicial*contador);
		contador++;
	}
	}

}
