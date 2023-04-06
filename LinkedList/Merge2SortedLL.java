package LinkedList;
public class Merge2SortedLL {

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

    public Node MergeRecursive(Node head1, Node head2)
    {

        if(head1 == null)
        {
            return head2;
        }

        if(head2 == null)
        {
            return head1;
        }
        Node result;

        if(head1.data < head2.data)
        {
            result = head1;
            result.next = MergeRecursive(head1.next, head2);
        }

        else
        {
            result = head2;
            result.next = MergeRecursive(head1, head2.next);
        }

        return result;
    }

    public void merge(Node head1, Node head2)
    {
        Node ptr1 = head1;
        Node ptr2 = head2;

        Node Dummy = new Node(-1);

        Node ptr3 = Dummy;

        while(ptr1 != null && ptr2 != null)
        {
            if(ptr1.data < ptr2.data)
            {
                ptr3.next = ptr1;
                ptr1 = ptr1.next;
            }

            else
            {
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
            }
            ptr3 = ptr3.next;
        }

            while(ptr1 != null)
            {
                ptr3.next = ptr1;
                ptr1 = ptr1.next;
                ptr3 = ptr3.next;
            }

            while(ptr2 != null)
            {
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
                ptr3 = ptr3.next;
            }

            head = Dummy.next;
        
    }

    public static void main(String[] args) {
        
        Merge2SortedLL list = new Merge2SortedLL();
        Merge2SortedLL list1 = new Merge2SortedLL();

        int arr[] = {1, 4, 5, 7};
        int arr1[] = {2, 3, 6};

        for(int i = 0; i < 4; i ++)
        {
            list.insertAtTail(arr[i]);
        }

        for(int i = 0; i < 3; i ++)
        {
            list1.insertAtTail(arr1[i]);
        }

        list.display();
        list1.display();

        Merge2SortedLL list2 = new Merge2SortedLL();
        list2.head = list2.MergeRecursive(list.head, list1.head);
        list2.display();
        list2.merge(list.head, list1.head);
        list2.display();

    }
    
}
