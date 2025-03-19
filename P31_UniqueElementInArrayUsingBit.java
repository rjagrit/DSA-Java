/*
XOR All elements of array we get the unique element and its time complexity is O(n).
 */

import java.util.Scanner;

public class P31_UniqueElementInArrayUsingBit
{
    public static void main(String[] args) {
        int ar[] = {2,9,19,9,2,6,3,1,3,1,19,16};
        int res= 0;
        for(int i=0;i<ar.length;i++){
            res = res ^ ar[i];
        }
        System.out.println("Unique Element in array will be "+ res);
    }
}
