package chapters.Chapter08;

import java.util.Scanner;

public class Exercise08_03 {
    public static void main(String[] args) {
        double[][] c = new double[3][3];
        double[][] x = new double[3][3];
        double[][] b = new double[3][3];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 3-3 matrix1 ");
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                x[row][col] = input.nextDouble();
            }
        }


        System.out.println("Enter 3-3 matrix1 ");

        for (int row = 0; row < b.length; row++) {
            for (int col = 0; col < b[row].length; col++) {
                b[row][col] = input.nextDouble();
            }
        }

        System.out.println("The matrises are added as follows ");


        String s = "+";
        String str= "=";
        for (int row = 0; row < x.length; row++) {
            for (int col = 0; col < x[row].length; col++) {
                if (row!=1) {
                    System.out.printf("%f\t\t%f\t\t%f ", x[row][col], b[row][col], c[row][col]);
                }else{
                    System.out.printf("%f\t%s\t%f\t%s\t%f ", x[row][col],s, b[row][col],str, c[row][col]);

                }

            }

            System.out.print("\n");

            }
            }




        public static double[][] addMatrix ( double[][] x, double[][] x1){
            double[][] sumArr = new double[3][3];

            for (int row = 0; row < x.length; row++) {
                for (int col = 0; col < x[row].length; col++) {
                    sumArr[row][col] = x[row][col] + x1[row][col];

                }

            }
            return sumArr;
        }
    }
