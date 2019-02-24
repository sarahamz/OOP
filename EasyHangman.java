import java.util.Scanner;

public class EasyHangman {

    Scanner keyboard = new Scanner(System.in);
    private String secretWord = new String();
    private String publicWord = new String();
    private int lives;

    public static void main(String[] args) {
        EasyHangman game = new EasyHangman();
        game.start();
    }

    public void start() {
        // Init the game
        init();

        System.out.println("What is my secret word?");
        System.out.println("Lives: " + lives);
        System.out.println("");
        System.out.println(publicWord);

        boolean unresolved = true;

        while (unresolved == true) {
            System.out.print("Input character: ");
            char input = keyboard.next().toUpperCase().charAt(0);

            if (checkLetterExists(input)) {
                System.out.println("Correct! Keep it up.");
                System.out.println("");
                updatePublicWord(input);
                System.out.println(publicWord);
            } else {
                lives--;
                System.out.println("Nope. I’m sorry.");
                System.out.println("");
                System.out.println("What is my secret word?");
                System.out.println("Lives: " + lives);
                System.out.println("");
                System.out.println(publicWord);
            }

            // Break if user is dead
            if (lives <= 0) {
                System.out.println("You have lost the game! :(");
                break;
            }

            // Break if word has been resolved
            unresolved = false;
            for (char c : publicWord.toCharArray()) {
                if(!Character.isLetter(c)) {
                    unresolved = true;
                }
            }
        }

        if (!unresolved) System.out.println("You have won the game! :)");
    }


    public void init() {
        // Prompt user to enter secret word
        while (secretWord.length() < 5) {
            secretWord = readInSecretWord();
        }

        // Init lives
        lives = 9;

        setPublicWord();

    }

    public String readInSecretWord() {
        System.out.print("Insert your secret word (at least 5 characters): ");

        // Read user input and transform to uppercase
        String userInput = keyboard.next().toUpperCase();

        // Filter string (only letter allowed)
        String filteredUserInput = new String();

        for (char c : userInput.toCharArray()) {
            if(Character.isLetter(c)) {
                // Add uppercase character to new String if character is letter
                filteredUserInput = filteredUserInput + Character.toUpperCase(c);
            }
        }

        return filteredUserInput;
    }

    public void setPublicWord() {
        for (int i = 0; i < secretWord.length(); i++) {
            publicWord = publicWord + "_";
        }
    }

    public boolean checkLetterExists(char c) {
        return secretWord.indexOf(c) >= 0;
    }

    public void setSecretWord(String word) {
        secretWord = word;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public String getPublicWord() {
        return publicWord;
    }

    public void updatePublicWord(char c) {
        if (checkLetterExists(c)) {
            // Get appearance of character
            int i = secretWord.indexOf(c);

            while (i >= 0) {
                resolveCharacter(c, i);
                i = secretWord.indexOf(c, i+1);
            }
        }
    }

    private void resolveCharacter(char c, int i) {
        char[] publicWordChars = publicWord.toCharArray();
        publicWordChars[i] = Character.toUpperCase(c);
        publicWord = new String(publicWordChars);
    }
}