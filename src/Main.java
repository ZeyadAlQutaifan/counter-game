import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        init();
    }

    public static void init() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Naser insert number:");
            int initialValue = scanner.nextInt();
            String winner = whoWins(initialValue);
            System.out.println("The winner is: " + winner);
        } catch (Exception e) {
            System.out.println("Input a valid integer value");
            init();
        }

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

