import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String[] argv){
        try {
            readAndWrite();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readAndWrite() throws IOException{
        String path = System.getProperty("user.dir");
        Scanner scn = new Scanner(new File( path + "\\input.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\ausgabe.txt"));

        while(scn.hasNextLine()){
            String line = scn.nextLine().toUpperCase();
            bw.write(line);
            bw.close();
        }
    }
}
