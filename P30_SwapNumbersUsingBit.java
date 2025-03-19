/*
1) It works for negative number also
 */

import java.util.Scanner;

public class P30_SwapNumbersUsingBit
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1= obj.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2= obj.nextInt();

        //Swapping code using Bits
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println();
        System.out.println("After Swapping\n1st Number : "+num1+"\n2nd Number : "+num2);

    }
}
