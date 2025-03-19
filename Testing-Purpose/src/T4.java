/*
1. Create Array by first Declaring it and then initilaizing it.
2. Take Array from the user
3. Write a function to print the array.
4. Write the function to insert element in the beginning.
5. Write the function to Delete the element from it position
6. Write the function to Update the index value

 */

import java.util.Scanner;

public class T4
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the 2d Array Elements");
        System.out.println();

        int ary[][]; // declaration
        ary = new int[4][3];

        for(int i=0;i< ary.length;i++){
            System.out.println("Elements in Index-"+i);
            for(int j=0;j<ary[i].length;j++){
                System.out.print("Element at "+i+""+j+" : ");
                ary[i][j]= obj.nextInt();
            }
            System.out.println();
        }

        print2dArray(ary);
        System.out.println();

        insertElementIn2dArray(ary,1,2,29);
        print2dArray(ary);
        System.out.println();

        deleteElementIn2dArray(ary,2,1);
        print2dArray(ary);
        System.out.println();

        updateElementIn2dArray(ary,3,1,99);
        print2dArray(ary);
        obj.close();
    }

    public static void print2dArray(int a[][]){
        for(int i=0;i<a.length;i++){
            System.out.print("For "+i+" index: ");
            T3.printArray(a[i]);
            System.out.println();
        }
    }

    public static void insertElementIn2dArray(int a[][], int pos1, int pos2, int element){
        T3.insertElement(a[pos1],element,pos2);
    }

    public static void deleteElementIn2dArray(int a[][],int pos1,int pos2){
        T3.deleteElement(a[pos1],pos2);
    }

    public static void updateElementIn2dArray(int a[][], int pos1,int pos2,int e){
        int siz1=a.length;
        if(pos1<0 || pos1>siz1-1){
            System.out.println("Wrong Position");
            return;
        }
        int size2=a[pos1].length;
        if(pos2<0 || pos2>size2-1){
            System.out.println("Wrong Position");
            return;
        }
        a[pos1][pos2]=e;
    }
}
