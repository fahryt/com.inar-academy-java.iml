package chapters.Chapter05;

import java.util.Scanner;

public class Exercise05_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer (integer higher than 1) : ");
        int in = input.nextInt();
        int i = 2;

        while (i<=in){
            if (in % i == 0){
                System.out.print(i + " ");
                in = in/i;
            }else {
                i++;
            }
        }

    }
}
