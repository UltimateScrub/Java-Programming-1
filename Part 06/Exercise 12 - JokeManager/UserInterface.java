/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class UserInterface {

    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Comamnds: ");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("Write the joke to be added: ");
                String inputJoke = scanner.nextLine();
                manager.addJoke(inputJoke);
                continue;
            }

            if (command.equals("2")) {
                System.out.println("Drwaing a joke: ");
                String drawJoke = manager.drawJoke();
                System.out.println(drawJoke);
                continue;
            }

            if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
                continue;
            }

            if (command.equals("X")) {
                break;
            }
        }
    }
}
