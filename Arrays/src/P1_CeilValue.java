// 744. Find Smallest Letter Greater Than Target

public class P1_CeilValue {
    public static void main(String[] args) {
        char[] ar={'c','f','j'};
        char[] ar1={'x','x','y','y'};
        char result=ceilValue(ar,'a');
        char result1=ceilValue(ar1,'z');
        System.out.println(result);
        System.out.println(result1);
    }
    static char ceilValue(char[] a, char target){
        char ans='$';
        int start=0;
        int end= a.length-1;

        while(start<=end){
            int mid= start + (end-start)/2;
            if(a[mid]<=target){
                start=mid+1;
            }
            else{
                end=mid-1;
                ans=a[mid];
            }
        }
        return (ans=='$')?a[0]:ans;
    }
}
