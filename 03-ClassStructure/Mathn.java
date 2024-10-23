import java.util.Random;
public class Mathn {
    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 49;
        int larger = Math.max(num1, num2);
        System.out.println("Larger of " + num1 + " and " + num2 + ": " + larger);

        double pi = Math.PI;
        System.out.println("Value of PI: " + pi);

        int negativeNum = -17;
        int absoluteValue = Math.abs(negativeNum);
        System.out.println("Absolute value of " + negativeNum + ": " + absoluteValue);

        double squareRoot = Math.sqrt(9.0 / 2.0);
        System.out.println("Square root of nine divided by two: " + squareRoot);

        double randomNum = Math.random();
        System.out.println("Random number in the range <0.0, 1.0>): " + randomNum);

        Random rand = new Random();
        int randomInt = rand.nextInt(10);
        System.out.println("Integer random number in the range <0, 10>: " + randomInt);

        double radians = Math.toRadians(90); 
        double sineValue = Math.sin(radians);
        System.out.println("Sine of 90 degrees: " + sineValue);
    }
}
