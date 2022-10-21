package chapters.Chapter06;

public class Exercise06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\t\t\tCommission");
        System.out.println("-----------------------------");


        for (double salesAmount = 10_000;salesAmount<100_001; salesAmount+=5000){
            System.out.printf("%f\t\t\t%f\n",salesAmount,computeCommission(salesAmount));

        }
    }
    public static double computeCommission(double salesAmount){
        double commission = 0;
        if(salesAmount>9999) {
            commission = 5000 * 8 / 100 + 5000 * 10 / 100 + ((salesAmount - 10_000) * 12 / 100);
        }
        return commission;
    }
}
