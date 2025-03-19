public class P40_linearSearch2dArray
{
    public static void main(String[] args){
        int a[][] = {
                {1,2,3,4,5},
                {7,8,9,10,11},
                {12,13,14,15,16},
                {17,18,19,21},
        }; // Array declaration

        // a.length find size of 1-d array and a[i].length find size of Array inside the each index
        linearSearchIn2dArray(a,15);
    }

    public static void linearSearchIn2dArray(int ary[][], int elmt){
        int pos1=-1;
        int pos2=-1;
        for(int i=0;i< ary.length;i++){
            for(int j=0;j<ary[i].length;j++){
                if(ary[i][j]==elmt){
                    pos1=i;
                    pos2=j;
                }
            }
        }
        if(pos1==-1){
            System.out.println("Element Not Founded");
        }
        else{
            System.out.println("Element founded at index-["+pos1+"]["+pos2+"]");
        }
    }
}
