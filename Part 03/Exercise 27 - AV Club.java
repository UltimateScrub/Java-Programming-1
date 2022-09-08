
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] split2 = input.split(" ");

            for (String detect : split2) {
                if (detect.contains("av")) {
                    System.out.println(detect);
                }                
            }
        }

    }
}
