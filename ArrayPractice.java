public class ArrayPractice
{
    public static void main(String[] args) {
        int num[]; // Array Declaration
        num = new int[5]; // Array Initialization

        System.out.println(num);
        int rollNumber[] = {1,2,3,4,5,6};

        rollNumber[1]=67;

        for(int i=0;i<6;i++){
            System.out.print(rollNumber[i]+" ");
        }

    }
}
