package atividades21_11;
import java.util.Scanner;
public class questão5 {
	public static void main(String[]args) {
		
		
		double matriz[][]=new double [3][4];
		
		Scanner in = new Scanner(System.in);
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 4; c++) {
				System.out.println("Digite o valor da posição linha " + l + " coluna " + c + " é: ");
				matriz[l][c] = in.nextInt();
			}
		}
		System.out.println("O elemento do canto superior esquerdo é: "+matriz[0][0]);
		System.out.println("O elemento do canto inferior esquerdo é: "+matriz[2][0]);
	}

}
