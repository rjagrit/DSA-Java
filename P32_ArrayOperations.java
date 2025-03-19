// 1d Array

import java.util.Scanner;

public class P32_ArrayOperations
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int arr[]; // Declaration
        arr = new int[7];//Initialization

        System.out.println("Enter Array Elements");
        for(int i=0;i<arr.length;i++){
            System.out.print("Element-"+i+" : ");
            arr[i]=obj.nextInt();
        }
        traversingArray(arr);
        System.out.println();

        insertAtSpecificPosition(arr,5,45);
        traversingArray(arr);
        System.out.println();

        deleteSpecificElement(arr,2);
        traversingArray(arr);
        System.out.println();

        updateIndexElement(arr,4,24);
        traversingArray(arr);
        System.out.println();

    }

    public static void traversingArray(int ary[]){
        for(int i=0;i<ary.length;i++){
            System.out.print(ary[i]);
            if(i!=ary.length-1){
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void insertAtSpecificPosition(int a[], int pos, int element){

        int size = a.length;
        //Condition that tell value not filled
        if(pos<0 || pos>size-1){
            System.out.println("Wrong Position");
            return;
        }

        for(int i = size-2;i>=pos;i--){
            //shififting logic
            a[i+1] = a[i];
        }
        a[pos]=element;
    }

    public static void deleteSpecificElement(int a[], int pos){
        for(int i= pos;i<=a.length-2;i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = 0;
    }

    public static void updateIndexElement(int ar[], int position, int element){
        int size=ar.length;
        if(position<0 || position>size-1){
            System.out.println("Wrong Position");
            return;
        }
        ar[position] = element;
    }
}
