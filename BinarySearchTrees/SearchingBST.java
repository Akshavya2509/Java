package BinarySearchTrees;

public class SearchingBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val)
        {
            data = val;
        }
    }

    public static Node insert(Node root, int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }

        else
        {
            root.right = insert(root.right, val);
        }

        return root;
    }

    public static boolean search(Node root, int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data > key)
        {
            return search(root.left, key);
        }

        else if(root.data == key)
        {
            return true;
        }

        else
        {
            return search(root.right, key);
        }
    }
    public static void main(String[] args) {
        int value[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;

        for(int i = 0; i < value.length; i ++)
        {
            root = insert(root, value[i]);
        }

        if(search(root, 1))
        {
            System.out.println("FOUND");
        }

        else
        {
            System.out.println("NOT FOUND");  
        }
    }   
}
