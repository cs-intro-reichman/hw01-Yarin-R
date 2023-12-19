/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
// class declaration
public class Gen3 {
    // main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
    public static void main(String[] args){
        // array of 3 ints declararion.
        int[] gen = new int[3];
        // finding thr min and max user-inputs' numbers.
        int max = Math.max(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        int min = Math.min(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
        // generate 3 random numbers between min and max using for-loop and Math.random().
        for (int i = 0; i < 3; i++) {
            gen[i] = (int)((Math.random() * (max - min)) + min);
            // printing the results exactly as the PDF states.
            System.out.println(gen[i]);
        }
        // finding the min generated number out of 3.
        int minGen = Math.min(Math.min((gen[0]),(gen[1])),(gen[2]));
        // printing the results exactly as the PDF states.
        System.out.println("The minimal generated number was " + minGen);
    }
}
