
public class P48_MinimumAbsoluteDifference {
    public static void main(String[] args) {
        int[] ary={2,2,4,5,7,9,25,56,88,94};
        int result= minimumAbsoluteDifference(ary,0);
        System.out.println("Minimum Absolute Difference is "+result);
    }

    static int minimumAbsoluteDifference(int[] ar,int target){

        int ans=-1;
        int start=0;
        int end=ar.length-1;

        while(start<=end){
            int mid=start + (end-start)/2;
            if(ar[mid]==target){
                ans=mid;
                break;
            }else if(ar[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        // If element Exist then Answer will be Zero
        int res=0;

        // If Element not exist
        if(ans==-1){
            if(end==-1){
                res=Math.abs(target-ar[start]);
            }else if(start==ar.length){
                res=Math.abs(target-ar[end]);
            }else{
                int ans1=Math.abs(target-ar[start]);
                int ans2=Math.abs(target-ar[end]);
                res=(ans1<ans2)?ans1:ans2;
            }
        }
        return res;
    }
}
