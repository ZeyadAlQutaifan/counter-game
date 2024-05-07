import java.util.Scanner;

public class Main {
    static boolean naserWins = true;

    public static void main(String[] args) {
        init();
    }

    public static void init() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Naser insert number:");
            int initialValue = scanner.nextInt();
            if (initialValue == 1) {
                System.out.println("The winner is: Ali");
                return;
            }
            String winner = whoWins(initialValue);
            System.out.println("The winner is: " + winner);
        } catch (Exception e) {
            System.out.println("Input a valid integer value");
            init();
        }

    }

    public static String whoWins(final int numberInput) {

        int numberProcess = numberInput;
        if (isPowerOfTwo(numberProcess)) {
            numberProcess = numberProcess / 2;
        } else {
            int nextLower = getNextLowerPowerOfTwo(numberProcess);
            numberProcess -= nextLower;
        }
        if(numberProcess == 1){
            return naserWins ? "Naser" : "Ali";
        }
        naserWins = !naserWins;
        whoWins(numberProcess);

        return naserWins ? "Naser" : "Ali";
    }

    public static int getNextLowerPowerOfTwo(int n) {
        int power = 1;
        while (power * 2 <= n) {
            power *= 2;
        }
        return power;
    }


    public static boolean isPowerOfTwo(int n) {
        // A number is a power of 2 if it is greater than 0 and has only one bit set in its binary representation.
        // We can use the fact that a power of 2 always has a single '1' bit.
        // So, we can check if the number is greater than 0 and the count of set bits is exactly 1.
        return n > 0 && Integer.bitCount(n) == 1;
    }


}

