public class T8 {
    public static void main(String[] args){
        int[] ary={1,2,3,4,5};
        binarySearch(ary,3);
    }

    static void binarySearch(int[] a,int target){
        int ans=-1;
        int startIndex= 0;
        int endIndex= a.length-1;

        while(startIndex<=endIndex){
            // Middle Element
            int mid= startIndex + (endIndex-startIndex)/2;
            if(a[mid]==target){
                ans=mid;
                break;
            }
            else if(a[mid]<target){
                startIndex=mid+1;

            }
            else{
                endIndex=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("Element not founded");
        }
        else{
            System.out.println("Element found at index-"+ans);
        }
    }
}
