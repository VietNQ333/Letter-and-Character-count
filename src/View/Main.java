package View;

import Controller.CountManagement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a content: ");
        String inputString = scanner.nextLine();

        String[] menuOptions = {"Count Characters", "Count Letters", "Quit"};
        CountManagement countManagement = new CountManagement("Main Menu", menuOptions, inputString);
        countManagement.run();
    }
}

    
