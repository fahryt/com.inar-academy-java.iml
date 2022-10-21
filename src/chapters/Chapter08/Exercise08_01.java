package chapters.Chapter08;

import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String[] args) {
        System.out.println("Enter 3-by-4 matrix row by row ");
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][4];
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextDouble();
            }
        }
        for (int row = 0; row < m.length; row++) {
            System.out.println("\n");

            for (int col = 0; col < m[row].length; col++) {
                System.out.println("The elements are " + m[row][col]);
            }
            System.out.println("\n");

        }
        for (int i = 0; i < 4; i++) {
            System.out.println("Sum of the elements at column " + i + " is " + sumColumn(m, i));
        }
    }


        public static double sumColumn ( double[][] m, int columnIndex){
            double colSum = 0;
            for (int row = 0; row < m.length; row++) {
                colSum += m[row][columnIndex];


            }
            return colSum;
        }

    }
