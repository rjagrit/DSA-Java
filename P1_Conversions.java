public class P1_Conversions
{
    public static void main(String[] args) {
//        System.out.println(decimalToBinary(5));
        decimalToanyBase(6,2);
//        binaryToDecimal(101);
//        anyBaseToDecimal(101,2);
    }
    static int decimalToBinary(int decimalNum){
        int resNum = 0;
        int power = 0;

        while(decimalNum>0){

            int rem = decimalNum%2;
            decimalNum = decimalNum / 2;
            resNum+=  rem * Math.pow(10,power);
            power++;
        }
        return resNum;
    }

    static void decimalToanyBase(int decimalNum, int base){
        int sum = 0;
        int power = 0;

        while(decimalNum>0){
            int rem = decimalNum % base;
            decimalNum = decimalNum / base;
            sum+= rem * Math.pow(10,power);
            power++;
        }
        System.out.println(sum);
    }

    static void binaryToDecimal(int binaryNum){
        int resNum = 0;
        int power = 0;

        while(binaryNum>0){
            int unitDigit = binaryNum%10;
            binaryNum = binaryNum / 10;
            resNum+=  unitDigit * Math.pow(2,power);
            power++;
        }
        System.out.println(resNum);
    }

    static void anyBaseToDecimal(int binaryNum, int base){
        int resNum = 0;
        int power = 0;

        while(binaryNum>0){
            int unitDigit = binaryNum%10;
            binaryNum = binaryNum / 10;
            resNum+=  unitDigit * Math.pow(base,power);
            power++;
        }
        System.out.println(resNum);
    }
}
