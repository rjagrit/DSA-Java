/*
1. Find the Minimum Element in the bitonic array
2. Check whether the given array is a bitonic array
 */

public class T13 {
    public static void main(String[] args) {
        int[] ar={2,5,7,8,6,4,1,0};
        int[] ar1={2,3,4,1,7};
        minimumElementInBitonicArray(ar);

        if(validatingBitonicArray(ar1)){
            System.out.println("Bitonic Array");
        }else{
            System.out.println("Not a Bitonic Array");
        }
    }

    static void minimumElementInBitonicArray(int[] a){
        if(a[0]<a[a.length-1]){
            System.out.println(a[0]+" is the Minimum Element");
        }else{
            System.out.println(a[a.length-1]+" is the Minimum Element");
        }
    }

    static boolean validatingBitonicArray(int[] ar){
        int index=0;
        int n=ar.length-1;

        // Checking Increasing Order
        while(index<ar.length-1){
            if(ar[index]<ar[index+1]){
                index++;
            }else{
                break;
            }
        }
        if(index==0 || index==ar.length-1){
            return false;
        }

        //Checking Decreasing Order
        while(index<ar.length-1){
            if(ar[index]>ar[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==ar.length-1);
    }
}
