package LinkedList;
public class LLAppendLastKtoStart {
    Node head;
    class Node{
        int data;

        Node next;

        Node(int val)
        {
            data = val;

            next = null;
        }
    }

    
    public void insertAtHead(int val)
    {
        Node n = new Node(val);

        n.next = head;

        head = n;
    }
    public void insertAtTail(int val)
    {
        Node n = new Node(val);

        if(head == null)
        {
            head = n;
            return;
        }
        Node temp = head;

        while(temp.next != null)
        {
            temp = temp.next;
        }

        temp.next = n;
    }

    public void display()
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int length()
    {
        int l = 0;
        Node temp = head;

        while(temp != null)
        {
            l++;
            temp = temp.next;
        }

        return l;

    }
    public void KAppend(int k)
    {
        int l = length();

        Node newHead = null, newTail = null, tail = head;

        int count = 1;

        while(tail.next != null)
        {
            if(count == l-k)
            {
                newTail = tail;
            }

            if(count == l-k+1)
            {
                newHead = tail;
            }
            tail = tail.next;
            count ++;
        }

        newTail.next = null;
        tail.next = head;
        head = newHead;

    }

    public static void main(String[] args) {

        LLAppendLastKtoStart lst = new LLAppendLastKtoStart();
        int arr[] = {1, 2, 3, 4, 5, 6};

        for(int i = 0; i < 6; i ++)
        {
            lst.insertAtTail(arr[i]);
        }

        lst.display();

        lst.KAppend(3);

        lst.display();
    }
}
