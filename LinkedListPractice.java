public class LinkedListPractice
{
    Node head;//head node

    // Basic Node Creation
    class Node{
        String data;
        Node next;

        Node(String dataa){
            this.data = dataa;
            this.next = null;
        }
    }

    //add first
    public void addFirst(String data){
        Node newNode = new Node(data); //creation of new node
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //add last
    public void addLast(String data){
        Node newNode = new Node(data);
        //corner conditions
        if(head==null){
            head = newNode;
            return;
        }

        Node travelNode = head; //traversing node pointing where head is pointing
        while(travelNode.next!=null){
            travelNode = travelNode.next;
        }
        travelNode.next = newNode;
    }

    public void deleteFirst(){
        //corner case
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        //corner case
        if(head==null){
            System.out.println("List is empty");
            return;
        }

        if(head.next==null){
            head=null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next; //head.next =null so lastNode = null and
        while(lastNode.next!=null){ //null.next=null so its error
            lastNode= lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next =null;
    }


    public void printList(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node travelNode = head; //traversing node pointing where head is pointing
        while(travelNode!=null){
            System.out.print(travelNode.data+"->");
            travelNode = travelNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListPractice listobj = new LinkedListPractice();
        listobj.addFirst("is");
        listobj.printList();
        listobj.addFirst("name");
        listobj.printList();
        listobj.addFirst("My");

        listobj.addLast("Jagrit");
        listobj.printList();

        listobj.deleteLast();
        listobj.printList();
    }
}
