package epam.tam2019;


import java.util.*;

public class Main {

    public static String generateMaskedWord(String randomWord, List<Character> inputLetters) {

        StringBuilder maskedWordBuilder = new StringBuilder();

        for (char c : randomWord.toCharArray()) {
            if (inputLetters.contains(c)) {
                maskedWordBuilder.append(c);
            } else {
                maskedWordBuilder.append('_');


            }

        }
        return maskedWordBuilder.toString();
    }

    public static void main(String[] args) {

//
//    public static listCreation
//
//    {

        List<String> wordList = Arrays.asList("music", "animal", "machine", "computer", "forest", "parrot", "amazing", "hopeless", "radiate", "element", "train", "flow", "orville", "forever", "ready", "brilliant", "paper", "liable", "treat", "culture");

        // Pick a word randomly from the wordList
        Random rnd = new Random();
        String randomWord = wordList.get(rnd.nextInt(wordList.size()));

        System.out.println("The length of the secret word is: " + randomWord.length() + " character");

        List<Character> inputLetters = new ArrayList<>();

        StringBuilder maskedWordBuilder;

        Scanner userInput = new Scanner(System.in);

        int numberOfLifes = 6;


        while (numberOfLifes > 0) {


            // Get input
            System.out.println("Give me a letter!");
            char userChar = userInput.next().charAt(0);


            // Evaluate input
            if (randomWord.contains(String.valueOf(userChar))) {
                System.out.println("The letter matches!");
                inputLetters.add(userChar);


            } else {
                System.out.println("No such letter...");
                numberOfLifes--;
                System.out.println("You still have " + numberOfLifes + " lifes." );

            }

            // Display status
            String currentGuess = generateMaskedWord(randomWord, inputLetters);

            System.out.println(currentGuess);

            // Check if we should finish the game
            if (!currentGuess.contains("_"))
                break;

        }

        if (numberOfLifes < 1) {
            System.out.println("Game over, you loose!");
        } else {
            System.out.println("Great, you found the word!");
        }


    }

}

