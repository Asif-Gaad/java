public class ShiftOperators {
    public static void main(String[] args) {

        int a = 10;   // Binary: 00001010
        int b = -10;  // Negative number

        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);

        // Left Shift Operator (<<)
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a << 2 = " + (a << 2));

        // Right Shift Operator (>>)
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a >> 2 = " + (a >> 2));

        // Unsigned Right Shift Operator (>>>)
        System.out.println("a >>> 1 = " + (a >>> 1));
        System.out.println("b >>> 1 = " + (b >>> 1));
    }
}
