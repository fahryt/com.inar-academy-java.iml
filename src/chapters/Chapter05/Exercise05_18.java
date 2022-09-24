package chapters.Chapter05;

public class Exercise05_18 {
    public static void main(String[] args) {
        String str = "";
        int i =6;
        System.out.println("Pattern A");
        for (int c = 1; c <= i; c++) {
            str += c + " ";
            System.out.println(str);
        }
        String s ="";
        System.out.println("Pattern B");
        for (int c = 1; c <= i; c++) {
            s += c + " ";
            if (c == i) {
                i = i - 1;
                c=0;
                System.out.println(s);
                s = "";
            }
        }
    }
}