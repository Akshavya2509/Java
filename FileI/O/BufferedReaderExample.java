import java.io.*;
public class BufferedReaderExample {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Input.txt"));
            writer.write("Hello Fellas");
            writer.close();
        BufferedReader reader = new BufferedReader(new FileReader("Input.txt"));
        System.out.println(reader.readLine());
        reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
