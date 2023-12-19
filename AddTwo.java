/*
 * Adds two given integers and prints the result in a fancy way.
 */
// class declaration
public class AddTwo {
    // main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
    public static void main(String[] args){
        // a,b - the first and the second user-inputs' values.
        // each converted from string to int.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // printing the results exactly as the PDF states.
        System.out.println(a + " + " + b + " = " + (a + b));
    }
}

