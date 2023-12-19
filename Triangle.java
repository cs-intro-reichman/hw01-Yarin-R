/*
 * Three sides can form a triangle if the sum of the lengths of any two sides is greater than the length of the remaining side. 
 * This is known as the Triangle Inequality Theorem. 
 * Write a program that tests if three given integers form a triangle.
 */ 
// class declaration
public class Triangle {
    // main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
    public static void main(String[] args){
        // finding the max, min and middle user-inputs' values.
        // each converted from string to double.
        // each symbolise a lenght of a line.
        int max = Math.max(Math.max(Integer.parseInt(args[0]),Integer.parseInt(args[1])),Integer.parseInt(args[2]));
        int min = Math.min(Math.min(Integer.parseInt(args[0]),Integer.parseInt(args[1])),Integer.parseInt(args[2]));
        int mid = Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2]) - max - min;
        // checking if the 3 lines can form a triangle according to
        // Triangle Inequality Theorem.
        boolean isTriangle = min + mid > max;
        // printing the results exactly as the PDF states.
        System.out.println(Integer.parseInt(args[0]) + ", " + Integer.parseInt(args[1]) + ", " + Integer.parseInt(args[2]) + ": " + isTriangle);
    }
}
