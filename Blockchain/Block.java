package Blockchain;
import java.util.*;
public class Block {
    private String[] transactions;
    private int blockHash;
    private int previousBlockHash;

    

    public Block(String[] transactions, int previousBlockHash) {
        this.transactions = transactions;
        this.previousBlockHash = previousBlockHash;
        this.blockHash = Arrays.hashCode(new int[] {Arrays.hashCode(transactions), this.previousBlockHash});
    }
    
    @Override
    public String toString() {
        return "Block [transactions=" + Arrays.toString(transactions) + ", blockHash=" + blockHash
                + ", previousBlockHash=" + previousBlockHash + "]";
    }

    public String[] getTransactions() {
        return transactions;
    }
    public int getBlockHash() {
        return blockHash;
    }
    public int getPreviousBlockHash() {
        return previousBlockHash;
    }
    public void setTransactions(String[] transactions) {
        this.transactions = transactions;
    }
    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }
    public void setPreviousBlockHash(int previousBlockHash) {
        this.previousBlockHash = previousBlockHash;
    }
}
