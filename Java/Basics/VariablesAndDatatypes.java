// VariablesAndDatatypes.java

public class VariablesAndDatatypes {
    public static void main(String[] args) {

        // Primitive Datatypes
        byte b = 10;                           // 1 byte | range: -128 to 127     
        short s = 100;                         // 2 bytes | range: -32,768 to 32,767
        int i = 1000;                          // 4 bytes | most commonly used
        long l = 100000L;                      // 8 bytes | large numbers

        float f = 10.5f;                       // 4 bytes | decimal (less precision)
        double d = 99.99;                      // 8 bytes | decimal (more precision)

        char c = 'A';                          // 2 bytes | single character 
        boolean isJavaFun = true;              // true/false 

        // Non-Primitive
        String name = "Shubham";               // stores sequence of characters (Unicode) | memory depends on content
        int[] arr = {1, 2, 3};                 // size = length * int size (4 bytes each)

        // Output
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String " + name);
    }
}

/*
Output:
byte: 10
short: 100
int: 1000
long: 100000
float: 10.5
double: 99.99
char: A
boolean: true
String: Shubham
*/
