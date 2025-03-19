/*
Facts:
1) (1<<5) binary is 00100000 that is equivalent to ' ' it is known as space.
2) '_', it is underscore having binary 01011111 can be used in replacement of ~(1<<5) binary is 11011111 c

 */

import java.util.Scanner;

public class P29_CharacterConversion
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Which Conversion You want"+"\n1. Uppercase to Lowercase\n2. Lowercase to Uppercase");
        int num = obj.nextInt();

        if(num==1){
            System.out.print("Enter the Uppercase Character: ");
            int uppernum= obj.next().charAt(0); // character can convert implicitly to int
            char upperch = (char)(uppernum | (1<<5)); //explicit conversion
            System.out.println("Lowercase of "+(char)uppernum+": "+upperch);
        }
        else{
            System.out.print("Enter the Lowercase Character: ");
            int lowernum= obj.next().charAt(0); // character can convert implicitly to int
            char lowerch = (char)(lowernum & ~(1<<5));
            System.out.println("Uppercase of "+(char)lowernum+": "+lowerch);
        }
    }
}
