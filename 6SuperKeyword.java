/*
Super:
 Per fare riferimento all'oggetto della superclasse (genitore).
 Quando si crea l'istanza della sottoclasse viene creata implicitamente un'istanza della superclasse a cui fa riferimento la variabile super.
 Per invocare il metodo della superclasse.
 Per invocare il costruttore della superclasse (this()).
 this() fornito dal compilatore implicitamente.
*/

// Per fare riferimento all'oggetto della superclasse (genitore)
class Animal{
   String color="white";
}
class Dog extends Animal{
   String color="black";
   void printColor(){
      System.out.println(color);//prints color of Dog class
      System.out.println(super.color);//prints color of Animal class
   }
}
class TestSuper1{
   public static void main(String args[]){
      Dog d=new Dog();
      d.printColor();
}} // black
   // white

// Per invocare il metodo della superclasse
class Animal{
   void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
   void eat(){System.out.println("eating bread...");}
   void bark(){System.out.println("barking...");}
   void work(){
      super.eat();
      bark();
   }
}
class TestSuper2{
   public static void main(String args[]){
      Dog d=new Dog();
      d.work();
}} // eating...
   // barking...

// Per invocare il costruttore della superclasse (this())
class Animal{
   Animal(){System.out.println("animal is created");}
}
class Dog extends Animal{
   Dog(){
      super();
      System.out.println("dog is created");
   }
}
class TestSuper3{
   public static void main(String args[]){
      Dog d=new Dog();
}} // animal is created
   // dog is created

// this() fornito dal compilatore implicitamente
class Animal{
   Animal(){System.out.println("animal is created");}
}
class Dog extends Animal{
   Dog(){
      System.out.println("dog is created");
   }
}
class TestSuper4{
   public static void main(String args[]){
      Dog d=new Dog();
}} // animal is created
   // dog is created
