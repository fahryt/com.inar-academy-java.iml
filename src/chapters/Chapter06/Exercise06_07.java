package chapters.Chapter06;

import java.util.Scanner;

public class Exercise06_07 {
    public static void main(String[] args) {
        System.out.println("The investment amount: ");
        Scanner input = new Scanner(System.in);
        double investmentAmount = input.nextDouble();
        System.out.println("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble();
        final int YEARS = 30;
        System.out.println("Years\t\tFutures Value");
        for (int i = 1 ; i<=30 ; i++){
            System.out.printf("%2d\t\t\t%2f\n" ,i,futureInvestmentValue(investmentAmount,monthlyInterestRate,i));
        }
        }
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int year){
        double futureInvestmentAmount = investmentAmount * (1 + monthlyInterestRate /100) *year * 12 ;

        return futureInvestmentAmount;
    }

}
