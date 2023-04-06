package LinkedList;
public class LL1 {

    Node head;
    class Node
    {
        public int data;

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

    public boolean search(int key)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == key)
            {
                return true;
            }

            temp = temp.next;
        }
        return false;
    }

    public void delete(int val)
    {
        if(head == null)
        {
            return;
        }

        if(head.next == null)
        {
            DeleteAtHead();
        }
        Node temp = head;

        while(temp.next.data != val)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void DeleteAtHead()
    {
        head = head.next;
    }

    public void reverse()
    {
        Node curr = head;
        Node prev = null;
        Node nxt;

        while(curr != null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        head = prev;
    }

    public Node recRev(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node newHead = recRev(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public Node ReverseKElements(Node head, int k)
    {
        Node prev = null;
        Node curr = head;
        Node nxt = null;

        int count = 0;
        while(curr != null && count < k)
        {
            nxt = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nxt;
            count++;
        }

        if(nxt != null)
        {
            head.next = ReverseKElements(nxt, k);
        }

        return prev;
    }

    public boolean detectCycle()
    {
        Node tort = head;
        Node hare = head;

        while(hare != null && hare.next != null)
        {
            tort = tort.next;
            hare = hare.next.next;

            if(hare == tort)
            {
                return true;
            }
        }

        return false;
    }

    public void makeCycle(int pos)
    {
        Node temp = head;
        Node startNode = null;

        int count = 1;

        while(temp.next != null)
        {
            if(count == pos)
            {
                startNode = temp;
            }
            temp = temp.next;
            count++;
        }

        temp.next = startNode;
    }

    public void breakCycle()
    {
        Node tort = head;
        Node hare = head;
        
        do
        {
            tort = tort.next;
            hare = hare.next.next;
        }
        while(hare != tort);

            hare = head;

            while(hare.next != tort.next)
            {
                hare = hare.next;
                tort = tort.next;
            }

            tort.next = null;
    }
    
    public static void main(String[] args) {
        LL1 list = new LL1();

        list.insertAtTail(1);
        list.insertAtTail(2);
        list.insertAtTail(3);
        list.insertAtHead(0);

        list.display();

        System.out.println("Searching.....\nResult : " + list.search(5));

        list.delete(3);
        list.DeleteAtHead();
        list.display();

        System.out.print("Reversing......\n");
        list.reverse();
        list.display();

        System.out.println("Recursively reversing.....");
        Node newHead = list.recRev(list.head);
        list.head = newHead;
        list.display();

        list.insertAtTail(3);
        list.insertAtTail(4);
        list.insertAtHead(0);
        list.insertAtTail(5);

        list.display();

        int k = 2;
        Node newHead1 = list.ReverseKElements(list.head, k);

        list.head = newHead1;
        list.display();

        LL1 list2 = new LL1();

        list2.insertAtTail(1);
        list2.insertAtTail(2);
        list2.insertAtTail(3);
        list2.insertAtTail(4);
        list2.insertAtTail(5);
        list2.insertAtTail(6);

        list2.makeCycle(3);
        System.out.println(list2.detectCycle());

        list2.breakCycle();
        list2.display();
    }
}
