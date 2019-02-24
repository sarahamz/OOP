import java.io.*;

public class Churchill {
    public static void main(String[] argv)

            throws IOException{
        BufferedReader br = new BufferedReader( new FileReader("input.txt"));
        String line;
        while ((line = br.readLine()) != null){
            System.out.println(line.toUpperCase()); }
        br.close();
    }
}

