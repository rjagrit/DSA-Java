public class P46_OccurencesOfTarget
{
    public static void main(String[] args) {
        int a[] = {4,4,8,8,8,15,16,23,23,42};
        int firstOccurence = binarySearch(a,2,true);
        int lastOccurence = binarySearch(a,2,false);
        if(firstOccurence == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Occurence of target element is : "+(lastOccurence-firstOccurence+1));
        }
    }

    static int binarySearch(int ar[],int target, boolean isFirst){
        int ans =-1;
        int start=0; // starting index
        int end=ar.length-1; // Last Index

        while(start<=end){
            int mid= start + (end-start)/2;
            if(ar[mid]==target){
                ans = mid; // Possible answer
                if(isFirst){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else if(ar[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

}
