package br.edu.univas.main;

import java.util.Scanner;

public class Questao_1 {
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		float[] A = new float[12];
		float[] B = new float[12];
		float meA = 999, MaA = 0, meB = 999, MaB = 0;
		float somaA = 0, somaB = 0;
		int contador = 0;
		System.out.println("Morador A, digite o valor de sua conta de luz dos últimos 12 meses!");

		 for (int i = 0; i < 12; i++) {
			contador++;
			System.out.println("Valor da conta do " + contador + "° mês:");
			A[i] = Scanner.nextFloat();
			somaA += A[i];
			if(A[i] > MaA) {
				MaA = A[i];
			}
			if (A[i] < meA){
				meA = A[i];
			}
			
		}
		contador = 0;
		System.out.println("Morador B, digite o valor de sua conta de luz dos últimos 12 meses!");
		for (int i = 0; i < 2; i++) {
			contador++;
			System.out.println("Valor da conta do " + contador + "° mês:");
			B[i] = Scanner.nextFloat();
			somaB += B[i];
			if(B[i] > MaB) {
				MaB = B[i];
			}
			if (B[i] < meB){
				meB = A[i];
			}
			
		}
		System.out.println("A conta de maior valor de A é de: R$"+MaA);
		System.out.println("A conta de menor valor de A é de: R$"+meA);
		System.out.println("A conta de maior valor de B é de: R$"+MaB);
		System.out.println("A conta de menor valor de B é de: R$"+meB);
		System.out.println("A média das contas de A é de: R$"+(somaA/12));
		System.out.println("A média das contas de B é de: R$"+(somaB/12));
	}
}
