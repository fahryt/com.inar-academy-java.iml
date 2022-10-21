package chapters.Chapter06;

public class Exercise06_13 {
    public static void main(String[] args) {
        System.out.println("i\t\tm(i)");
        System.out.println("-------------");
        for (double i = 1; i < 21; i++) {
            System.out.printf("%.0f\t\t%.4f\n", i,sumSeries(i));

        }

    }

    public static double sumSeries(double i){
        double temp = 0;
        while (i>=0) {


            double sum = i / (i + 1);
            temp += sum;
            i--;
        }
        return temp;
    }

}
