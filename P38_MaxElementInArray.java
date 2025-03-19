public class P38_MaxElementInArray
{
    public static void main(String[] args) {
        int ary[] = {2,3,6,8,9,1,4};
        maxElement(ary);
    }

    public static void maxElement(int a[]){
        int max=a[0];
//        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i])
                max=a[i];
        }
        System.out.println("Maximum Element is "+max);
    }
}
