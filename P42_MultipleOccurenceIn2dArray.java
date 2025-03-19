public class P42_MultipleOccurenceIn2dArray
{
    public static void main(String[] args) {
        int a[][]={
                {6,7,3,4,2},
                {2,4,1,5,1},
                {8,1,2,2,3},
                {5,5,5,8},
                {4,3,2,3,1}
        };

        multipleOccurencesIn2ary(a,4);
    }
    public static void multipleOccurencesIn2ary(int ary[][],int e){
        // Total elements of a 2d Array
        int size= ary.length * ary[0].length;
        /*
      ----------------------------------
      | int size=0                      |
      | Total elements If Jacked Array  |
      | for(int i=0;i<ary.length;i++)   |
      | {                               |
      |     int size=size+ary[0].length;|
      | }                               |
      -----------------------------------
         */
        int ans[][]=new int[size][2];
        int k=0;
        for(int i=0;i<ary.length;i++){
            for(int j=0;j<ary[i].length;j++){
                if(e==ary[i][j]){
                    ans[k][0]=i;
                    ans[k][1]=j;
                    k++;
                }
            }
        }
        if(k==0){
            System.out.println("Element not founded");
        }
        else{
            for(int i=0;i<k;i++){
                System.out.println("Element found at-"+ans[i][0]+","+ans[i][1]);
            }
        }
    }
}
