//P-67 Leetcode

import java.util.Arrays;

public class P1_AddBinary
{
    public static void main(String[] args) {
        String a="1010";
        String b="1101";

        String sum= addBinary(a,b);
        System.out.println("Sum:"+sum);
    }
    public static String addBinary(String a, String b){
        StringBuilder result = new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;

        while(i>=0 || j>=0 || carry==1){
            int bit1=(i>=0) ? a.charAt(i)-'0' : 0;
            i--;
            int bit2=(j>=0) ? b.charAt(j)-'0' : 0;
            j--;

            int sum=bit1+bit2+carry;
            result.append(sum%2);
            carry=sum/2;
        }
        return result.reverse().toString();// reverse the StringBuilder and then convert it into String
    }
}
