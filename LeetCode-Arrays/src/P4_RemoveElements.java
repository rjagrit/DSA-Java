//P-27

public class P4_RemoveElements {
    public static void main(String[] numsgs) {
        int[] a={0,1,2,2,3,0,4,2};
        System.out.println(removeElement(a,2));
    }
    static int removeElement(int[] nums,int val){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
