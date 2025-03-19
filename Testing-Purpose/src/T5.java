/*
1. Create Array by first Declaring it and then initilaizing it.
2. Take Array from the user
3. Write a function to print the array.
4. Write the function to insert element.
5. Write the function to Delete the element from it position
6. Write the function to Update the index value
 */

import java.util.Scanner;

public class T5
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ary[] = new int[6];
        System.out.println("Enter the Array Elements");

        for(int i=0;i<ary.length;i++){
            System.out.print("Element-"+i+": ");
            ary[i]=obj.nextInt();
        }

        // Print the Array Elements
        printArray(ary);
        System.out.println();

        // Insert Element in Array
        insertElement(ary, 2, 23);
        printArray(ary);
        System.out.println();

        // Delete Array Element
        deleteELement(ary, 3);
        printArray(ary);
        System.out.println();

        //Update Index element
        updateIndexElement(ary,2,1);
        printArray(ary);
        System.out.println();
    }

    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            if(i!=a.length-1){
                System.out.print(",");
            }
        }
    }

    public static void insertElement(int a[], int pos, int element){
        int size = a.length;
        if(pos<0 || pos>a.length-1){
            System.out.println("Position is Wrong");
            return;
        }
        for(int i=size-2;i>=pos;i--){
            a[i+1]=a[i];
        }
        a[pos]=element;
    }

    public static void deleteELement(int a[], int pos){
        int size=a.length;
        if(pos<0 || pos>a.length-1){
            System.out.println("Wrong Position");
            return;
        }
        for(int i=pos;i<=size-2;i++){
            a[i]=a[i+1];
        }
        a[size-1]=0;
    }

    public static void updateIndexElement(int a[], int pos, int element){
        int size=a.length;
        if(pos<0 || pos>a.length-1){
            System.out.println("Wrong Position");
            return;
        }
        a[pos]=element;
    }
}
