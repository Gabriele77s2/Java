// Metodo (funzione)
//  blocco di codice che viene eseguito solo quando viene chiamato
//  deve essere dichiarato all'interno di una classe
public class MyClass {
  static void myMethod() {
    System.out.println("I just got executed!");
  }

  public static void main(String[] args) {
    myMethod();  // I just got executed!
    myMethod();  // I just got executed!
    myMethod();  // I just got executed!
  }
}


// Parametri e argomenti
//  informazioni si possono passare ai metodi come parametri
//  parametri : variabili all'interno del metodo
public class MyClass {
  static void myMethod(String fname, int age) {  // parametri multipli
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myMethod("Liam", 5);  // Liam is 5
    myMethod("Jenny", 8); // Jenny is 8
    myMethod("Anja", 31); // Anja is 31
  }
}


// Valori restituiti
//  void : metodo che non restituisce alcun valore
//  se vogliamo restuire un valore usiamo int, char, float, ... oppure return
public class MyClass {
  static int myMethod(int x) {
    return 5 + x;
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3)); // Outputs 8 (5 + 3)

    //  posso anche memorizzare il risultato in una variabile
    int z = myMethod(3);
    System.out.println(z);
  }
}

// usando if else
public class MyClass {

  // Create a checkAge() method with an integer variable called age
  static void checkAge(int age) {

    // If age is less than 18, print "access denied"
    if (age < 18) {
      System.out.println("Access denied - You are not old enough!");

    // If age is greater than 18, print "access granted"
    } else {
      System.out.println("Access granted - You are old enough!");
    }

  }

  public static void main(String[] args) {
    checkAge(20); // Call the checkAge method and pass along an age of 20
  }
} // Outputs "Access granted - You are old enough!"


// Sovraccarico
//  più metodi possono avere lo stesso nome ma con parametri diversi
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

// invece di definire due metodi che dovrebbero fare la stessa cosa...
static int plusMethodInt(int x, int y) {
  return x + y;
}

static double plusMethodDouble(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethodInt(8, 5);
  double myNum2 = plusMethodDouble(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}

//  ... è meglio sovraccaricarne uno
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
}


// Ricorsione
//  eseguire una stessa chiamata più volte
//  scomporre problemi complicati in semplici

// usiamola per aggiungere tutti i numeri fino a 10
public class MyClass {
  public static void main(String[] args) {
    int result = sum(10);
    System.out.println(result);
  } } } }
  public static int sum(int k) {
    if (k > 0) {
      return k + sum(k - 1);
    } else {
      return 0;

// Spiegazione :
//  Quando sum() viene chiamata, aggiunge un parametro k alla somma di tutti i numeri minori di k e restituisce il risultato
//  Quando k diventa 0, la funzione restituisce solo 0
//  Durante l'esecuzione, il programma segue questi passaggi :
//   10 + somma (9)
//   10 + (9 + somma (8))
//   10 + (9 + (8 + somma (7)))
//   ...
//   10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + somma (0)
//   10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
//  Poiché la funzione non chiama se stessa quando k è 0, il programma si ferma qui e restituisce il risultato

// Condizione di arresto
//  Ogni funzione ricorsiva dovrebbe avere una condizione di arresto altrimenti continuerebbe all'infinito
//  Nell'esempio precedente, la condizione di arresto è quando il parametro k diventa 0

// usiamola per aggiungere tutti i numeri compresi tra 5 e 10
public class MyClass {
  public static void main(String[] args) {
    int result = sum(5, 10);
    System.out.println(result);
  }
  public static int sum(int start, int end) {
    if (end > start) {
      return end + sum(start, end - 1);
    } else {
      return end;
    }
  }
}
