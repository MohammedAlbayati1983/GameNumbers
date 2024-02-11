import java.util.Random;
import java.util.Scanner;
/* برنامج يطلب منك اختيار رقم ليكون الرنج منه الى الصفر ومن ثم يطلب منك توقع رقم
والبرنامج يختار رقم عشوائي واذا تطابق الرقمان ستفوز
 */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numRandom = 0;
        int numGuess, difficulty;
        System.out.println("Enter the difficulty level of prediction from zero to: ");
        difficulty = scanner.nextInt();
        do {
            System.out.println("Guess the number from 0 to " + difficulty + " !!");
            numGuess = scanner.nextInt();
            if (numGuess > difficulty || numGuess < 0) {
                System.out.println("The number entered is outside the specified difficulty level.. Please enter another number.");
            } else {
                numRandom = random.nextInt(difficulty);
                if (numRandom == numGuess)
                    System.out.println("Great you are wonderful, your expectation correct, the number was :" + numRandom);
                else
                    System.out.println(
                            "Unfortunately, your prediction was not correct,the number was " + numRandom + " try again!!");
            }
        } while (numGuess != numRandom);


    }
}