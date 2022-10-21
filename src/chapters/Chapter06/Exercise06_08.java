package chapters.Chapter06;

public class Exercise06_08 {
    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\t\tCelsius");
        System.out.println("--------------------------------------------------------------------");
        int count = 0;
        int i = 40;
        int d = 120;

           while (count<10){

                System.out.printf("%d\t\t\t%.2f\t\t|", i, celsiusToFahrenheit(i));
                i--;

                System.out.printf("%3d\t\t\t%.2f\t\n", d, fahrenheitToCelsius(d));
                d = d - 10;
                count++;

            }

            }



    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0/5) * (celsius +32);
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0/9) * (fahrenheit - 32);
        return celsius;

    }
}
