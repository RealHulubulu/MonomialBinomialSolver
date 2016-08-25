import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by karas_000 on 8/25/2016.
 */
public class UserApp {

    public static void main(String[] args) {
        //take in format of jx ^ k + g = b
        int j = 0;
        char x = 'x';
        int k = 0;
        int g = 0;
        int b = 0;
        boolean userInput = false;
        boolean jInput = false;
        boolean kInput = false;
        boolean gInput = false;
        boolean bInput = false;
        char imaginary = Character.MIN_VALUE;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter in monomial or binomial expression in this format:\njx ^ k + g = b\t where j,k,g,b are arbitrary integers\n");
        while(!userInput) {
            try {
                while(jInput == false) {
                    System.out.print("Enter j value:\n");
                    j = scan.nextInt();
                    //scan.nextLine();
                    jInput = true;
                }while(kInput == false) {
                    System.out.print("Enter k value:\n");
                    k = scan.nextInt();
                    //scan.nextLine();
                    kInput = true;
                }while(gInput == false) {
                    System.out.print("Enter g value:\n");
                    g = scan.nextInt();
                    //scan.nextLine();
                    gInput = true;
                }while(bInput == false) {
                    System.out.print("Enter b value:\n");
                    b = scan.nextInt();
                    //scan.nextLine();
                    bInput = true;
                    userInput = true;
                }
                //scan.nextLine();
            } catch (InputMismatchException ime) {
                System.out.println("Error: Must input integer values");
            }
            scan.nextLine();
        }
        int u = b - g;
        double v = u/j;
        double w = 1.0/k;
        System.out.print("\nThe first step is to subtract the " + g + " from both sides\n");
        System.out.print("By doing this we get: " + j + x + "^" + k + "+" + g + "-" + g + "=" + b + "-" + g);
        System.out.print("\nThis yields: " + j + x + "^" + k + "=" + u );
        System.out.print("\n\nThe next step is to divide by " + j + " on both sides\n");
        System.out.print("By doing this we get: (" + j + x + "^" + k + ")/" + j + "=" + u + "/" + j);
        System.out.print("\nThis yields: " + x + "^" + k + "=" + v);
        System.out.print("\n\nThe next step is to take the " + k + " root of both sides\n");
        System.out.print("By doing this we get: root(" + x + "^" + k + ")" + "= root(" + v + ")");
        if(v < 0){
            v = -v;
            imaginary = 'i';
        }
        double t = Math.pow(v, w);
        System.out.print("\nThis yields: "  + x + "=" + t + imaginary);
        System.out.print("\n\nThe answer is: "  + x + "=" + t + imaginary + "\n");
        if(imaginary == 'i'){
            System.out.println("\nThe solution contains an imaginary number");
        }




    }
    }
