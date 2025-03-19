import java.util.Arrays;

public class P6_PlusOne {
    public static void main(String[] args) {
        int[] ar={9,9};
        System.out.println(Arrays.toString(plusOne(ar)));
    }
    static int[] plusOne(int[] a){
        for(int i=a.length-1;i>=0;i--) {
            if (a[i] < 9) {
                a[i]++;
                return a;
            }
            // when it will be 9 at last position
            a[i]=0;
        }
        //Single Digit
        int[] nArray=new int[a.length+1];
        nArray[0]=1;
        return nArray;
    }
}
