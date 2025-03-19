//P-35

public class P5_SearchInsertPosition {
    public static void main(String[] args) {
        int[] ar={1,3,5,6};
        int indexVal=searchInsert(ar,7);
        System.out.println(indexVal);
    }

    static int searchInsert(int[] a,int target){
        int start=0;// start index
        int end=a.length-1;// end index

        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                return mid;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
