
import java.util.Scanner;

/**
 * Main entry to the program
 * @author Marcos Rodriguez
 */
public class Start {
    
    private static BMIFactor bmi;
    private static double weight, height;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {        
        System.out.print("Please enter your weight in pounds: ");
        Scanner s = new Scanner(System.in);
        weight = s.nextDouble();
        System.out.print("Please enter your height in inches: ");
        height = s.nextDouble();
        bmi = new BMIFactor(weight, height);   
        System.out.print(bmi.getAnalysis());   
    } 
}
