import java.util.Scanner;

public class P26_ClearLSB
{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = obj.nextInt();
        System.out.println("Enter the Bit upto which you want to unset all bits");
        int bit = obj.nextInt();
        P18_NumberOfBits.printBits(num);
        int result = unsetAllLSBBitsUptoBit(num,bit);
        System.out.print("Final Result after Unsetting Bits upto "+bit+"th bit : ");
        P18_NumberOfBits.printBits(result);
        System.out.println("Decimal is "+result);

    }

    public static int unsetAllLSBBitsUptoBit(int n, int ithBit){
       return n & (~((1 << ithBit+1)-1));
    }
}
