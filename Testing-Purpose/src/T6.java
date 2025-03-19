public class T6
{
    public static void main(String[] args) {
        int ary[] = {1,2,3,4,5,1,1,2};
        occurenceOfElement(ary,1,false); // First Occurence
        occurenceOfElement(ary,1,true); // Last Occurence

    }

    public static void occurenceOfElement(int a[], int elmt,boolean occurence){
        int ans=-1;
        int f=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==elmt){
                ans=i;
                if(occurence==false){
                    f=1;
                    break;
                }
            }
        }
        if(ans==-1){
            System.out.println("Element Not Founded");
        }
        else{
            if(f==1){
                System.out.println("First Occurence of "+elmt+ " is at index-"+ans);
            }
            else{
                System.out.println("Last Occurence of "+ elmt+" is at index-"+ans);
            }
        }
    }
}
