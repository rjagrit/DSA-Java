public class P49_BinarySearchOnInfiniteArray {
    public static void main(String[] args) {
        int[] a={2,2,4,5,7,9,25,56,88,94};
        int[] rg=findRangeOfInfiniteArray(a,25);
        System.out.println("Range is "+rg[0]+"-"+rg[1]);
        binarySearchInfiniteArray(a,25,rg[0],rg[1]);
    }

    static void binarySearchInfiniteArray(int a[],int target,int start,int end){
        int ans=-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                ans=mid;
                break;
            }
            else if(a[mid]<target){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(ans==-1){
            System.out.println("Element not founded");
        }
        else{
            System.out.println("Founded Element "+target+" at index: "+ans);
        }
    }

    static int[] findRangeOfInfiniteArray(int[] ar,int target){
        int[] range=new int[2];// To get the Index Number of Start and Index [0th=startIndex,1th=endIndex]
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
}
