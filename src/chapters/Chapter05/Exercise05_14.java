package chapters.Chapter05;

import java.util.Scanner;

public class Exercise05_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first positive integer: ");
        int n1 = input.nextInt();

        System.out.println("Enter the second positive integer: ");
        int n2= input.nextInt();

        int min = Math.min(n1,n2);

        while(min>0){
            if (n1 % min == 0 && n2 % min == 0){
                System.out.println("GCD is : " + min);
                break;
            }else {
                min--;
            }


        }
    }

}
