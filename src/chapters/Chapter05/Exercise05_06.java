package chapters.Chapter05;

public class Exercise05_06 {
    public static void main(String[] args) {
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");

        for (int i = 1 , j = 20 ; i<11 && j<70;i++ , j=j+5){
            double kilometers = i * 1.609;
            double miles = j / 1.609;

            System.out.printf("%3d\t\t\t%.3f\t%s\t%2d\t\t\t%.3f%s", i, kilometers, "|" ,j ,miles,"\n");

        }


    }
}
