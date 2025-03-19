import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArrayByK
{
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k=2;
        System.out.println(Arrays.toString(rotate(nums,k)));
    }

    public static int[] rotate(int[] num,int k){
        int n = num.length;
        reverse(num,0,n-1);
        reverse(num,0,k-1);
        reverse(num,k,n-1);

        return num;
    }

    public static void reverse(int[] ary,int start,int end){
        while(start<=end){
            int temp = ary[start];
            ary[start]=ary[end];
            ary[end]=temp;
            start++;
            end--;
        }
    }
}



