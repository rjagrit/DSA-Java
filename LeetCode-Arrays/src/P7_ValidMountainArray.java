// L-941

public class P7_ValidMountainArray {
    public static void main(String[] args) {
        int[] a={2,3,4,5,11,5,4,3,1};
        if(validMointainArray(a)){
            System.out.println("Mountain Array");
        }else{
            System.out.println("Not Mountain Array");
        }
    }

    static boolean validMointainArray(int[] ar){
        int index=0;

        //Checking Increasing order
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

        //Checking Decreasing order
        while(index<ar.length-1){
            if(ar[index]>ar[index+1]){
                index++;
            }else{
                break;
            }
        }
        return (index==ar.length-1); //if we reached at end or not
    }

}
