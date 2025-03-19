import java.util.Arrays;

public class T12 {
    public static void main(String[] args) {
        int[] ar={9,9};
        System.out.println(Arrays.toString(plusOne(ar)));
    }
    static int[] plusOne(int[] a){
        for(int i=a.length-1;i>=0;i--){
            if(a[i]<9){
                a[i]++;
                return a;
            }
            //when there is 9 at position
            a[i]=0;
        }
        //Single 9
        int[] newArray= new int[a.length+1];
        newArray[0]=1;
        return newArray;
    }
}
