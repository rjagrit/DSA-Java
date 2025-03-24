public class P53_SortedRotatedArraySearch {
    public static void main(String[] args) {
        int[] ar={4,5,6,7,0,1,2};
        int res=searchInSortedRotatedArray(ar,0);
        if(res==-1){
            System.out.println("Element Not Founded");
        }else{
            System.out.println("Element found at index-"+res);
        }
    }
    static int searchInSortedRotatedArray(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        // Binary Search Condition
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }

            //when left side is sorted
            if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

            //when right side is sorted
            else{
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return ans;
    }
}
