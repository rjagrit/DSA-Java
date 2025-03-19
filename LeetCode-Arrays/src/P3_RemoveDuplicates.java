//Problem-26

import java.util.Arrays;

public class P3_RemoveDuplicates {
    public static void main(String[] args) {
        int[] ar={1,1,2,3,4,5,6,7,7,7,7};
        removeDuplicates(ar);
    }

    static void removeDuplicates(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(i<a.length-1 && a[i]==a[i+1]){
                continue;
            }
            else{
                System.out.print(a[i]);
                if(i!=a.length-1){
                    System.out.print(",");
                }
                count++;
            }
        }
        System.out.println();
        System.out.println("Count is "+count);
    }
}
