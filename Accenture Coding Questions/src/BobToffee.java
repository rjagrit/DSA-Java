/*
Bob goes to supermarket to shop candies represented by an array A for Halloween party,
his mother gave him some money M. Due to the festive season, there are several offers
in the supermarket. One such offer useful for Bob is, if price of the Candy is a multiple of 5
he can buy it without spending any money o/w he will spend money equal to Ai which is the price of a particular
candy. Bob can shop as long as he has money. Your task to find and return the maximum number of candies Bob can buy.

 */
import java.util.*;
public class BobToffee
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter size of candyary");
        int n = obj.nextInt();
        int[] candyary = new int[n];
        int count = 0;
        System.out.println("Enter the Value of Candies");
        for(int i=0;i<n;i++){
            candyary[i] = obj.nextInt();
        }
        Arrays.sort(candyary);//Sort the array
        System.out.print("Enter the Money Bob Had: ");
        int money = obj.nextInt();

        for(int i=0;i<n;i++){
            if(candyary[i]%5==0){
                count++;
            }
            else if(money>=candyary[i]){
                count++;
                money=money-candyary[i];
            }
        }
        System.out.println("Bob can Buy Candies: "+count);
    }
}
