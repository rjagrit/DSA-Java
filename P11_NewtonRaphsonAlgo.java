import java.util.Scanner;

public class P11_NewtonRaphsonAlgo
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Which Number Root You Want: ");
        double value = obj.nextDouble();
        int funAns = (int)findRoot(value);
        System.out.println("Root of "+value+" is "+funAns);
    }

    public static double findRoot(double num){
        double root;
        double tolerance = 0.0001;
        double x = num;

        while(true){
            root = 0.5 * (x + (num/x));
            double ans = x-root;
            if(ans<tolerance){
                break;
            }
            x = root;
        }
        return root;
    }
}
