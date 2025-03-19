import java.util.Scanner;

public class Inputs_and_Operators
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String name = obj.nextLine();
        System.out.println("Hi "+ name);

        obj.close();
    }
}
