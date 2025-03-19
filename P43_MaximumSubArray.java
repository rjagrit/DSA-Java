public class P43_MaximumSubArray
{
    public static void main(String[] args) {
        int ar[][]= {
                {2,4,1,5,1}, //13
                {6,7,3,4,2}, //22
                {8,1,2,2,3}, //16
                {5,5,5,8,4}, // 27
        };
        findMaximumSumSubArray(ar);
        findMinimumSumSubArray(ar);
    }
    public static void findMaximumSumSubArray(int a[][]){
        int max= Integer.MIN_VALUE; // If there is negative value at 0th index then it creates problem
        int resIndex=-1;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
            if(sum>max){
                max=sum;
                resIndex=i;
            }
        }
        System.out.println("Maximum Sum of Sub-Array:"+max+"\nIndex:"+resIndex);
    }
    public static void findMinimumSumSubArray(int a[][]){
        int min= Integer.MAX_VALUE; // If there is negative value at 0th index then it creates problem
        int resIndex=-1;
        for(int i=0;i<a.length;i++){
            int sum=0;
            for(int j=0;j<a[i].length;j++){
                sum=sum+a[i][j];
            }
            if(sum<min){
                min=sum;
                resIndex=i;
            }
        }
        System.out.println("Minimum Sum of Sub-Array:"+min+"\nIndex:"+resIndex);
    }
}
