import java.lang.*;
// program_003 - swap two numbers
class Swap {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        System.out.println("x, Before Swapping: " + x);
        System.out.println("y, Before Swapping: " + y);
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println("x, After Swapping: " + x);
        System.out.println("y, After Swapping: " + y);
    }
}

/* Other Swapping Operations...

// Swapping Strings
class Swap {
    public static void main(String[] args){
        String x = "gfg";
        String y = "php";
        System.out.println("x, Before Swapping: " + x);
        System.out.println("y, Before Swapping: " + y);
        String temp = "null";
        temp = x;
        x = y;
        y = temp;
        System.out.println("x, After Swapping: " + x);
        System.out.println("y, After Swapping: " + y);
    }
}

// Swapping using Addition/Subtraction
class Swap {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        
        System.out.println("x, Before Swapping: " + x);
        System.out.println("y, Before Swapping: " + y);
        
        x = x + y; // x becomes 30
        y = x - y; // y becomes 10 (original x)
        x = x - y; // x becomes 20 (original y)
        
        System.out.println("x, After Swapping: " + x);
        System.out.println("y, After Swapping: " + y);
    }
}

// Swapping using Multiplication/Division
class Swap {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        
        System.out.println("x, Before Swapping: " + x);
        System.out.println("y, Before Swapping: " + y);
        
        x = x * y; // x becomes 200
        y = x / y; // y becomes 10 (original x)
        x = x / y; // x becomes 20 (original y)
        
        System.out.println("x, After Swapping: " + x);
        System.out.println("y, After Swapping: " + y);
    }
}

// Swapping using XOR (Bitwise) Operation
class Swap {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        
        System.out.println("x, Before Swapping: " + x);
        System.out.println("y, Before Swapping: " + y);
        
        x = x ^ y; // x now holds XOR of x and y
        y = x ^ y; // y becomes original x
        x = x ^ y; // x becomes original y
        
        System.out.println("x, After Swapping: " + x);
        System.out.println("y, After Swapping: " + y);
    }
}

// Swapping using Lambdas (Only applicable in Java 8+)

import java.util.concurrent.atomic.AtomicInteger;

class Swap {
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        
        System.out.println("x, Before Swapping: " + x);
        System.out.println("y, Before Swapping: " + y);
        
        AtomicInteger xAtomic = new AtomicInteger(x);
        AtomicInteger yAtomic = new AtomicInteger(y);

        xAtomic.set(yAtomic.getAndSet(xAtomic.get()));

        x = xAtomic.get();
        y = yAtomic.get();
        
        System.out.println("x, After Swapping: " + x);
        System.out.println("y, After Swapping: " + y);
    }
}

*/