/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
// class declaration
public class GenThree {
    // main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
    public static void main(String[] args){
        // saving the user-inputs' values while converting them from strings to integers.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // finding the min and max user-inputs' numbers and save them as 
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        // generate 3 random numbers between min and max using for-loop and Math.random().
        int gen1st = (int)((Math.random() * (max - min)) + min);
        int gen2nd = (int)((Math.random() * (max - min)) + min);
        int gen3rd = (int)((Math.random() * (max - min)) + min);
        // printing the results exactly as the PDF states.
        System.out.println(gen1st);
        System.out.println(gen2nd);
        System.out.println(gen3rd);
        // finding the min generated number out of 3.
        int minGen = Math.min(Math.min(gen1st, gen2nd), gen3rd);
        // printing the results exactly as the PDF states.
        System.out.println("The minimal generated number was " + minGen);
    }
}
