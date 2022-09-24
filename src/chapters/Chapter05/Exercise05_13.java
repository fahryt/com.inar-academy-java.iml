package chapters.Chapter05;

public class Exercise05_13 {
    public static void main(String[] args) {
        int n = 1;
        double pow =n*n*n;
        while (12000> pow) {

            if ((n+1)*(n+1)*(n+1)>12000) {
                System.out.println("The largest n is : " + n);
                System.exit(0);
            }else {
                n++;
            }
        }
    }
}
