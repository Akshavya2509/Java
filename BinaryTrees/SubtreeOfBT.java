package BinaryTrees;

public class SubtreeOfBT {
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

        public static boolean isIdentical(Node root, Node subRoot)
        {
            if(root == null && subRoot == null)
            {
                return true;
            }

            if(root == null || subRoot == null)
            {
                return false;
            }

            if(root.data == subRoot.data)
            {
                return isIdentical(root.left, subRoot.left) || isIdentical(root.right, subRoot.right);
            }

            return false;
        }
        public static boolean isSubtree(Node root, Node subRoot)
        {
            if(subRoot == null)
            {
                return true;
            }

            if(root == null)
            {
                return false;
            }

            if(root.data == subRoot.data)
            {
                if(isIdentical(root, subRoot))
                {
                    return true;
                }
            }

            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
    public static void main(String[] args) {
        
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        int subNode[] = {1, 2, -1, -1, 3, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        BinaryTree sub = new BinaryTree();
        Node subRoot = sub.buildTree(subNode);
        System.out.println(root.data);

        System.out.println(isSubtree(root,subRoot));
    }
}
