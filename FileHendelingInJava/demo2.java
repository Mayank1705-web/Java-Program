import java.io.*;
public class demo2 {
    public static void main(String[] args){
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("test.txt"));
            out.write("aString\nthis is a\ntest");
        } catch (IOException e) {
            System.out.println(e);
        }
        
    }    
}
