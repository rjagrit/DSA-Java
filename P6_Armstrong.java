public class P6_Armstrong
{
    public static void main(String[] args) {
        armstrongCheck(153);
    }

    static void armstrongCheck(int num){
        int res =0;
        int copyOgNum=  num;
        while(num>0){
            int digit = num % 10;
            res =res + (int)Math.pow(digit,3);
            num = num/10;
        }
        if(copyOgNum==res)
            System.out.println("Number is Armstrong Number");
        else
            System.out.println("Number is not a Armstrong Number");
    }
}
