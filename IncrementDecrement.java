public class IncrementDecrement {
    public static void main(String[] args) {

        int a = 10;

        // Postfix Increment
        System.out.println("Postfix Increment:");
        System.out.println("a = " + a++);
        System.out.println("After a++ , a = " + a);

        // Prefix Increment
        System.out.println("\nPrefix Increment:");
        System.out.println("a = " + ++a);
        System.out.println("After ++a , a = " + a);

        // Postfix Decrement
        System.out.println("\nPostfix Decrement:");
        System.out.println("a = " + a--);
        System.out.println("After a-- , a = " + a);

        // Prefix Decrement
        System.out.println("\nPrefix Decrement:");
        System.out.println("a = " + --a);
        System.out.println("After --a , a = " + a);
    }
}
