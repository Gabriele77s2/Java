/*
Programmazione Procedurale PP:
 Scrittura di procedure o metodi che eseguono operazioni sui dati.

OOP:
 Creazione di classi ed oggetti che contengono sia dati che metodi.

Vantaggi OOP:
 Facile sviluppo e manutenzione.
 Nella PP non è facile da gestire se il codice cresce all'aumentare delle dimensioni del progetto.
 Occultamento dei dati.
 Nella PP è possibile accedere ai dati globali da qualsiasi luogo.
 Simulare eventi del mondo reale in modo più efficace.

Paradigma OO:
 Oggetto, Classe, Ereditarietà, Polimorfismo, Astrazione, Incapsulamento

Oggetto:
 Tre caratteristiche:
  Stato: dati (valori).
  Comportamento: funzionalità.
  Identità: ID univoco.
 Es.: un cane è un oggetto perchè ha degli stati come colore, nome, razza e comportamenti come scodinzolare, abbaiare, mangiare.
 Entità fisica o logica.
 Istanza di una classe.
 Ha un indirizzo e occupa uno spazio di memoria.
 Può comunicare senza conoscere i dettagli dei dati o del codice.
 Tre inizializzazioni: Per variabile di riferimento, Per metodo, Per costruttore.

Classe:
 Collezione di oggetti con proprietà comuni.
 Modello o progetto da cui creare gli oggetti.
 Entità logica.
 Campi, Metodi, Costruttori, Blocchi, Classi e Interfacce nidificate.
 Non occupa uno spazio di memoria.

Variabile di istanza:
 Variabile creata in una classe ma all'esterno del metodo.
 Non occupa memoria in fase di compilazione.
 Occupa memoria in fase di esecuzione, quando viene creato un oggetto o un'istanza.

Ereditarietà:
 Quando un oggetto acquisisce tutte le proprietà e i comportamenti da un oggetto genitore.
 Riusabilità del codice.
 Usato per ottenere il polimorfismo runtime.

Polimorfismo:
 Quando un compito viene eseguito in differenti modi.
 Es.: disegnare qualcosa come un cerchio, triangolo.
 Usiamo overloading e overriding per ottenerlo.
 Es.: un gatto miagola, un cane abbaia, ma entrambi parlano.

Astrazione:
 Nascondere i dettagli interni e mostrare le funzionalità.
 Es.: una telefonata non conosciamo come funziona.
 Usiamo la classe astratta e l'interfaccia per ottenerla.

Incapsulamento:
 Legame (binding o wrapping) di codice e dati insieme in una singola unità.
 Es.: una capsula al cui interno ha il farmaco.

Accoppiamento:
 Conoscenza, informazioni o dipendenza di un'altra classe.
 Quando le classi sono consapevoli l'una dell'altra.
 Se una classe ha informazioni sui dettagli di un'altra classe c'è un forte accoppiamento.
 Usiamo modifcatori public, private, protected per visualizzare il livello di visibilità di una classe, metodo e campo.
 Usiamo le interfacce per l'accoppiamento più debole perchè non esiste un'implementazione concreta.

Coesione:
 Livello di un componente che esegue un singolo compito.
 Il compito viene svolto con un metodo altamente coeso.
 Il metodo debolmente coeso suddividerà l'attività in parti separate.
 Il pacchetto java.io è altamente coeso perchè ha classi e interfacce relative all'I/O.
 Il pacchetto java.util è debolmente coeso perchè ha classi e interfacce non correlate.

Associazione:
 Relazione tra gli oggetti.
 Un oggetto può essere associato ad uno o più oggetti.
 Unidirezionale o bidirezionale.
 Quattro tipi:
  uno a uno: un paese può avere un primo ministro.
  uno a molti: un primo ministro può avere molti ministri.
  molti a uno: molti parlamentari possono avere un primo ministro.
  molti a molti: molti ministri possono avere molti dipartimenti.

Aggregazione:
 Modo per ottenere l'associazione.
 Relazione in cui un oggetto contiene altri oggetti come parte del suo stato.
 Relazione debole tra gli oggetti.
 Modo per riutilizzare gli oggetti.

Composizione:
 Modo per raggiungere l'associazione.
 Relazione in cui un oggetto contiene altri oggetti come parte del suo stato.
 Relazione forte tra l'oggetto contenitore e l'oggetto dipendente.
 Stato in cui gli oggetti contenenti non hanno un'esistenza indipendente.
 Se elimini l'oggetto padre, elimini tutti gli oggetti figlio.

Costruttore:
 Blocco di codice simile al metodo.
 Chiamato quando si crea un'istanza della classe.
 Al momento della chiamata del costruttore la memoria per l'oggetto viene allocata nella memoria.
 Inizializza lo stato di un oggetto.
 Quando un oggetto viene creato usando new(), viene chiamato almeno un costruttore.
 Il compilatore Java ne fornisce uno predefinito (default) se non si dispone di alcun costruttore in una classe.
 Nome uguale a quello della sua classe.
 Non ha un tipo restituito (return) esplicito.
 Non può essere abstract, static, final, synchronized.
 Possiamo usare i modificare di accesso durante la dichiarazione.
 Può essere public, private, protected, default.
 Due tipi:
  Predefinito (default): senza argomenti, non ha alcun parametro.
  Parametrizzato: utilizzato per fornire valori diversi o uguali a oggetti distinti.
 Come un metodo, può essere sovraccaricato per avere più di un costruttore con diverse liste di parametri.
 Può avviare un thread.
 Può chiamare un metodo.
 Esiste una classe Constructor che fornisce informazioni interne di un costruttore nella classe (java.lang.reflect).

Costruttore(C) vs Metodo(M):
 (C) Inizializza lo stato di un oggetto.
 (M) Espone il comportamento di un oggetto.
 (C) Non ha un tipo restituito.
 (M) Ha un tipo restituito.
 (C) Richiamato implicitamente.
 (M) Richiamato esplicitamente.
 (C) Il compilatore Java ne fornisce uno predefinito (default) se non si dispone di alcun costruttore in una classe con valori di 0, null.
 (M) Non è fornito.
 (C) Nome uguale al quello della sua classe.
 (M) Nome può o non può essere uguale a quello della classe.










*/

public class MyClass { // creazione classe
  int x = 5;
  final float PI = 3.14f;  // final (modificatore) quando vogliamo che una variabile memorizzi sempre lo stesso valore

  public static void main(String[] args) {
   MyClass myObj1 = new MyClass();  // creazione oggetto 1
   MyClass myObj2 = new MyClass();  // creazione oggetto 2
   System.out.println(myObj1.x);    // accesso attributo
   myObj1.x = 40;                   // modifica attributo
   System.out.println(myObj2.x);
   myObj2.PI = 25;                   // impossibile sovrascrivere l'attributo per via di final
   System.out.println(myObj1.x + myObj2.PI)   // attributi multipli
  }
}


// Metodi di accesso con un oggetto
// Create a Car class
public class Car {

  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}

// meglio dividere e creare più classi
public class Car {
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }
}

class OtherClass {
  public static void main(String[] args) {
    Car myCar = new Car();     // Create a myCar object
    myCar.fullThrottle();      // Call the fullThrottle() method
    myCar.speed(200);          // Call the speed() method
  }
}


// Costruttori
//  inizializzano oggetti
//  tutte le classi hanno costruttori di default: se non crei un costruttore di classi, Java ne crea uno
//   ma non è possibile impostare i valori iniziali per gli attributi degli oggetti

// Create a MyClass class
public class MyClass {
  int x;  // Create a class attribute

  // Create a class constructor for the MyClass class
  public MyClass() { // il nome del costruttore deve corrispondere al nome della classe e non può avere un tipo restituito (come void)
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(); // Create an object of class MyClass (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// parametri del costruttore
//  inizializzano gli attributi
public class MyClass {
  int x;

  public MyClass(int y) { // int y, aggiunta parametro
    x = y;                // all'interno del costruttore imposto il parametro
  }

  public static void main(String[] args) {
    MyClass myObj = new MyClass(5); // (5) passaggio parametro y al costruttore MyClass
    System.out.println(myObj.x);
  }
}

// altro esempio
public class Car {
  int modelYear;
  String modelName;

  public Car(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}


// Modificatori
//  di accesso : controlla il livello di accesso
//  di non accesso : non controlla il livello di accesso ma fornisce altre funzionalità
//  di accesso per le classi :
//    public : classe accessibile da altre classi; imposta il livello di accesso per classi, attributi, metodi, costruttori
//    default : classe accessibile solo da altre classi con lo stesso package; usato quando non specifichi un modificatore
//  di accesso per attributi, metodi, costruttori :
//    public : codice accessibile da tutte le classi
//    private : codice accessibile solo all'interno della classe dichiarata
//    default : codice accessibile nello stesso package; usato quando non specifichi un modificatore
//    protected : codice accessibile nello stesso package e sottoclasse
//  di non accesso per le classi :
//    final : classe non può essere ereditata da altre classi
//    abstract : classe non può essere usata per creare oggetti (per accedere ad una classe astratta, deve essere ereditata da un'altra classe)
//  di non accesso per attributi, metodi :
//    final : attributi e metodi non possono essere sovrascritti o modificati
//    static : attributi e metodi appartengono alla classe piuttosto che ad un oggetto
//    abstract : si può utilizzare solo in una classe astratta e sui metodi, poichè il metodo non ha un corpo ma è fornito da una sottoclasse ereditata

// final
public class MyClass {
  final int x = 10;
  final double PI = 3.14;

  public static void main(String[] args) {
    MyClass myObj = new MyClass();
    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
  }
}

// static
public class MyClass {
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[ ] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would output an error

    MyClass myObj = new MyClass(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}

// abstract
// Code from filename: Person.java
abstract class Person {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from Person)
class Student extends Person {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}
// End code from filename: Person.java

// Code from filename: MyClass.java
class MyClass {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Person)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}


// Incapsulamento
//  dati sensibili nascosti agli utenti
//  bisogna dichiare variabili, attributi come private
//  get e set metodi per accedere e aggiornare il valore di una private variabile
//  get : restituisce il valore della variabile (lettura)
//  set : imposta il valore (scrittura)

public class Person {
  private String name; // private = restricted access

  // Getter
  public String getName() {
    return name;     // restituisce il valore della variabile name
  }

  // Setter
  public void setName(String newName) {
    this.name = newName;  // prende il parametro (newName) e lo assegna alla variabile name
                          // this, fa riferimento all'oggetto corrente
}

// poichè name è private, non possiamo accedervi dall'esterno di questa classe
// quindi se vogliamo usarla in un'altra classe, darà errore
public class MyClass {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.name = "John";  // error
    System.out.println(myObj.name); // error
  }
}

// per ovviare al problema possiamo cambiare private con public però sputtani l'incapsulamento
// oppure usare getName() e setName()
public class MyClass {
  public static void main(String[] args) {
    Person myObj = new Person();
    myObj.setName("John"); // Set the value of the name variable to "John"
    System.out.println(myObj.getName());
  }
}


// Ereditarietà
//  ereditare e riutilizzare attributi e metodi da un'altra classe
//  superclasse (padre) : da cui si eredita
//  sottoclasse (figlio) : che eredita (extends)
//  chiamare la classe final non fa ereditare
class Vehicle {
  protected String brand = "Ford";        // Vehicle attribute
                                          // protected perchè così possiamo accedervi
  public void honk() {                    // Vehicle method
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {   // nuova classe Car eredita da Vehicle
  private String modelName = "Mustang";    // Car attribute
  public static void main(String[] args) {

    // Create a myCar object
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);  // visualizzo "Mustang" (private) perchè mi trovo nella stessa classe
                                                              // se il main fosse stato fuori da Car, non avrei potuto
   }
}


// Polimorfismo
//  quando abbiamo più classi che ereditano
//  riutilizza attributi e metodi di una classe esistente
class Animal {
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Animal {
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();  // Create a Animal object
    Animal myPig = new Pig();  // Create a Pig object
    Animal myDog = new Dog();  // Create a Dog object
    myAnimal.animalSound();
    myPig.animalSound();
    myDog.animalSound();
  }
}


// Classi Annidate
//  raggruppare le classi che appartengono insieme
class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();   // creo l'oggetto dalla classe esterna
    OuterClass.InnerClass myInner = myOuter.new InnerClass();  // creo l'oggetto della classe interna a partire dall'oggetto della classe interna
    System.out.println(myInner.y + myOuter.x);
  } // Outputs 15 (5 + 10)
}

// se non voglio che gli oggetti esterni accedano alla classe interna, metto private
// se voglio accedervi senza creare un oggetto della classe esterna, metto static

// accedere alla classe esterna dalla classe interna
class OuterClass {
  int x = 10;

  class InnerClass {
    public int myInnerMethod() {
      return x;
    }
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.myInnerMethod());  // invoco il metodo interno che mi restituisce il valore della esterna
  } // Outputs 10
}


// Astrazione
//  nascondere alcuni dettagli e mostrare all'utente solo le parti essenziali
//  ottenuta con classi astratte o interfacce
//  abstract è un modificatore di non accesso usato per classi e metodi :
//   classe astratta : classe ristretta che non si può usare per creare oggetti (per accedervi deve essere ereditata)
//   metodo astratto : si può usare solo in una classe astratta e non ha un corpo in quanto è fornito dall sottoclasse ereditata
//  una classe astratta può avere metodi sia astratti che regolari
// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}


// Interfaccia
//    classe astratta utilizzata per raggruppare metodi correlati con corpi vuoti
//    per accedere ai metodi, l'interfaccia deve essere implementata da un'altra classe (un po' come ereditata),
//     si mette implements anzichè extends
//    non può essere utilizzata per creare oggetti
//    durante l'implementazione di un'interfaccia è necessario sovrascrivere tutti i metodi
//    metodi di default : abstract, public
//    attributi di default : public, static, final
//    non può contenere un costruttore poichè non può essere utilizzata per creare oggetti
//    si utilizza per garantire sicurezza : nascondere alcuni dettagli e mostrare solo quelli importanti

interface Animal {
   public void animalSound(); // i metodi delle interfacce non hanno il corpo
   public void run();
}
// Pig implementa l'interfaccia Animal
class Pig implements Animal {
  public void animalSound() {    // sovrascrivo i metodi della classe Animal
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    System.out.println("Zzz");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    Pig myPig = new Pig();    // posso creare la classe Pig ma non Animal
    myPig.animalSound();
    myPig.sleep();
  }
}

//    java non supporta l'ereditarietà multipla ciò una classe può ereditare solo da una superclasse,
//     però si può ottenere con l'implementazione di più interfacce
interface FirstInterface {
  public void myMethod(); // interface method
}

interface SecondInterface {
  public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface { // implementazione di 2 interfacce
  public void myMethod() {
    System.out.println("Some text..");
  }
  public void myOtherMethod() {
    System.out.println("Some other text...");
  }
}

class MyMainClass {
  public static void main(String[] args) {
    DemoClass myObj = new DemoClass();
    myObj.myMethod();
    myObj.myOtherMethod();
  }
}


// Enums
//    classe speciale solo per le costanti che non cambieranno mai (mesi, giorni,colori, ...)
//    come una classe normale ha attributi e metodi
//    public, static, final (non modificabili)
//    non si può utilizzare per creare oggetti o estendere altre classi
//    può implementare interfacce
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

//    enum all'interno di una classe con switch
public class MyClass {
   enum Level {
   LOW,
   MEDIUM,
   HIGH
 }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM;  // accedere alle costanti enum con il punto

    switch(myVar) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
    }
  }
}

// il metodo values() restituisce tutte le costanti
for (Level myVar : Level.values()) {
  System.out.println(myVar);
}

// altro esempio
public class EnumDemo {
   // Define two enum types -- remember that the definitions
   // go OUTSIDE The main() routine!
   enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
   enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

public static void main(String[] args) {
   Day tgif; // Declare a variable of type Day.
   Month libra; // Declare a variable of type Month.
   tgif = Day.FRIDAY; // Assign a value of type Day to tgif
   libra = Month.OCT; // Assign a value of type Month to libra

   System.out.print("My sign is libra, since I was born in ");
   System.out.println(libra); // Output value will be: OCT
   System.out.print("That’s the ");
   System.out.print( libra.ordinal() );
   System.out.println("-th month of the year.");
   System.out.println(" (Counting from 0, of course!)");
   System.out.print("Isn’t it nice to get to ");
   System.out.println(tgif); // Output value will be: FRIDAY
   System.out.println( tgif + " is the " + tgif.ordinal() + "-th day of the week.");
   }
}
