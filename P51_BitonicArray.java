public class P51_BitonicArray {
    public static void main(String[] args) {
        int[] ar={2,4,5,9,11,7,3,13};
//        minimumElementInBitonicArray(ar);

        if(validMountainArray(ar)){
            System.out.println("Mountain Array");
        }else{
            System.out.println("Not a Mountain Array");
        }
    }

    static void minimumElementInBitonicArray(int[] a){
        if(a[0]<a[a.length-1]){
            System.out.println("Minimum Element is "+a[0]+" at Index-0");
        }else{
            System.out.println("Minimum Element is "+a[a.length-1]+" at Index-"+(a.length-1));
        }

    }

    static boolean validMountainArray(int[] arr){
        int index=0;
        int n=arr.length;
        //Check upto n-2, because if we reached at last then we can't compare with next element

        //finding all increasing sequence
        while(index<arr.length-1){
            if(arr[index]<arr[index+1]){
                index++;
            }else{
                break;
            }
        }

        // index==0 means there is no increasing order present
        //index==n-1 means there is only increasing order
        if(index==0 || index==n-1){
            return false;
        }

        //finding all decreasing sequence
        while(index<arr.length-1){
            if(arr[index]>arr[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==n-1);//means we reached at last index
    }
}
