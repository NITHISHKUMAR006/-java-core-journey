// Day 01 - Type Casting in Java
// Author: Nithishkumar S | github.com/NITHISHKUMAR006

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("=== Implicit (Widening) Casting ===");
        int i = 100;
        long l = i;
        double d = l;
        System.out.println("int    : " + i);
        System.out.println("long   : " + l);
        System.out.println("double : " + d);

        System.out.println("\n=== Explicit (Narrowing) Casting ===");
        double pi = 3.99;
        int piInt = (int) pi;
        System.out.println("double : " + pi);
        System.out.println("int    : " + piInt);  // 3 (truncated)

        System.out.println("\n=== char <-> int ===");
        char ch = 'A';
        int ascii = ch;
        System.out.println("char 'A' as int : " + ascii);
        char fromInt = (char) 66;
        System.out.println("int 66 as char  : " + fromInt);
    }
}
