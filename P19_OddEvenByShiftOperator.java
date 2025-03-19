import java.util.Scanner;
public class P19_OddEvenByShiftOperator
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = obj.nextInt();
        OddEvenNum(num);
    }
    public static void OddEvenNum(int num){
        if(isBits(num,0)){
            System.out.println("Number is Odd");
        }
        else{
            System.out.println("Number is Even");
        }
    }

    public static boolean isBits(int num, int shiftbits){
        int res = num & (1<<shiftbits);
        return (res==0)?false:true;
    }
}
