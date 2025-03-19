//L-852

public class P52_PeakElementInBitonicArray {
    public static void main(String[] args) {
        int[] ar={2,5,9,11,17,4,1};
        int result = peakEelement(ar);
        if(result==-1){
            System.out.println("No Peak Element");
        }else{
            System.out.println("Peak Element Index is-"+result);
        }
    }
    static int peakEelement(int[] ar){
        int start=0;
        int end=ar.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid!=0 && mid!=ar.length-1 && ar[mid]>ar[mid+1] && ar[mid]>ar[mid-1]){
                return mid;
            }else if(mid!=ar.length-1 && ar[mid]<ar[mid+1]){
                // Increasing order
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }

}
