package LinkedList;
class RandomLL
{
    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }
    }

    public void input(int d)
    {
        Node n = new Node(d);

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

    public void reverse(int m, int n)
    {
        if(head == null)
        {
            System.out.println("Invalid Request");
            return;
        }
        Node temp = head;

        int count = 1;

        while(count != m-1){
            temp = temp.next;
            count ++;
        }
    Node prev, curr, nxt, f1;

    prev = temp.next;

    f1 = prev;

    curr = temp.next.next;

    nxt = null;

    prev.next = null;

    while(count != n-1)
    {
        nxt = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nxt;
        count++;
    }

    f1.next = curr;

    temp.next = prev;

}

public void print()
{
    if(head == null)
    {
        System.out.println("Empty List");
        return;
    }

    Node temp = head;

    do
    {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    while(temp != null);

    System.out.println("NULL");
}

    public static void main(String[] args) {
        {
            RandomLL l = new RandomLL();

            l.input(1);
            l.input(2);
            l.input(3);
            l.input(4);
            l.input(5);

            l.reverse(2, 4);

            l.print();
        }
    }
}