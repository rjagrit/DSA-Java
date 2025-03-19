public class P5_CountTheDigits
{
    public static void main(String[] args) {
        countDigits(2312);
    }
    public static void countDigits(int num){
        int counter = 0;
        while(num>0){
            num = num /10;
            counter++;
        }
        System.out.println("Digits are:"+counter);
    }
}
