
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {     
            String inputText = scanner.nextLine();

            if (inputText.equals("")) {
                break;
            }
            
            String[] split = inputText.split(" ");

            for (String split1 : split) {
                System.out.println(split1);
            }
        }

    }
}
