package chapters.Chapter08;

import java.util.Scanner;

public class Exercise08_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[8][8];
        System.out.println("Enter employees work hour day by day ");
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length; col++) {
                m[row][col] = input.nextDouble();
            }
        }


    }
    //public static double sumRow(double[][] arr,int rowIndex){

   // }
    public static void decrasingOrder(){

    }

}
