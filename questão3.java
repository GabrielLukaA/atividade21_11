package atividades21_11;

import java.util.Scanner;

public class questão3 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int matriz[][] = new int[5][5];

		int somaLinha4 = 0, somaColuna2 = 0, somaDiagonalA = 0, somaDiagonalB = 0, somaTodosOsElementos = 0;

		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("Digite o valor da posição linha " + l + " coluna " + c + " é: ");
				matriz[l][c] = in.nextInt();
				somaTodosOsElementos += matriz[l][c];

				if (l == 3) {
					somaLinha4 += matriz[l][c];
				}
				if (c == 1) {
					somaColuna2 += matriz[l][c];
				}
				if (c == l) {
					somaDiagonalA += matriz[l][c];
				}

			}
		}

		for (int l = 0, c = 4; l < 5; l++, c--) {

			if (l >= 0) {
				somaDiagonalB += matriz[l][c];
			}
		}

		System.out.println("\n\nSomas\n\n");
		System.out.println("A soma da coluna 2  é: " + somaColuna2);
		System.out.println("A soma da linha 4 é: " + somaLinha4);
		System.out.println("A soma da diagonal principal é: " + somaDiagonalA);
		System.out.println("A soma da diagonal secundária é: " + somaDiagonalB);
		System.out.println("A soma de todos os elementos da matriz é: " + somaTodosOsElementos);
		System.out.println("\n\nMatriz\n\n");
		
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				
				System.out.println("A posição linha "+l+" coluna "+c+" é: "+matriz[l][c]);
			}
		}
	}
}
