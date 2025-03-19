public class P14_LCM
{
    public static void main(String[] args) {
        int lcm  = LCM(12,27);
        System.out.println("LCM is "+lcm);

    }

    public static int LCM(int num1, int num2){
        int res = (num1 * num2)/P13_EucledianGCD.efficientEucledianGCD(num1,num2);
        return res;
    }
}
