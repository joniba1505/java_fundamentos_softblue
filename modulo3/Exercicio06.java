/*
		*Verifique a validade de uma data e mostre uma mensagem na tela dizendo se a data é válida ou
		*inválida. Deve haver três variáveis para armazenar esta data: uma para o dia, outra para o mês
		*e outra para o ano. Considere que fevereiro pode ter somente 28 dias.
		*/


package modulo3;

import java.util.Scanner;

public class Exercicio06 {

	
	public static void main(String[] args) {
		//definindo as variáveis		
		int dia = 1;
		int mes;
		int ano;

		//Criando um laço de repetição para validar a digitação do mês
		do {
			Scanner entradaMes = new Scanner(System.in);
			System.out.println("Digite um número referente ao mês, entre 1 e 12:");
			mes = entradaMes.nextInt();
			}
			while (mes <=0 || mes >12);
		//Criando a lógica para validar a digitação do valor do dia, cujos meses possuem 31 dias
		if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes ==8 || mes == 10 || mes  == 12 ) {
			do {
Scanner entradaDia = new Scanner(System.in);
System.out.println("Digite o valor referente ao dia para o mês " + mes + ":");			
dia = entradaDia.nextInt(); 
}
while (dia <= 0 || dia > 31);
}

		//		Fazendo o mesmo para os meses com 30 dias
		else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
			do {
Scanner entradaDia = new Scanner(System.in);
System.out.println("Digite o valor referente ao dia para o mês " + mes + ":");			
dia = entradaDia.nextInt(); 
}
while (dia <= 0 || dia > 30);
}

		//Agora, para o mês de fevereiro, não levando em conta o ano bissexto
		else if (mes == 2) {
			do {
Scanner entradaDia = new Scanner(System.in);
System.out.println("Digite o valor referente ao dia, para o mês 2:");			
dia = entradaDia.nextInt(); 
}
while (dia <= 0 || dia > 28);
}

		//Validando o ano, que deve estar entre 1900 e 2999
		do {
Scanner entradaAno = new Scanner(System.in);

//Apresentando a data escolhida
System.out.println("Digite o valor correspondente ao ano, entre 1900 e 2999:");
ano = entradaAno.nextInt();
}
while (ano < 1900 || ano > 2999);

System.out.println("A data digitada foi:");
System.out.println(dia + "/" + mes + "/" + ano);
		
}
}