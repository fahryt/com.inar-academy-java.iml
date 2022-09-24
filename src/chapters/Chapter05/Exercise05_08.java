package chapters.Chapter05;
//number of student
//each students name
//students score
//displays name ,score with highest score

import java.util.Scanner;

public class Exercise05_08 {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
        System.out.println("Enter the students count : ");
    final int NUMBER_OF_STUDENTS = input.nextInt();
    int i = 0;
    int count = 0 ;


    while (count<NUMBER_OF_STUDENTS){

        count++;
        System.out.println("Enter student name : ");
        String str = input.next();
        System.out.println("Enter " + str +"'s score : ");
        int net = input.nextInt();
        String output = "";
        if (net>i){
            output = str ;
        }

        int temp = Math.max(net,i);

        i = net;
        if (count==NUMBER_OF_STUDENTS){

            System.out.println(output + " " + temp);
        }
    }

    }


}
