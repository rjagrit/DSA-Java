//P-34. Find First and Last Position of elements in Sorted Array

public class P2_Problem34
{
        public static void main(String[] args) {
            int arr[]={2,2,4,4,6,8,9};
            int result[] = new int[2];
            int first= binarySearch(arr,4,true); // first occurence
            int last= binarySearch(arr,4,false); // last occurence
            result[0]=first;
            result[1]=last;
        }

        public static int binarySearch(int a[],int target, boolean isFirst){
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
            return ans;
        }
        
}

