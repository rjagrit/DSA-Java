import java.util.Scanner;

public class P12_GCD
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number-1:");
        int num1=obj.nextInt();

        System.out.print("Enter Number-2:");
        int num2=obj.nextInt();

        int ans = GCD(num1,num2);
        System.out.println("GCD of "+num1+" and "+num2+" is "+ans);
    }
    static int GCD(int n1,int n2){
        int min=(n1<=n2)?n1:n2;
        while(min<0){
            if(n1%min==0 && n2%min==0){
                break;
            }
        }
        return min;
    }
}
