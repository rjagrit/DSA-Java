import java.util.Scanner;

public class P18_NumberOfBits
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = obj.nextInt();
        System.out.println("Binary of "+num+" is");
        printBits(num);
    }
    //Only for 8-bits
    public static void printBits(int number){
        for(int i=7;i>=0;i--)
        {
            System.out.print(((number>>i) & 1));
        }
        System.out.println();//for giving space
    }
}
