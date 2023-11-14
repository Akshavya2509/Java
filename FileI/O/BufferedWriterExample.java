import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) {
        String names[] = {"Rishabh","Shubham","Ayush"};
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
            writer.write("Hello World");
            writer.write("\nThis is second time im saying Hello World");
            for(String name: names){
                writer.write("\n" + name);
            }
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
