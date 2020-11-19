// New:
//  It is used to create an instance of the class.
//  It instantiates a class by allocating memory for a new object and returning a reference to that memory.
//  It may create the array object.
//  It is used to create the object.
//  It allocates the memory at runtime.
//  All objects occupy memory in the heap area.
//  It invokes the object constructor.
//  It requires a single, postfix argument to call the constructor


// Example 1: create an object using new keyword and
//            invoking the method using the corresponding object reference.
public class NewExample1 {
    void display() {
       System.out.println("Invoking Method");
    }

    public static void main(String[] args) {
       NewExample1 obj = new NewExample1();
       obj.display();
    }
} // Out: Invoking Method


// Example 2: create an object using new keyword and
//            invoking the constructor using the corresponding object reference.
public class NewExample2 {
    NewExample2() {
        System.out.println("Invoking Constructor");
    }

    public static void main(String[] args) {
        NewExample2 obj = new NewExample2();
    }
} // Out: Invoking Constructor


// Example 3: create an object using new keyword and invoke the parameterized constructor.
public class NewExample3 {
    int a, b;
    NewExample3(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        NewExample3 obj = new NewExample3(10, 20);
        obj.display();
    }
} // Out: 30


// Example 4: create an array object using the new keyword.
public class NewExample4 {
    static int arr[]=new int[3];

    public static void main(String[] args) {
        System.out.println("Array length: "+arr.length);
    }
} // Out: 3


// Example 5: use new keywords in Java collections.
import java.util.*;
public class NewExample5 {
    public static void main(String[] args) {
        List obj = new ArrayList();
        obj.add("Java");
        obj.add("C++");
        obj.add("Python");
        System.out.println(obj);
    }
} // Out: [Java, C++, Python]
