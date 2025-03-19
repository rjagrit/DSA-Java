public class P37_LinearSearchMultipleResults
{
    public static void main(String[] args) {
        int ary2[] = {2,2,4,5,6,2,6,7};
        linearSearchMultipleIndexes(ary2, 2);
    }
    public static void linearSearchMultipleIndexes(int a[], int element){
        int result[] = new int[a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            if(a[i] == element){
                result[k]=i;
                k++;
            }
        }
        if(k == 0){
            System.out.println("Element Not Founded");
        }
        else{
            for(int i=0;i<k;i++){
                System.out.println("Element found at index-"+result[i]);
            }
        }
    }
}
