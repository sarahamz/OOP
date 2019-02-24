public class Tile {

    private char letter;
    private int value;

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter){
        this.letter = letter;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value){
        this.value = value;
    }

    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }

    public Tile(){
        this('a', 1);
    }

    public Tile(char letter){
        this(letter, 1);
    }


    String getValuesToString(){
        return "Tile " + getLetter() + " has the value " + getValue() + ".";
    }
}
