//P137

public class P2_SingleNumber {
    public static void main(String[] args) {
        int a[]={2,2,1};
        int res=singleNumber(a);
        System.out.println("Single Number in the Array is "+res);
    }
    public static int singleNumber(int ar[]){
        int num=0;
        for(int i=0;i<ar.length;i++){
            num = num ^ ar[i];
        }
        return num;
    }
}
