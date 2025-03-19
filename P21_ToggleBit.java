import java.util.Scanner;
public class P21_ToggleBit
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num=obj.nextInt();
        System.out.print("Enter the Bit:");
        int bit=obj.nextInt();
        System.out.println("Binary of "+num+" is "+P1_Conversions.decimalToBinary(num));
        int finalresult =toggleBit(num,bit);
        System.out.println("Binary of "+finalresult+" is "+P1_Conversions.decimalToBinary(finalresult));
    }

    public static int toggleBit(int num,int bit){
        num = num ^ (1<<bit);
        System.out.println();
        System.out.println("After toogle Bit-"+bit+" result is "+num);
        return num;
    }
}
