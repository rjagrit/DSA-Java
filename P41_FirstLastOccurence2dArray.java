public class P41_FirstLastOccurence2dArray
{
        public static void main(String[] args){
            int a[][] = {
                    {2,4,1,5,1},
                    {6,7,3,4,2},
                    {8,1,2,2,3},
                    {5,5,5,4},
            }; // Array declaration

            // a.length find size of 1-d array and a[i].length find size of Array inside the each index
            linearSearchIn2dArray(a,4,false); // first occurence
            linearSearchIn2dArray(a,4,true); // last occurence
        }

        public static void linearSearchIn2dArray(int ary[][], int elmt,boolean findLast){
            int pos1=-1;
            int pos2=-1;
            for(int i=0;i< ary.length;i++){
                boolean found = false;
                for(int j=0;j<ary[i].length;j++){
                    if(ary[i][j]==elmt){
                        pos1=i;
                        pos2=j;
                        if(findLast==false){
                            found = true;
                            break;
                        }
                    }
                }
                if(found==true){
                    break;
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