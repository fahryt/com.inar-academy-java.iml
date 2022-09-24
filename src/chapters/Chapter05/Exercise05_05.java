package chapters.Chapter05;

public class Exercise05_05 {
    public static void main(String[] args) {

        System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");

        for(int i = 1 ,j = 20; i<200 && j<516 ; i = i + 2 ,j = j + 5 ){
            double pound = i * 2.2;
            double kg = j / 2.2;

            System.out.printf("%3d\t\t\t%.1f\t%s\t%3d\t\t\t%.2f%s", i, pound, "|" ,j ,kg,"\n");

        }

    }
}
