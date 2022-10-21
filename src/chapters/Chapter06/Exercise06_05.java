package chapters.Chapter06;

import java.util.Scanner;

public class Exercise06_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three number: ");
        int i = input.nextInt();
        int d = input.nextInt();
        int s = input.nextInt();
        displaySortedNumbers(i,d,s);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3){
    double a = Math.min(num1,num2);
    double min = Math.min(a,num3);

    double b =  Math.max(num1,num2);
    double max =  Math.max(b,num3);

    double middle = 0;
    if (min < num1 ){
        if (max > num1){
             middle = num1;
        }
    }
        if (min < num2 ){
            if (max > num2){
                middle = num2;
            }
        }
        if (min < num3 ){
            if (max > num3){
                middle = num3;
            }
        }
        System.out.println(min + "<" + middle + "<" + max);
    }

}
