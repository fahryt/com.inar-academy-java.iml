package chapters.Chapter06;

public class Exercise06_01 {
    public static void main(String[] args) {
        String s = "";
        for(int i = 1 ; i<101 ; i++){
           s += getPentagonalNumber(i) + " ";
           if (i%10 == 0 ){
               s+= "\n";
           }
        }
        System.out.print(s);
    }
    public static int getPentagonalNumber(int i){
        int pentagonalNumber = i * (3 * i - 1) / 2;
        return pentagonalNumber;
    }
}
