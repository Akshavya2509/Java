package BinaryTrees;

public class DiameterOfBTApproach1 {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int d)
        {
            data = d;
            left = null;
            right = null;
        }
    }

    static class BinaryTree{
        static int index = -1;
        public static Node buildTree(int nodes[])
        {
            index++;
            if(nodes[index] == -1)
            {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    
    public static int HeightofNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftNode = HeightofNodes(root.left);
        int rightNode = HeightofNodes(root.right);

        if(leftNode > rightNode)
        {
            return leftNode + 1;
        }

        else
        {
            return rightNode + 1;
        }
    }

    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = HeightofNodes(root.left) + HeightofNodes(root.right) + 1; 
        return Math.max(diam3, Math.max(diam1, diam2));
    }
    public static void main(String[] args) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println(diameter(root));
    }
}
