import java.util.Scanner;

public class P23_PowerOfTwo {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int num = obj.nextInt();
        P18_NumberOfBits.printBits(num);
        isPowerOfTwo(num);
    }

    public static void isPowerOfTwo(int num){
        if((num & num-1)==0){
            System.out.println("Number is Power of Two");
        }
        else{
            System.out.println("Number is not a Power of Two");
        }
    }
}
