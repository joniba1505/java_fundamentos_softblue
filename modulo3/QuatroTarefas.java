package modulo3;

public class QuatroTarefas {

	public static void main(String[] args) {
		//1. Impress�o dos n�meros de 10 a 25
		for (int i=10; i<=25; i++) {
			System.out.println(i);
		}
		
		//2. Impress�o da soma dos n�meros de 1 a 100, pulando de dois em dois (1, 3, 5, 7, etc.).
		int soma = 0;
		for (int i=1; i<=99; i+=2) {
			soma+=i;
		}
		System.out.println("A soma dos n�meros �mpares de 1 a 99 � " + soma);
	
	//3. Come�ando em 0, imprima os n�meros seguintes, enquanto a soma dos n�meros j�
		//impressos for menor que 100.

		soma = 0;
		int contador = 0;
		while (soma < 100) {
			System.out.println(contador);
			contador++;
			soma+=contador;
		}
	
	//4. Impress�o da tabuada do 9 (at� o d�cimo valor).
	int valorInicial = 9;
	contador = 1;
	while (contador <= 10) {
		System.out.println(valorInicial*contador);
		contador++;
	}
	}

}
