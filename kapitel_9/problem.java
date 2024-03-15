import java.util.*;
public class problem {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Belopp: ");
        double belopp = scanner.nextDouble();

        System.out.println("Ränta: ");
        double ränta =  scanner.nextDouble();

        System.out.println("Antal År: ");
        int år = scanner.nextInt();

        System.out.println("Uttag: ");
        double uttag = scanner.nextDouble();

        
        beloppVidUttag(belopp, ränta, år, uttag);


    }   
    


    public static double beloppVidUttag(double b, double r, int n, double ut){
        if (ut > b*0.01*r) {
            System.out.println("För stort uttag");
            return 0;
        } else{
            for (int i = 1; i <= n; i++) {
                b = b+b*0.01*r-ut;
                System.out.println("\nPengar | "+b + "\nÅr: "+ i);
            }
            return b;

        }
    }

}
