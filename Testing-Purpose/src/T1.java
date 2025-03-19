//Q. Print Binary Equivalent of a decimal number and check whether the number is Even or Odd.

import java.util.Scanner;

public class T1 {
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = obj.nextInt();
        int conversion = decimaltobinary(n);
        System.out.println("Binary Representation of "+n+" : "+conversion);
        checkoddeven(conversion);

    }

    // Function for converting decimal into binary
    private static int decimaltobinary(int num){
        int result=0;
        int power=0;

        while(num>0){
            int extractdigit=num%2;
            result+=extractdigit*Math.pow(10,power);
            num=num/2;
            power++;
        }
        return result;
    }

    private static void checkoddeven(int convertednum){
        int leftbit = convertednum%10;

        if(leftbit==1){
            System.out.println("It is an Odd Number");
        }
        else{
            System.out.println("It is an Even Number");
        }
    }
}