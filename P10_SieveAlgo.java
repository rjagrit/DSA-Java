import java.util.Arrays;
import java.util.Scanner;

public class P10_SieveAlgo
{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter The number:");
        int num = obj.nextInt();
        SieveAlgo(num);
    }

    public static void SieveAlgo(int n){
        boolean ary[] = new boolean[n+1];
        Arrays.fill(ary,true);
        int pointer = 2;
        while(pointer<=n){
            if(ary[pointer]==true){
                for(int i = pointer+pointer;i<=n;i=i+pointer){
                    ary[i]=false;
                }
            }
            pointer++;
        }
        for(int i=2;i<=n;i++){
            if(ary[i]!=false)
                System.out.print(i+", ");
        }
    }
}
