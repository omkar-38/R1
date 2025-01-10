import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("destination.txt");
        
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();
        System.out.println("Data copied successfully.");
    }
}