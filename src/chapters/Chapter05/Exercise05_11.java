package chapters.Chapter05;
//100-200  between
//5/6 !5*6
public class Exercise05_11 {
    public static void main(String[] args) {
        int count = 0;
        String str = "";

        for (int i =100 ;i<201;i++){
            if (i % 5==0 && i % 6 != 0){
                str+= " " +i  ;
                count++;

            }if (i % 6==0 && i % 5 != 0) {
                str+= " " +i  ;
                count++;
            }if (count == 10){
                str+="\n";
                count = 0;
            }
        }System.out.println(str);

    }
}
