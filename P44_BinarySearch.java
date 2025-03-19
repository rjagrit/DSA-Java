public class P44_BinarySearch
{
    public static void main(String[] args) {
        int ar[]={2,3,5,8,9,10,45,54}; // Increasing Order Array
        int ar2[]={98,76,54,43,34,29,12,9,3,1}; //Decreasing Order Array
//        int ar3[]={2,43,6,9,1,87}; // not working properly for it
        binarySearch(ar,45);
        binarySearch2(ar2,76); // for decreasing order
        binarySearchAgnostic(ar,45);
        binarySearchAgnostic(ar2,43);

//        binarySearchAgnostic(ar3,1);

    }
    public static void binarySearch(int a[],int target){
        int ans=-1;
        int start=0;// start index
        int end=a.length-1;// end index

        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                ans=mid;
                break;
            }
            else if(a[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        if(ans==-1){
            System.out.println("Element not founded");
        }
        else{
            System.out.println("Founded Element "+target+" at index: "+ans);
        }
    }

    public static void binarySearch2(int a[],int target){
        int ans=-1;
        int start=0;// start index
        int end=a.length-1;// end index

        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==target){
                ans=mid;
                break;
            }
            else if(a[mid]<target){
                end=mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(ans==-1){
            System.out.println("Element not founded");
        }
        else{
            System.out.println("Founded Element "+target+" at index: "+ans);
        }
    }

    public static void binarySearchAgnostic(int a[],int target){
        int start=0;
        int end=a.length-1;
        if(a[start]<=a[end]){
            binarySearch(a,target);
        }
        else{
            binarySearch2(a,target);
        }
    }
}
