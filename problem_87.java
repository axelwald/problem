import java.time.LocalTime;

/**
 * problem_90
 */
public class problem_87 {

    public static void main(String[] args) {
        System.out.println(klockan());
    }

    public static String klockan(){
        return LocalTime.now().toString();
    }
}