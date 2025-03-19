public class P4_NumToThePower
{
    public static void main(String[] args) {
        numPower(5,3);
    }

    static double numPower(int num,int power){
        double res=1;
        while(power>0){
            res = res * num;
            power--;
        }
        System.out.println(res);
        return res;
    }
}
