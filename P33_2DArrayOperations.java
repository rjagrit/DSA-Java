//2d Array Operations

import java.util.*;

public class P33_2DArrayOperations
{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Two-D Array Elements");
        System.out.println();
        int ary[][] = new int[3][2]; //D+I of 2d Array

        for(int i = 0;i<ary.length;i++){
            System.out.println("Enter sub-elements of "+i+" index");
            for(int j = 0;j<ary[i].length;j++){
                System.out.print("Element at "+i+""+j+" : ");
                ary[i][j] = obj.nextInt();
            }
            System.out.println();
        }
        //Print the Arrays
        print2dArray(ary);

        insertIn2dArray(ary, 0, 0, 23);
        System.out.println();
        print2dArray(ary);

        deleteFrom2dArray(ary,1,1);
        System.out.println();
        print2dArray(ary);

        updateIndexElementof2dArray(ary,1,1,99);
        System.out.println();
        print2dArray(ary);
    }

    public static void print2dArray(int a[][]){
        for(int i=0;i<a.length;i++){
            System.out.print("For "+i+" index: ");
            P32_ArrayOperations.traversingArray(a[i]);
        }
    }

    public static void insertIn2dArray(int ar[][], int pos1, int pos2, int element){
        P32_ArrayOperations.insertAtSpecificPosition(ar[pos1], pos2, element);
    }

    public static void deleteFrom2dArray(int arr[][], int pos1, int pos2){
        P32_ArrayOperations.deleteSpecificElement(arr[pos1], pos2);
    }

    public static void updateIndexElementof2dArray(int arr[][], int pos1, int pos2, int element){
        int size1=arr.length;
        if(pos1<0 || pos1>size1-1){
            System.out.println("Wrong Position");
            return;
        }
        int size2=arr[pos1].length;
        if(pos2<0 || pos2>size2-1){
            System.out.println("Wrong Position");
            return;
        }
        arr[pos1][pos2] = element;
    }
}
