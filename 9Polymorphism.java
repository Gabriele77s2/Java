/*
Sovraccarico del metodo (overloading):
 Quando una classe ha più metodi con lo stesso nome ma diversi parametri.
 Aumenta la leggibilità del codice.
 Due modi: Modicando il numero di argomenti, Modificando il tipo di dati
 In Java non è possibile modificando il tipo di ritorno (return) del metodo a causa dell'ambiguità.
 Anche sul main.
*/

// modifica n. di argomenti
class Adder{
   static int add(int a, int b) {return a + b;}
   static int add(int a, int b, int c) {return a + b + c;}
}
class TestOverloading1{
   public static void main (String [] args){
      System.out.println(Adder.add(11, 11));
      System.out.println(Adder.add(11, 11, 11));
}
} // 22
  // 33

// modifica del tipo di dati degli argomenti
class Adder{
   static int add(int a, int b) {return a + b;}
   static double add(double a, double b) {return a + b;}
}
class  TestOverloading2 {
   public static void main(String [] args){
      System.out.println(Adder.add(11, 11));
      System.out.println(Adder.add(12.3, 12.6));
}
} // 22
  // 24.9


/*
Sostituzione del metodo (overriding):
 Quando la sottoclasse (figlia) ha lo stesso metodo dichiarato nella superclasse (genitore).
 Per l'implementazione specifica di un metodo che è già fornito dalla sua superclasse.
 Per polimorfismo di runtime.
 Regole: stesso nome e parametro della superclasse, relazione is-a (ereditarietà).
 Metodo static non può essere sovrascritto perchè è associato alla classe.
 Mentre, il metodo d'istanza è associato a un oggetto.
 Main non può essere sovrascritto.
 */

// senza overriding
//Creating a parent class
class Vehicle{
  void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike extends Vehicle{
  public static void main(String args[]){
  //creating an instance of child class
  Bike obj = new Bike();
  //calling the method with child class instance
  obj.run();
  }
} // Vehicle is running

// con overriding
/Creating a parent class.
class Vehicle{
  //defining a method
  void run(){System.out.println("Vehicle is running");}
}
//Creating a child class
class Bike2 extends Vehicle{
  //defining the same method as in the parent class
  void run(){System.out.println("Bike is running safely");}

  public static void main(String args[]){
  Bike2 obj = new Bike2();//creating object
  obj.run();//calling method
  }
} // Bike is running safely


/*
Overloading (OL) vs Overriding (OR):
(OL): Aumenta la leggibilità del codice.
(OR): Per l'implementazione specifica di un metodo che è già fornito dalla sua superclasse.
(OL): Eseguito nella classe.
(OR): Eseguito in due classi che hanno relazione is-a (ereditarietà).
(OL): Parametro diverso.
(OR): Parametro uguale.
(OL): Polimorfismo in fase di compilazione.
(OR): Polimorfismo in fase di esecuzione.
*/
