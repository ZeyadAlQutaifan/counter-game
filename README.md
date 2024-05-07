# Number Game: Naser vs Ali

This Java program implements a simple number game where two players, Naser and Ali, take turns subtracting numbers from a given initial value until the value reaches 1. The winner of the game is determined based on a specific rule set.

## Rules of the Game

1. **Starting Point**: The game begins with a user-input integer value.
2. **Turns**: Players take turns to subtract a certain value from the current number.
3. **Subtraction Rules**:
    - If the current number is a power of 2, the player must halve it.
    - If the current number is not a power of 2, the player must subtract the highest power of 2 less than the current number.
4. **Victory Condition**: The player who reaches the number 1 wins the game.

## Implementation Details

- **Java Version**: This program is written in Java.
- **Input Handling**: User inputs are managed using the `Scanner` class.
- **Game Logic**: The core game logic is implemented through the `whoWins` method, which determines the winner based on the current number.
- **Recursion**: The game logic utilizes recursion to determine the winner of each turn.
- **Error Handling**: Exception handling is implemented to handle invalid user inputs.

## Usage

To run the program, compile the `Main.java` file and execute the generated class file. Follow the on-screen instructions to input the initial number and observe the game's outcome.

```bash
javac Main.java
java Main
