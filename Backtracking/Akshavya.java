import java.util.*;
import java.lang.*;

/* Name of the class has to be "Main" only if the class is public. */
class Akshavya
{
    Node head;
    private int size;
    Akshavya()
    {
        this.size = 0;
    }
    class Node
    {
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
            size ++;
        }
    }

    // add - first, last
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head == null)
        {
            head = newNode;
            return;
        }

        head.prev = newNode;
    }

    //add last

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head; // Head shouldn't be pointed as it may cause problems
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;
    }

    //print

    public void printList()
    {

        if(head == null)
        {
            System.out.println("Empty List");
            return;
        }
        Node currNode = head;

        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Akshavya aksh = new Akshavya();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();int c = 0;
        int i, j, k;
        for(i = 1; i <= n; i ++){
            String ch1 = sc.nextLine();
            char ch = ch1.charAt(0);
            int data = ch1.charAt(2);

            if(ch == 'I' && c%2 == 0)
            {aksh.addLast(data); c++;}

            else if(ch == 'I' && c%2 != 0)
            {aksh.addFirst(data);c++;}

           // else if(ch == "S"){}

            else if(ch =='D')
            {aksh.printList();}
        }
    }


}
