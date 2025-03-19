public class P3_ReverseTheNum
{
    public static void main(String[] args) {
        reverseNumByExtract(2345);
    }

    static void reverseNumByExtract(int num){
        int revnum=0;
        while(num>0){
            int extractdigit = num % 10;
            num = num/10;
            revnum=revnum * 10 + extractdigit;
        }
        System.out.println("Reversed Number is "+revnum);
    }
}
