package chapters.Chapter05;

public class Exercise05_15 {
    public static void main(String[] args) {
        int count = 0;
        char ch = 33;
        String str = "";
        while (ch<127){

            str += ch + " ";
            ch++;
            count++;
        if (count == 10){
            str += "\n";
            count =0;

        }
        }
        System.out.println(str);
    }
}
