public class P8_PrintAllDivisors
{
 public static void main(String [] args){
    printAllDivisors(36);
 }

 public static void printAllDivisors(int num){
     int divisor = 1;
     int sqroot = (int)Math.sqrt(num); // condition of stoping the program
     while(divisor<=sqroot){
         if(num%divisor==0){
             System.out.println(divisor+" is a Divisor of "+ num);
             int otherNumber = num/divisor;
             if(otherNumber!=divisor){
                 System.out.println(otherNumber+" is a Divisor of "+ num);
             }
         }
         divisor++;
     }
 }
}
