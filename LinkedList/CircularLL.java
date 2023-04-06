package LinkedList;
public class CircularLL {

    class Node
    {
        int data;

        Node next;

        Node(int val)
        {
            data = val;

            next = null;
        }
    }

    Node head;

    public void insertAtHead(int val)
    {
        Node n = new Node(val);

        if(head == null)
        {
            n.next = n;
            head = n;
        }
        Node temp = head;

        while(temp.next != head)
        {
            temp = temp.next;
        }

        temp.next = n;
        n.next = head;
        head = n;
    }
    public void insertAttail(int val)
    {
        if(head == null)
        {
            insertAtHead(val);
            return;
        }
        Node n = new Node(val);

        Node temp = head;

        while(temp.next != head)
        {
            temp = temp.next;
        }

        temp.next = n;
        n.next = head;
    }

    void display()
    {
        Node temp = head;
        do
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        while(temp != head);

        System.out.println();
    }

    public void deleteAtHead()
    {
        Node temp = head;

        while(temp.next != head)
        {
            temp = temp.next;
        }

        temp.next = head.next;
        head = head.next;
    }

    public void deletion(int pos)
    {
        if(pos == 1)
        {
            deleteAtHead();
            return;
        }

        Node temp = head;
        int count = 1;

        while(count != pos-1)
        {
            temp = temp.next;
            count ++;
        }

        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        CircularLL list = new CircularLL();

        list.insertAttail(1);
        list.insertAttail(2);
        list.insertAttail(3);
        list.insertAttail(4);
        list.display();
        list.insertAtHead(5);
        list.display();
        list.deletion(1);
        list.display();
    }
    
}
