public class T9 {
    public static void main(String[] args) {
        int[] ar={2,2,4,4,5,6,7,9,9};
        binarySearchFLOccurence(ar,9,true); // First Occurence
        binarySearchFLOccurence(ar,9,false); // Last Occurence
    }
    static void binarySearchFLOccurence(int[] a,int target,boolean isFirst){
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

        if(ans==-1){
            System.out.println("Element not founded");
        }
        else{
            System.out.println("Element Founded at index-"+ans);
        }
    }
}
