/*
Features of Java:
 Object-Oriented:
  Object, Class, Inheritance, Polymorphism, Abstraction, Encapsulation
 Portable:
  It facilitates you to carry the Java bytecode to any platform because it doesn't require any implementation.
 Plaftform indipendent:
  A platform is the hardware or software environment in which a program runs.
  There are two types of platforms software-based and hardware-based.
  Java provides a software-based platform.
  It has two components: Runtime Environment, API(Application Programming Interface).
  Java code is compiled by the compiler and converted into bytecode.
  This bytecode is a platform-independent code because it can be run on multiple platforms.
 Multi-threaded:
  A thread is like a separate program, executing concurrently.
  We can write Java programs that deal with many tasks at once by defining multiple threads.
  The advantage of Multi-threading is that it doesn't occupy memory for each thread , but it shares a common memory area.


// Parameters:
//  class:
//   Keyword is used to declare a class in java.
//  public:
//   Keyword is an access modifier which represents visibility.
//   It means it is visible to all.
//  static:
//   It is a keyword.
//   If declare a static method there is no need to create an object to invoke the static method.
//   The main method is executed by the JVM, so it doesn't require to create an object to invoke the main method.
//  void:
//   It is the return type of the method and it doesn't return any value.
//  main:
//   It represents the starting point of the program.


// Compile Time:
//  At compile time phase, java file is compiled by Java Compiler (it does not interact with OS) and converts the java code into bytecode.
// Runtime:
//  Class File -> Classloader -> Bytecode -> Interpreter -> Runtime -> Hardware.
// Classloader:
//  It is the subsystem of JVM that is used to load class files.


// JVM (Java Virtual Machine):
//  It is a specification that provides a runtime environment in which Java bytecode can be executed.
//  It doesn't physically exist.
//  It can also run those programs which are written in other languages and compiled to Java bytecode.
//  It has three notions: specification, implementation, and instance.
//  Main tasks:
//   Loads code -> Verifies code -> Executes code -> Provides runtime environment.
//  JVM, JRE, JDK are platform dependent because the configuration of each OS is different from each other.
//  However, Java is platform independent.


// JRE (Java Runtime Environment):
//  It is a set of software tools which are used for developing Java applications.
//  It is used to provide the runtime environment.
//  It is the implementation of JVM.
//  It physically exists.
//  It contains a set of libraries + other files that JVM uses at runtime.


// JDK (Java Development Kit):
//  It is a software development environment which is used to develop Java applications and applets.
//  It physically exists.
//  It contains JRE + development tools.
//  It contains a private JVM and a few other resources such as:
//   an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (javadoc).

// Create Documentation API:
//  javadoc ClassName.java

// Type of Variables:
//  Local:
//   It declared inside the body of the method.
//   You can use it only within that method and the other methods in the class aren't even aware that the variable exists.
//  Instance:
//   It declared inside the class but outside the body of the method.
//   Its value is instance specific and is not shared among instances.
//  Static:
//   You can create a single copy of static variable and share among all the instances of the class.
//   Memory allocation for static variable happens only once when the class is loaded in the memory.
*/

class A{
   int data = 50; // instance variable
   static int m = 100; // static variable
   void method(){
      int n = 90; // local variable
   }
}


// Datatypes
byte myByte = 100;
short myShort = 5000;
int myNum = 5;
long myLong = 15000000000L;
float myFloat = 5.99f;
double myDouble = 19.99d;
char myLetter = 'D';
boolean myBool1 = true;
boolean myBool2 = false;
String myText = "Hello";
