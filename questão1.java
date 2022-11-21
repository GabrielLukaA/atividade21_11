package atividades21_11;
import java.util.Scanner;
public class questão1 {
	public static void main (String[]args) {
		
		int matriz [][] = new int [5][5];
		double somaPares=0, quantiaPares=0;
		double media=0;
		
		Scanner in = new Scanner(System.in);
		
		for(int l=0;l<5;l++) {
			for (int c=0;c<5;c++) {
				System.out.println("Digite o valor da posição linha "+l+" coluna "+c+ " é: ");
				matriz[l][c] = in.nextInt();
				if (matriz[l][c] %2==0) {
					somaPares+=matriz[l][c];
					quantiaPares++;
				}
			}
		}
		
		if (quantiaPares>0) {
		media=somaPares/quantiaPares;
		System.out.println("A média dos números pares é: "+media);
	} else {
		System.out.println("Não havia nenhum número par na matriz.");
	}
	}
}
