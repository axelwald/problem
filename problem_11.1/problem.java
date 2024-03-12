import java.util.HashSet;
import java.util.Scanner; 
import java.util.LinkedHashSet;

public class problem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> numbers = new LinkedHashSet<Integer>();

        System.out.println("Enter as many numbers as you want, CTRL+Z to exit");
        while (scanner.hasNextLine()) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                numbers.add(num);
            } catch (Exception e) {
                System.out.println("Not a valid number, try again. ");
                continue;
            }
        }

        scanner.close();


        System.out.println(numbers);        

    }
}