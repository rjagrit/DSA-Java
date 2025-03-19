import java.util.Scanner;

public class P25_NumberOfSetBits
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = obj.nextInt();
        P18_NumberOfBits.printBits(num);
        int totalBits = numberOfSetBits(num);
        System.out.println("Total Number of Set Bits in "+num+" : "+totalBits);
    }

    public static int numberOfSetBits(int num){
        int count=0;
        while(num!=0){
            count++;
            num=P24_UnsetRightBit.unSetRightMostSetBit(num);
        }
        return count;
    }
}