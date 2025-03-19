import java.util.*;

public class P15_Factorial
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = obj.nextInt();
        int number = num;
        int res = 1;

        while (num>0) {
            res = res * num;
            num--;
        }

        System.out.println("Factorial of "+number+" is: "+res);
    }
}
