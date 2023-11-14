package BlockchainJava;

import java.util.*;

public class Blockchain {
    public static void main(String[] args) {
        String statement1 = "My world is perfect.";
        int hashvalue = statement1.hashCode();

        System.out.println("Statement = " + statement1 + " whose hash value is " + hashvalue);

        String []list1 = {"alex","becky","cyril"};
        String []list2 = {"alex","becky","cyril"};

        int hash1 = Arrays.hashCode(list1);
        int hash2 = Arrays.hashCode(list2);

        System.out.println("hash1 = " + hash1 + " \nhash2 = " + hash2);

        ArrayList<Block> blockchain = new ArrayList<Block>();

        String[] initialValues = {"Shad has $700", "Miguel has $550"};
        Block firstBlock = new Block(initialValues,0);
        blockchain.add(firstBlock);
        System.out.println("First block is " + firstBlock.toString());
        System.out.println("The block chain is " + blockchain.toString());
        System.out.println();

        String[] ShadGivesItAway = {"Shad gives tim $40", "Shad gives Tany $60"};
        Block SecondBlock = new Block(ShadGivesItAway,firstBlock.getBlockHash());
        blockchain.add(SecondBlock);
        System.out.println("Second block is " + SecondBlock.toString());
        System.out.println("The block chain is " + blockchain.toString());
        System.out.println();

        String[] ShadGetsSomeBack = {"Tim gives Shad $10", "Miguel gives Shad $50"};
        Block thirdBlock = new Block(ShadGetsSomeBack,SecondBlock.getBlockHash());
        blockchain.add(thirdBlock);
        System.out.println("Third block is " + thirdBlock.toString());
        System.out.println("The block chain is " + blockchain.toString());
        System.out.println();
        
    }
}
