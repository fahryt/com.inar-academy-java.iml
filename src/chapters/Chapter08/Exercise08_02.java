package chapters.Chapter08;

import java.util.Scanner;

public class Exercise08_02 {
    public static void main(String[] args) {
        double[][] m = new double[4][4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4-4 matrix row by row ");
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextDouble();
            }
        }
        for (int r = 0; r < m.length; r++) {
            System.out.println("\n");

            for (int col = 0; col < m[r].length; col++) {
                System.out.println("The elements are " + m[r][col]);
            }
            System.out.println("\n");

        }


        System.out.println("Sum of the elements in the major diagonal " + sumMajorDiagonal(m));
    }
    public static double sumMajorDiagonal(double[][] m){
        double diaSum = 0;
        for (int row = 0; row < m.length; row++) {
                diaSum+= m[row][row];



        }
        return diaSum;
    }
}
