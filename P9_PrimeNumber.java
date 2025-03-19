public class P9_PrimeNumber
{
    public static void main(String[] args) {
        primeCheck(59);
    }

    public static void primeCheck(int num){
        int ct = 2;
        int sqroot = (int)Math.sqrt(num);
        while(ct<=sqroot){
            if(num%ct==0) {
                System.out.println(num + " is not a Prime Number");
                return;
            }
            ct++;
        }
        System.out.println(num+" is a Prime Number");
    }
}
