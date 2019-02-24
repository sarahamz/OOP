import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class TextAnalyst {

    public static String filterString(String s){
        return s.replaceAll("[^A-Za-z]", "").toLowerCase();
    }

    public static int[] calculateLetterFrequency(String s){
        int[] array = new int[26];

        for(int i = 0; i<s.length(); i++){
            array[(int) s.charAt(i) - 97]++;
        } return array;
    }

    public static ArrayList<Node> getUniqueLetters(int[] letterFrequency){
        ArrayList<Node> ar = new ArrayList<Node>();

        for(int i = 0; i < letterFrequency.length; i++){
            //ist buchstabe an stelle i im alphabet häufiger vorhanden (0=a,...)?
            if(letterFrequency[i] > 0){
                // buchstaben + häufigkeit als node hinzufügen
                Node n = new Node();
                n.setLetter((char) (i + 97));
                n.setFrequency(letterFrequency[i]);
                ar.add(n);
            }
        }

        return ar;
    }

    public static String convertFileToString(String fileName) {
        String s = new String();

        try {
            BufferedReader br = new BufferedReader( new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null){
                s += line;
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return s;
    }
}
