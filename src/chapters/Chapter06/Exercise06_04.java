package chapters.Chapter06;

import java.util.Scanner;

public class Exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        long i = input.nextLong();
        System.out.println("Reverse of i = " + reverse(i));
    }

    public static String reverse(long number) {
        String sumDigit = "";
        int i = 1;
        while (i > 0) {
            long Digit = number % 10;
            long Digit2 = number / 10;
            sumDigit += Digit;
            if (Digit2 < 1) {
                i = 0;
            } else {
                number = Digit2;
            }
        }
        return sumDigit;

    }
}

