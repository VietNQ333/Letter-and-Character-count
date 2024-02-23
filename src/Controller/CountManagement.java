package Controller;

import Model.CountChar;
import Model.CountLetter;
import View.Menu;
import java.util.Scanner;


public class CountManagement extends Menu<String> {
    private final String inputString;
    public CountManagement(String title, String[] options, String inputString) {
        super(title, options);
        this.inputString = inputString;
    }

    @Override
    public void execute(int n) {
        Scanner scanner = new Scanner(System.in);

        switch (n) {
            case 1:
                System.out.print("Enter a character (or 'all' for all characters) to count: ");
                String charToCount = scanner.nextLine();
                if (charToCount.equalsIgnoreCase("all")) {
                    CountChar.countAllCharacters(inputString);
                } else {
                
                    System.out.println("Number of char '" + charToCount + "': " + CountChar.count(inputString, charToCount.charAt(0)));
                }
                break;
                
            case 2:
                System.out.print("Enter a letter: ");
                String wordToCount = scanner.nextLine();
                System.out.println("Number of letter '" + wordToCount + "': " + CountLetter.count(inputString, wordToCount));
                break;
            case 3:
                System.out.println("Exit succesfully");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid selection. Please try again.");
                break;
        }
    }
}
