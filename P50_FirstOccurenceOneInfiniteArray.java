public class P50_FirstOccurenceOneInfiniteArray {
    public static void main(String[] args) {
        int[] arr1={0,0,0,0,0,1,1,1,1,1};
        findFirstOneInBinaryInfinteSortedArray(arr1);
    }
    static void findFirstOneInBinaryInfinteSortedArray(int[] a){
        int range[]=findRangeInInfiniteArray(a,1);
        int ans=binarySearchFirstOccurence(a,1,range[0],range[1]);
        if(ans==-1){
            System.out.println("Element not founded");
        }
        else{
            System.out.println("Founded Element at index: "+ans);
        }
    }

    static int[] findRangeInInfiniteArray(int[] ar,int target){
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

    public static int binarySearchFirstOccurence(int a[],int target,int start, int end){
        int ans=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target) {
                ans = mid; // This can be a possible answer
                end = mid - 1; // first half (first Occurence)
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

}
