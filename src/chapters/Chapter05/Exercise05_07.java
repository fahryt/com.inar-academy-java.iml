package chapters.Chapter05;

public class Exercise05_07 {
    public static void main(String[] args) {
        int tuition = 10000;
        int count = 0;

        while (count<15){
            count++;
            tuition += tuition * 5 / 100;

            if (count<11) {
                    System.out.println(" " + count + ". year tuition is : " + tuition);

            }
            if (count == 14){
                System.out.println("14. year tuition is : " + tuition);
            }
        }
    }
}
