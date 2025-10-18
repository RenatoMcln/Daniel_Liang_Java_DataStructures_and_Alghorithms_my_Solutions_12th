package Chapter1;

/**
 * 1.3 (Display a pattern) Write a program that displays the following pattern:
 *      J     A     V     V     A
 *      J    A A     V   V     A A
 *  J   J   AAAAA     V V     AAAAA
 *   J J   A     A     V     A     A
 */
//This could be solved in one line by using "\n" as line break, but that would make the line too long for readability.
public class Exercise1_3 {
    public static void main(String[] args) {
        System.out.println("    J     A     V     V     A   ");
        System.out.println("    J    A A     V   V     A A  ");
        System.out.println("J   J   AAAAA     V V     AAAAA ");
        System.out.println(" J J   A     A     V     A     A");
    }
}
