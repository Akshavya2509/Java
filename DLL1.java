public class DLL1 {

    Node head;

    class Node
    {
        int data;

        Node next;

        Node prev;

        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
    }

        public void InsertAtHead(int val)
        {
            Node n = new Node(val);

            
            n.next = head;
            if(head != null)
            head.prev = n;

            head = n;
        }

        public void InsertAtEnd(int val)
        {
            Node n = new Node(val);

            Node temp = head;

            if(head == null)
            {
                InsertAtHead(val);
                return;
            }
            while(temp.next != null)
            {
                temp = temp.next;
            }

            temp.next = n;
            n.prev = temp;
            n.next = null;
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

        public void deleteAtHead()
        {
            Node temp = head;
            head = head.next;
            head.prev = null;
        }

        public void delete(int pos)
        {
            if(pos == 1)
            {
                deleteAtHead();
                return;
            }
            Node tep = head;

            int count = 1;

            while(tep != null && count != pos)
            {
                tep = tep.next;
                count++;
            }

            tep.prev.next = tep.next;
            if(tep.next != null)
            tep.next.prev = tep.prev;

        }


    public static void main(String[] args) {
        DLL1 list3 = new DLL1();

        list3.InsertAtEnd(1);
        list3.InsertAtEnd(2);
        list3.InsertAtEnd(3);
        list3.InsertAtEnd(4);
        list3.display();
        list3.InsertAtHead(0);
        list3.display();
        list3.delete(1);
        list3.display();
    }
    
}
