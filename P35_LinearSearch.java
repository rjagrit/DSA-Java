public class P35_LinearSearch
{
    public static void main(String[] args) {
        int ary[] = {1,5,6,8,9,2};
        linearSearch(ary,19);

    }

    public static void linearSearch(int a[], int element){
        int ans=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==element){
                ans=i;
                break;
            }
        }
        if(ans == -1){
            System.out.println("Element Not Founded in the Array");
        }
        else{
            System.out.println("Element found at index-"+ans);
        }
    }
}
