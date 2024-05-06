import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int initialValue = 260;
        String winner = whoWins(initialValue);
        System.out.println("The winner is: " + winner);
    }

    public static String whoWins(final int numberInput) {
        boolean naserWins = true;
        int numberProcess = numberInput;
        if (numberProcess == 1) {
            return "Ali";
        }
        while (numberProcess / 2 != 1) {
            naserWins = !naserWins;
            if ((numberProcess & -numberProcess) == numberProcess) {
                numberProcess = numberProcess / 2;
            } else {
                numberProcess = numberProcess - getNextLowerPowerOfTwo(numberProcess);
            }
        }
        return naserWins ? "Naser" : "Ali";
    }
    public static int getNextLowerPowerOfTwo(int n) {
        int power = 1;
        while (power * 2 <= n) {
            power *= 2;
        }
        return power;
    }
}

