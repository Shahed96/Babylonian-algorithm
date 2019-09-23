
package babylonian.algorithm;

import java.util.Scanner;

/**
 *
 * author: Shahed A. Abedalwahab
 * Date: 23/9/2019
 * Babylonian Algorithm 
 */
public class BabylonianAlgorithm {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want to know it's square root>> ");
        double n = input.nextDouble();
        double guess = n / 2;
        double error2;
        do {
            double guess1 = guess;
            double r = n / guess;
            guess = (guess + r) / 2;
            double error1 = Math.abs(guess - guess1) / guess1;
            error2 = error1 * 100;

        } while (error2 >= 0.01);
        System.out.println("the square root of " + n + " is ");
        System.out.print(guess);
    }

}
