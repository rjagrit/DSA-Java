import java.util.*;

public class P16_TrailingZeroes
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Numeral Expression");
        long num = obj.nextLong();
        long number =  num;
        int count=0;
        while(num>0)
        {
            long extdigit = num % 10;
            System.out.println(extdigit);
            if(extdigit==0){
                count++;
            }
            else{
                break;
            }
            num=num/10;
        }
        System.out.println("Number of Trailing Zeroes in "+number+" : "+count);
    }
}
