public class T7
{
    public static void main(String[] args){
        // Simple 2d Array
        int [][]ary={
                {2,4,1,5,1},
                {9,4,5,1,6},
                {3,6,1,7,6},
                {8,4,1,7,8},
                {6,1,3,7,2}
        };
        // Jacked Array
        int [][]ary2={
                {1,8,2,3,9,3},
                {3,9,3,4,7,1},
                {6,2,5},
                {5,4,2,1},
                {2,3,7,2},
        };
//        multipleOccurencesIn2dArray(ary,4); // For Simple 2d Array
        multipleOccurencesIn2dArray(ary2,5);
    }

    public static int simpleAry2d(int [][]ar){
        int size;
        return size = ar.length * ar[0].length;
    }

    public static int jackedArySize(int [][]arr){
        int size=0;
        for(int i=0;i<arr.length;i++){
            size+=arr[i].length;
        }
        return size;
    }

    public static void multipleOccurencesIn2dArray(int [][]a, int target){
        // Size of simple the 2d Array
        int s=simpleAry2d(a);

        //Jacked Array Size
//        int s=jackedArySize(a);

        int ans[][]= new int[s][2];
        int k=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(target==a[i][j]){
                    ans[k][0]=i;
                    ans[k][1]=j;
                    k++;
                }
            }
        }
        if(k==0){
            System.out.println("Element Not Founded in the 2d Array");
        }
        else{
            for(int i=0;i<k;i++){
                System.out.println("Found At: "+ans[i][0]+","+ans[i][1]);
            }
        }
    }
}
