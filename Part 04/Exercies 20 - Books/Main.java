import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookInfo = new ArrayList<>();


        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication Year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());
           
            bookInfo.add(new Book(title, pages, publicationYear));
        }

        System.out.println("What information will be printed? ");
        String input = scanner.nextLine();

        int index = 0;
        while (index < bookInfo.size()) {

            if (input.equals("everything")) {
                System.out.println(bookInfo.get(index).getName() + ", " + bookInfo.get(index).getPages() + " pages, " + bookInfo.get(index).getPublicYear());

            }

            if (input.equals("name")) {
                System.out.println(bookInfo.get(index).getName());
            }
            
            index++;

        }
    }
}
