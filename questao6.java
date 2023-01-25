package atividades;

public class questao6 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][8];
        for (int l = 0; l < 7; l++) {
            for (int c = 0; c < 8; c++) {
                matrix[l][c] = l + c;
            }
        }
        for (int l = 0; l < 7; l++) {
            for (int c = 0; c < 8; c++) {
                System.out.print(matrix[l][c] + " ");
            }
            System.out.println();
        }
    }
}


