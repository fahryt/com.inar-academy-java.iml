package chapters.Chapter05;

public class Exercise05_12 {
    public static void main(String[] args) {
        int n = 1;
        while (true) {
            double pow =n*n;

            if (12000< pow) {
                System.out.println("The smallest n is : " + n);
                System.exit(0);
            }else {
                n++;
            }
        }
    }
}