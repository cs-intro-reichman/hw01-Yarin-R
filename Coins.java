/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
// class declaration
public class Coins {
    // main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
    public static void main(String[] args){
        // quarters,cents - the first and the second user-inputs' values.
        // each converted from string to int.
        // quarters - 25 cents.
        // cents - coins left after changing each 25 coins into quarters.
        int quarters = Integer.parseInt(args[0]) / 25;
        int cents = Integer.parseInt(args[0]) % 25;
        // printing the results exactly as the PDF states.
        System.out.println("Use " + quarters + " quarters and " + cents + " cents");
    }
}
