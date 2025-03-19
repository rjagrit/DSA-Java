//Q. Reverse the Number

import java.util.Scanner;

public class T2
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int number = obj.nextInt();
        int result =0;
        int ognum = number;

        while(number>0){
            int digit = number % 10;
            result=result*10+digit;
            number/=10;
        }
        System.out.println("Original number: "+ognum);
        System.out.print("Reversed Number: "+result);
    }
}
