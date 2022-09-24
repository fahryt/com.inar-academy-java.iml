package chapters.Chapter05;

import java.util.Scanner;

public class Exercise05_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positive = 0;
        int negative = 0;
        double total = 0;
        double average = 0;

        int count = 0;

        System.out.println("Enter an integer , the input ends if it is 0: ");
        int stop = input.nextInt();
        if (stop==0){
            System.out.println("No numbers are entered expect 0");
        }else{
            while(true){

                if (stop!= 0) {
                    count++;
                    total += stop;
                }
                if (stop<0){
                    negative++;
                }else if (stop>0) {
                    positive++;
                }else {
                    average = (total / (negative + positive)) ;

                    System.out.println("The number of positives is " + positive);
                    System.out.println("The number of negatives is " + negative);
                    System.out.println("The total is " + total);
                    System.out.println("The average is " + average);
                    break;
                }

                stop = input.nextInt();

                }
            }System.exit(0);

        }



    }

