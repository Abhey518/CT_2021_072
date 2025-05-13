package Q_07;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //If we want to do replacements of case-sensitive words with symbols
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine().trim();

        System.out.print("Enter the word to replace: ");
        String wReplace = input.nextLine().trim();

        System.out.print("Enter the replacement word: ");
        String rWord = input.nextLine().trim();

        String[] text = sentence.split("(?=\\W)|(?<=\\W)|(?=\\b)|(?<=\\b)|(?=_)|(?<=_)");

        int textSize = text.length;
        boolean wordFound = false;

        StringBuilder updatedText = new StringBuilder();

        for (int i = 0; i < textSize; i++) {
            if (text[i].equals(wReplace)) {
                updatedText.append(rWord);
                wordFound = true;

            } else
                updatedText.append(text[i]);

        }

        if (!wordFound) {
            System.out.println("\nThe word \"" + wReplace + "\" was not found in the sentence.");
            System.out.println("sentence: " + updatedText);
            System.out.println("No replacements were made.");

        } else
            System.out.println("\nUpdated sentence: " + updatedText);

    }
}
