package chapters.Chapter06;

public class Exercise06_09 {
    public static void main(String[] args) {
        System.out.println("Feet\t\t\tMeters\t\t|\t\tMeters\t\t\tFeet");
        System.out.println("--------------------------------------------------------");
        double feet = 1;
        double meter = 20;
        for (int i = 0; i <10 ; i++) {

            System.out.printf("%.2f\t\t\t  %.3f\t\t|",feet,footToMeter(feet));
            feet++;

            System.out.printf("%.1f\t\t\t\t%.3f\t\t\n",meter,meterToFoot(meter));
            meter+=5;

        }
    }
    public static double footToMeter(double foot){
        double meter = 0.305 * foot;
        return meter;
    }
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }

}
