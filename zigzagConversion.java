/**
 * Created by Mythri on 10/4/16.
 */
public class zigzagConversion {

    private String convert(String s, int numRows) {
        if (numRows == 1)
            return s;

        StringBuilder sb = new StringBuilder();
        int step = 2 * numRows - 2;
        for (int i = 0; i < numRows; i++) {
            //for first and last rows
            if (i == 0 || i == numRows - 1) {
                for (int j = i; j < s.length(); j += step) {
                    sb.append(s.charAt(j));
                }
            } else {
                /* middle rows */
                    int j =  i;
                    boolean flag = true;
                    int step1 = 2 * (numRows - 1 - i );
                    int step2 = step - step1;

                     while( j < s.length()){
                        sb.append(s.charAt(j));
                        if(flag)
                        j = j + step1;

                        else
                        j = j + step2;
                        flag =!flag;
                    }
            }
        }
       return sb.toString();
    }

    public static void main(String[] args) {

        String str = "PAYPALISHIRING";
        int num = 3;
        zigzagConversion res = new zigzagConversion();
        String resul = res.convert(str, num);
        System.out.println(resul);
    }
}