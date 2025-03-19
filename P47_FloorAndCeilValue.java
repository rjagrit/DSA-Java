public class P47_FloorAndCeilValue {

    public static void main(String[] args) {
        int arr[]={4,4,8,8,8,15,16,23,23,42};
        int ans = binarySearchFloorValue(arr,14);
        System.out.println("Ans is "+ans);

        int ans1 = binarySearchCeilValue(arr,43);
        System.out.println("Ans is "+ans1);
    }
    static int binarySearchFloorValue(int a[], int target){
        int ans=-1;
        int start=0;// start index
        int end=a.length-1;// end index

        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                ans=a[mid];
                break;
            }
            else if(a[mid]<target){
                start=mid+1;
                ans= a[mid];
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    static int binarySearchCeilValue(int a[], int target){
        int ans=-1;
        int start=0;// start index
        int end=a.length-1;// end index

        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                ans=a[mid];
                break;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
                ans= a[mid];
            }
        }
        return ans;
    }
}
