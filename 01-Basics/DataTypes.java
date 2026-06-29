// Day 01 - Data Types in Java
// Author: Nithishkumar S | github.com/NITHISHKUMAR006

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte   : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short  : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int    : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long   : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("char   : 0 to 65535");
        System.out.println("boolean: true or false");

        System.out.println("\n=== Non-Primitive ===");
        String name = "Nithish";
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("String: " + name);
        System.out.println("Array length: " + numbers.length);
    }
}
