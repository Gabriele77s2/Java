// Abstract:
//  It is a non-access modifier which is used to create abstract class and method.
//  The role of an abstract class is to contain abstract methods.
//  However, it may also contain non-abstract methods.
//  The method which is declared with abstract keyword and doesn't have any implementation is known as an abstract method.
//  Rules do not:
//   An abstract keyword cannot be used with variables and constructors.
//   If a class is abstract, it cannot be instantiated.
//   If a method is abstract, it doesn't contain the body.
//   We cannot use the abstract keyword with the final.
//   We cannot declare abstract methods as private.
//   We cannot declare abstract methods as static.
//   An abstract method can't be synchronized.
//  Rules do:
//   An abstract keyword can only be used with class and method.
//   An abstract class can contain constructors and static methods.
//   If a class extends the abstract class, it must also implement at least one of the abstract method.
//   An abstract class can contain the main method and the final method.
//   An abstract class can contain overloaded abstract methods.
//   We can declare the local inner class as abstract.
//   We can declare the abstract method with a throw clause.

// Example 1: Abstract class containing the abstract method
abstract class Vehicle {
    abstract void bike();
}

class Honda extends Vehicle {
    @Override
    void bike() {
      System.out.println("Bike is running");
    }
}

public class AbstractExample1 {
    public static void main(String[] args) {
    Honda obj = new Honda();
    obj.bike();
    }
} // Out: Bike is running


// Example 2: Abstract class containing the abstract and non-abstract method
abstract class Vehicle {
    abstract void bike();
    void car() {
      System.out.println("Car is running");
    }
}

class Honda extends Vehicle {
    @Override
    void bike() {
      System.out.println("Bike is running");
    }
}

public class AbstractExample2 {
    public static void main(String[] args) {
    Honda obj = new Honda();
    obj.bike();
    obj.car();
    }
} // Out: Bike is running
  //      Car is running


// Example 3: Abstract class containing the constructor
abstract class Vehicle {
    String msg; // constructor
    Vehicle(String msg) {
      this.msg = msg;
    }

    void display() {
      System.out.println(msg);
    }
}

class Honda extends Vehicle {
    Honda(String msg) {
      super(msg);
    }
}

public class AbstractExample3 {
    public static void main(String[] args) {
    Honda obj = new Honda("Constructor is invoked");
    obj.display();
    }
} // Out: Constructor is invoked


// Example 4: Abstract class containing overloaded abstract methods
abstract class Vehicle {
    abstract void display();
    abstract void display(String msg);
}

class Honda extends Vehicle {
    @Override
    void display() {
       System.out.println("abstract method is invoked");
    }

    @Override
    void display(String msg) {
       System.out.println(msg);
    }
}

public class AbstractExample4 {
    public static void main(String[] args) {
      Honda obj = new Honda();
      obj.display();
      obj.display("overloaded abstract method is invoked");
    }
} // Out: abstract method is invoked
  //      overloaded abstract method is invoked


// Example 5: Inner abstract class
class Vehicle {
    abstract class Car {
        abstract void display();
    }

class Honda extends Car {
    @Override
    void display() {
        System.out.println("inner abstract class is invoked");
    }
}
}

public class AbstractExample5 {
    public static void main(String[] args) {
      Vehicle obj = new Vehicle();
      Vehicle.Car c = obj.new Honda();
      c.display();
    }
} // Out: inner abstract class is invoked


// Example 6: Nested abstract class
abstract class Vehicle {
    abstract class Car {
        abstract void display();
    }
}

class Honda extends Vehicle {
    class FourWheller extends Car {
      @Override
      void display() {
        System.out.println("nested abstract class is invoked");
      }
}
}

public class AbstractExample6 {
    public static void main(String[] args) {
      Vehicle obj = new Honda();
      Honda h = (Honda)obj;
      Honda.FourWheller fw = h.new FourWheller();
      fw.display();
    }
} // Out: nested abstract class is invoked
