package chapters.Chapter05;

public class Exercise05_10 {
    public static void main(String[] args) {
        int count = 0;

        String str = "";
        for (int i = 100;i<1001;i++){
            if (i % 5 == 0){
                str+= " " +i  ;
                count++;
            }else if (i % 6 == 0){
                str+= " " + i;
                count++;
            }if (count == 10){
                str+="\n";
                count = 0;
            }

        } System.out.println(str);
    }


}
