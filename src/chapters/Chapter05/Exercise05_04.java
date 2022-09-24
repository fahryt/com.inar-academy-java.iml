package chapters.Chapter05;

public class Exercise05_04 {
    public static void main(String[] args) {
        int miles = 1;
        double kilometers = 0;
        System.out.println("Miles\t\t\t\tKilometers");
        while (miles<11){


            kilometers = miles * 1.609 ;
            System.out.printf("%d\t\t\t\t\t%.3f\n", miles , kilometers);
            miles++;
        }
    }
}
