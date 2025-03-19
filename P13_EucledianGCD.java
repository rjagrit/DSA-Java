public class P13_EucledianGCD
{
    public static void main(String[] args) {
        eucledianGCD(24,36);
        efficientEucledianGCD(8,2);
    }

    public static void eucledianGCD(int num1, int num2){
        while(num1!=0 && num2!=0){
            if(num1>num2)
                num1 = num1-num2;
            else
                num2 = num2-num1;
        }
        int res = num1;
        if(num1==0)
            res=num2;

        System.out.println("GCD is "+res);
    }

    public static int efficientEucledianGCD(int num1,int num2){
        while(num1!=0 && num2!=0){
            if(num1>num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        int res1 = num1;
        if(num1==0)
            res1 = num2;

//        System.out.println("GCD is "+res1);
        return res1;
    }
}
