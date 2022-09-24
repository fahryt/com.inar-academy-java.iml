package chapters.Chapter05;

import java.util.Scanner;

public class Exercise05_17 {
    public static void main(String[] args) {
        String str = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer between 1 - 15 : ");
        int i = input.nextInt();
        String s = "";

        for (int a = 0 ; a<=i*2 ; a++ )  {
            System.out.print(" ");


        for (int d = 1 ; d<=i; d++ ) {
            s += d + " ";
            System.out.println(s);
        }

        for (int c = 2 ; c<=i; c++ ){
            str += c + " "  ;
            System.out.println(str);

        }
        }

    }
}
