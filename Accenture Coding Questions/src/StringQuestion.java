/* You are Given a String S and your task is to find and return the count
of permutations formed by fixing the positions of the vowels present in the String.
* */
import java.util.Scanner;
public class StringQuestion
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s=  obj.next();
        int consonant = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='A' && s.charAt(i)!='E' && s.charAt(i)!='I' && s.charAt(i)!='O' && s.charAt(i)!='U')
                consonant++;
        }

        if(consonant==0)
            System.out.println("0");

        int fact = 1;
        for(int i=1;i<=consonant;i++){
            fact *=i;
        }

        System.out.println(fact);

    }
}
