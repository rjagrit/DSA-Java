public class P36_FirstLastOccurence
{
    public static void main(String[] args) {
        int ary[]= {1,2,3,4,2,2};
        occurence(ary,2,false); // First Occurence
        occurence(ary,2,true); // Last Occurence
    }
    public static void occurence(int a[], int element, boolean findLast){
        int ans = -1;
        for(int i=0;i<a.length;i++){
            if(a[i] == element){
                ans = i;
                if(findLast == false)
                {
                    break;
                }
            }
        }
        if(ans == -1){
            System.out.println("Element Not Founded");
        }
        else{
            System.out.println("Element found at index-"+ans);
        }
    }
}
