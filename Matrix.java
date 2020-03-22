package sjsu.edu;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter 3x3 matrix by rows: ");
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int k = 0; k < matrix[0].length; k++) {
                matrix[i][k] = in.nextInt();
            }
        }
        System.out.println("Sums all the numbers in the major diagonal: " + sumMajorDiagonal(matrix));
        System.out.println("Transpose is ");

        int [] [] transposed  = transpose(matrix);
        for (int x = 0; x < transposed.length; x++) {
            for (int k = 0; k < transposed[x].length; k++) {
                System.out.print(transposed[x][k] + " ");
            }
            System.out.println();
        }
    }

    public static int sumMajorDiagonal (int [][] matrix){
        int sumDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonal += matrix[i][i];
        }
        return sumDiagonal;
    }
    public static int[][] transpose(int[][] matrix){
        int [][] transposeMatrix = new int [3][3];
        for (int i = 0; i < matrix.length; i++){
            for (int k = 0; k < matrix.length; k++){
                transposeMatrix[i][k] = matrix[k][i];
            }
        }
        return transposeMatrix;
    }
}
