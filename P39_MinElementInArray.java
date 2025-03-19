public class P39_MinElementInArray
{
    public static void main(String[] args) {
        int ary[] = {2,3,6,8,9,1,4};
        minElement(ary);
    }

    public static void minElement(int a[]){
        int min=a[0];
//        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
        }
        System.out.println("Minimum Element is "+min);
    }
}
