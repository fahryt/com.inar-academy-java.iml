package chapters.Chapter06;

import java.util.Scanner;

public class Exercise06_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a integer: ");
        int i = input.nextInt();
        System.out.println("Your numbers sum digits is " + sumDigits(i));


    }
    public static int sumDigits(long n){
        int sumDigit = 0;
        int i = 1;
        while (i>0){
           long Digit = n % 10 ;
           long Digit2 = n / 10 ;
           sumDigit += Digit;
           if (Digit2<1){
               i = 0;
           }else {
               n = Digit2;
           }
        }
        return sumDigit;
    }
}
