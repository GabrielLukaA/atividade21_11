package atividades21_11;

import java.util.Scanner;

public class questão2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int matriz[][] = new int[7][4];
		int menorValor = 0;

		for (int l = 0; l < 7; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.println("Digite o valor da posição linha " + l + " coluna " + c + " é: ");
				matriz[l][c] = in.nextInt();
				if (l == 0 && c == 0) {
					menorValor = matriz[l][c];

				} else if (matriz[l][c] < menorValor) {
					menorValor = matriz[l][c];
				}

			}
		}
		for (int l = 0; l < 7; l++) {
			for (int c = 0; c < 4; c++) {

				if (menorValor == matriz[l][c]) {
					System.out.println("O menor valor é  " + menorValor + "  e pode ser encontrado na posição linha "
							+ l + " coluna " + c + ":");
				}
			}
		}
	}
}
