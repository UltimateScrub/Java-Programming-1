import java.util.ArrayList;
import java.util.Scanner;
 
public class PersonalDetails {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> birthYears = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
 
            String[] parts = input.split(",");
            names.add(parts[0]);
            birthYears.add(Integer.valueOf(parts[1]));
        }
        
        String longest = names.get(0);
        for (String name : names) {
            if(name.length() > longest.length()) {
                longest = name;
            }
        }
        System.out.println("Longest name: " + longest);
        
        int sumOfBirthYears = 0;
        for (int year : birthYears) {
            sumOfBirthYears = sumOfBirthYears + year;
        }
        System.out.println("Average of the birth years: " + 1.0 * sumOfBirthYears / birthYears.size());
 
    }
}



import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        int number = 0;
        String result = "";
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {

            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] array = input.split(",");
            String word = array[0];
            int length = word.length();

            if (length > number) {
                number = length;
                result = array[0];
            }

            sum += Integer.valueOf(array[1]);
            count++;
        }
        System.out.println("Longest name: " + result);
        System.out.println("Average of the birth years: " + ((double) sum / count));
    }
}
