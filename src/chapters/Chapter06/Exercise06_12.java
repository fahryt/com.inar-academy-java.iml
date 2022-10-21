package chapters.Chapter06;

import java.util.Scanner;

public class Exercise06_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first character: ");
        String ch1= input.next();
        char ch= ch1.charAt(0);

        System.out.println("Enter the second character: ");
        String ch2= input.next();
        char ch3= ch2.charAt(0);

        System.out.println("How much number expecting number per line");
        int i = input.nextInt();

        System.out.println(printChars(ch,ch3,i));

    }
    public static String printChars(char ch1, char ch2, int numberPerLine){
        String str="";
        int count= 0;

        if (ch2<ch1){
            char temp = ch1;
            ch1 = ch2;
            ch2 = temp;
        }
        while(ch1<=ch2){
            str+=ch1 + " ";
            count++;
            ch1++;
            if (count==numberPerLine){
                str+="\n";
                count= 0;
            }
        }
            return str;
    }
}
