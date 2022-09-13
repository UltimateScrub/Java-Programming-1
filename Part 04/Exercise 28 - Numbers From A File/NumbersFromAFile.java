
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        
        int count = 0;
        try (Scanner numberReader = new Scanner (Paths.get(file))) {
            
            while (numberReader.hasNextLine()) {
                int number = Integer.valueOf(numberReader.nextLine());
                
                if (lowerBound <= number && number <= upperBound) {                  
                  count++;  
                }
                                
            }
            System.out.println("Numbers: " + count);
            
            
        } catch (Exception e) {
            System.out.println("");
        }
    }

}
