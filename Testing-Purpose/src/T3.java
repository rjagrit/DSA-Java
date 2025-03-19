import java.util.Scanner;

/*
1. Create Array by first Declaring it and then initilaizing it.
2. Take Array from the user
3. Write a function to print the array.
4. Write the function to insert element in the beginning.
5. Write the function to Delete the element from it position
6. Write the function to Update the index value
 */
public class T3
{
    public static void main(String[] args){
        int ary[]; // Declartion
        ary = new int[7]; // Initialization

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements");
        for(int i=0;i<5;i++){
            System.out.print("Element-"+i+" : ");
            ary[i] = sc.nextInt();
        }

        printArray(ary);
        System.out.println();

        insertElement(ary,20,3);
        printArray(ary);
        System.out.println();

        deleteElement(ary,4);
        printArray(ary);
        System.out.println();

        updateIndex(ary,1,99);
        printArray(ary);
        sc.close();
    }
    public static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
            if(i!=a.length-1){
                System.out.print(",");
            }
        }
    }

    public static void insertElement(int a[], int element,int pos){
        int size= a.length;

        //Condition
        if(pos<0 || pos>size-1){
            System.out.println("Wrong Position");
            return;
        }
        //Shifting
        for(int i=size-2;i>=pos;i--){
            a[i+1]=a[i];
        }
        a[pos] = element;
    }

    public static void deleteElement(int a[], int pos){
        int size= a.length;
        if(pos<0 || pos>size-1){
            System.out.println("Wrong Position");
            return;
        }
        for(int i=pos;i<=size-2;i++){
            a[i]=a[i+1];
        }
        a[size-1]=0;
    }

    public static void updateIndex(int a[],int pos,int e){
        if(pos<0 || pos>a.length-1){
            System.out.println("Wrong Position");
            return;
        }
        a[pos]=e;
    }

}
