import java.util.*;

class Akshavya
{
    Node head;
    Node tail;
    boolean before=true;
    Node circle;
    Akshavya()
    {
        head = null;
        tail = null;
        circle = null;
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
        }
    }
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        newNode.next = head;
        newNode.prev = null;
        if(head != null)
        {
            head.prev = newNode;
        }

        head = newNode;
    }
    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            addFirst(data);
        }
        newNode.next = null;
        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;
    }
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
            System.out.print(currNode.data + " . ");
            currNode = currNode.next;
        }

        System.out.println("null");
    }

    void append(int n)
    {
        Node tt = new Node(n);
        tt.data = n;
        tt.next = null;
        tt.prev = null;

        if(head == null)
        {
            head = tt;
            tail = tt;
        }
        else
        {
            tt.prev = tail;
            tail.next = tt;
            tail = tt;
        }
    }
    
    void shuffle(int i1, int i2)
    {
        Node pos1 = null, pos2 = null;
        int i=1;
        Node tt = head;
        while(tt != null)
        {
            if(i == i1)
                pos1 = tt;
            else if(i == i2)
                pos2 = tt;
            else if(tt == circle) {
            }
            if(tt == tail)
                break;
            tt = tt.next;
            i++;
        }
        
        if(pos1 == head && pos2 == tail)
        {
            tail.next = head;
        }
        if(pos1 == head)
        {
            head = pos2.next;
            head.prev = null;
            tail.next = pos1;
            pos1.prev = tail;
            pos2.next = pos1;
            tail = pos2;
        }
        else if(pos2 == tail)
        {
            tail.next = pos1;
        }
        else
        {
            (pos1.prev).next = pos2.next;
            (pos2.next).prev = pos1.prev;
            tail.next = pos1;
            pos1.prev = tail;
            pos2.next = pos1;
            tail = pos2;
        }
        circle = pos1;
    }
    
    public static void main (String[] args)
    {
        // your code goes here

        Akshavya aksh = new Akshavya();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//int c = 0;
        int i,data, c = 1;
        for(i = 1; i <= n; i ++){
            char a[]=new char[1];
            a[0] = sc.next().charAt(0);

            if(a[0]== 'I')
            {data = sc.nextInt();
                if(c % 2 != 0)
                {
                    aksh.addFirst(data);
                    c++; 
                }

                else
                {
                    aksh.addLast(data);
                    c++;
                }
            }
           else if(a[0] == 'S'){
            int pos11 = sc.nextInt();
            int pos22 = sc.nextInt();
            aksh.shuffle(pos11, pos22);
           }

            else if(a[0] =='D')
            {aksh.printList();}
        }
    }


}
