package atividades21_11;
import java.util.Scanner;
public class questão4 {
	public static void main(String[]args) {
		
		int matriz[][]=new int [5][5];
		int matrizB[][]=new int [5][5];
		
		Scanner in = new Scanner(System.in);
		
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("Digite o valor da posição linha " + l + " coluna " + c + " é: ");
				matriz[l][c] = in.nextInt();
				matrizB[l][c] = matriz[l][c]*matriz[l][c]*matriz[l][c];
			}
		}
		
		System.out.println("\n\nEssa matriz elevada ao cubo é: \n\n");
		for (int l = 0; l < 5; l++) {
			for (int c = 0; c < 5; c++) {
				System.out.println("O valor da posição linha " + l + " coluna " + c + " é: "+matrizB[l][c]);
			}
		}
	}

}
