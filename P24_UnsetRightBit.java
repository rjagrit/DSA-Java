import java.util.*;

public class P24_UnsetRightBit
{
    public static void main(String[] args){
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = obj.nextInt();
        P18_NumberOfBits.printBits(num);
        int res = unSetRightMostSetBit(num);
        P18_NumberOfBits.printBits(res);
    }
    public static int unSetRightMostSetBit(int num){
        return num & num-1;
    }
}
