public class P45_BinarySearchFLOccurence
{
    public static void main(String[] args) {
        int arr[]={2,2,4,4,6,8,9};
        binarySearch(arr,4,true); // first occurence
        binarySearch(arr,4,false); // last occurence
    }

    public static void binarySearch(int a[],int target, boolean isFirst){
        int ans=-1;
        int start=0;// start index
        int end=a.length-1;// end index

        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                ans=mid; // This can be a possible answer
                if(isFirst){
                    end=mid-1; // first half
                }
                else{
                    start=mid+1; // second half
                }
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("Element not founded");
        }
        else{
            System.out.println("Founded Element "+target+" at index: "+ans);
        }
    }
}
