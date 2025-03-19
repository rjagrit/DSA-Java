import java.util.Scanner;

public class P17_OddEvenByBits
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = obj.nextInt();
        int convResult = P1_Conversions.decimalToBinary(num);
        System.out.println(convResult);
        int leftBit = convResult % 10;

        if(convResult==1)
            System.out.println("1 is a Odd Number");
        else if(leftBit==1)
            System.out.println("Odd Number");
        else
            System.out.println("Even Number");
    }
}
