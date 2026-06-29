// Day 01 - Operators in Java
// Author: Nithishkumar S | github.com/NITHISHKUMAR006

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 3;

        System.out.println("=== Arithmetic ===");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n=== Relational ===");
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        System.out.println("\n=== Logical ===");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x     : " + (!x));

        System.out.println("\n=== Increment / Decrement ===");
        int n = 5;
        System.out.println("n++  : " + n++);
        System.out.println("After: " + n);
        System.out.println("++n  : " + (++n));
    }
}
