package LinkedList;
public class FindIntersectionOf2LL {

    Node head;

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

    public int length(Node head)
    {
        int l = 0;

        Node temp = head;

        while(temp != null)
        {
            temp = temp.next;
            l++;
        }

        return l;
    }

    public void intersect(Node head1, Node head2, int pos)
    {
        Node temp1 = head1;

        pos--;

        while(pos-- != 0)
        {
            temp1 = temp1.next;
        }

        Node temp2 = head2;

        while(temp2.next != null)
        {
            temp2 = temp2.next;
        }

        temp2.next = temp1;

    }
    
   public int intersection(Node head1, Node head2)
   {
        int l1 = length(head1);

        int l2 = length(head2);

        int d = 0;

        Node ptr1, ptr2;

        if(l1 > l2)
        {
            d = l1 - l2;
            ptr1 = head1;
            ptr2 = head2;
        }

        else
        {
            d = l2 - l1;
            ptr1 = head2;
            ptr2 = head1;
        }

        while(d != 0)
        {
            ptr1 = ptr1.next;

            if(ptr1 == null)
            {
                return -1;
            }
            d--;
        }
        
        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1 == ptr2)
            {
                return ptr1.data;
            }
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }

        return -1;
   }

   public static void main(String[] args) {

    FindIntersectionOf2LL list = new FindIntersectionOf2LL();

    FindIntersectionOf2LL list2 = new FindIntersectionOf2LL();

    list.insertAtTail(1);
    list.insertAtTail(2);
    list.insertAtTail(3);
    list.insertAtTail(4);
    list.insertAtTail(5);
    list.insertAtTail(6);
    list2.insertAtTail(9);
    list2.insertAtTail(10);
    list.intersect(list.head, list2.head, 3);
    list.display();
    list2.display();
    int  a = list.intersection(list.head, list2.head);

    System.out.println(a);
   }
    
}
