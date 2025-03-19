public class T10 {
    public static void main(String[] args) {
        int[] ar={2,2,4,4,5,6,7,9,9,9,9};
        int target = 9;
        int firstOccurence = binarySearchFLOccurence(ar,target,true); // First Occurence
        int lastOccurence =binarySearchFLOccurence(ar,target,false); // Last Occurence
        System.out.println("Count of element "+target+" is "+(lastOccurence-firstOccurence+1));
    }
    static int binarySearchFLOccurence(int[] a,int target,boolean isFirst){
        int ans=-1;
        int start=0;
        int end=a.length-1;

        while(start<=end){
            // Middle Element
            int mid= start + (end-start)/2;
            if(a[mid]==target){
                ans=mid; // Possible value not the Exact value
                if(isFirst){
                    end= mid-1; // left half
                }
                else{
                    start= mid+1;
                }
            }
            else if(a[mid]<target){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return ans;
    }
}
