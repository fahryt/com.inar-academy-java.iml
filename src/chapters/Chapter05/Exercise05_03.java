package chapters.Chapter05;

public class Exercise05_03 {
    public static void main(String[] args) {
        int kilograms = 1;
        double pounds = 0;
        System.out.println("Kilograms\t\t\tPounds");
        while (kilograms<200){


            pounds = kilograms * 2.2 ;
            System.out.printf("%d\t\t\t\t\t%.1f\n", kilograms , pounds);
            kilograms = kilograms + 2;
        }
    }
}
