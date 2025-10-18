package Chapter1;
/**
 * 1.5 (Compute expressions) Write a program that displays the result of
 * ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5)
 */
//Java already has operator precedence rules, but it's better to use brackets to avoid ambiguity.
public class Exercise1_5 {
    public static void main(String[] args) {
        System.out.print("The result of\n((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5) is = ");
        System.out.println( ((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5) );
    }
}
