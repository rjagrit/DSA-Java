public class T11 {
    public static void main(String[] args) {
        int[] a={2,2,4,5,7,9,25,56,88,94};
        int[] rangeResult=rangeInfiniteArray(a,25);
        System.out.println("Range is "+rangeResult[0]+","+rangeResult[1]);
        binarySearch(a,25,rangeResult[0],rangeResult[1]);
    }

    // Finding Range in the Infinite Array
    static int[] rangeInfiniteArray(int[] ar,int target){
        int[] range=new int[2];
        int start=0;
        int end=1;

        while(ar[end]<target){
            start=end;
            end=2*end;
        }
        range[0]=start;
        range[1]=end;
        return range;
    }

    static void binarySearch(int[] ar,int target,int start,int end){
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(ar[mid]==target){
                ans=mid;
                break;
            }
            else if(ar[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element founded at-"+ans);
        }
    }
}
