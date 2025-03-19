public class P7_palindrome
{
    public static void main(String[] args) {
        palindromCheck(123251);
    }

    static void palindromCheck(int num){
        int resNum = 0;
        int copy = num;
        while(num>0){
            int rem = num % 10;
            num = num / 10;
            resNum = resNum * 10 + rem;
        }
        if(copy==resNum)
            System.out.println("Number is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }
}
