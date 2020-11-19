/*
Static:
 Per la gestione della memoria.
 Variabile:
  Riferimento alla proprietà di tutti gli oggetti (che non è univoca per ogni oggetto).
  Es.: nome azienda dei dipendenti, nome college degli studenti.
  Occupa la memoria solo una volta nella classe.
 Metodo:
  Appartiene alla classe piuttosto che all'oggetto di una classe.
  Può essere invocato senza creare un'istanza di una classe.
  Può accedere al dato di un membro statico e modificarne il valore.
  Due restrizioni:
   Non può utilizzare i dati di membri non statici o chiamare un metodo non statico.
   Non può utilizzare this e super in un contesto static.
 Blocco:
  Per inizializzare il membro dei dati statici.
  Eseguito prima del metodo principale al momento del caricamento della classe.
 Classe nidificata:
 */

 // Static variable
 class Student{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor
    Student(int r, String n){
    rollno = r;
    name = n;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
 }
 //Test class to show the values of objects
 public class TestStaticVariable1{
  public static void main(String args[]){
  Student s1 = new Student(111,"Karan");
  Student s2 = new Student(222,"Aryan");
  //we can change the college of all objects by the single line of code
  //Student.college="BBDIT";
  s1.display();
  s2.display();
  }
}  // 111 Karan ITS
   // 222 Aryan ITS


//Java Program to demonstrate the use of an instance variable
//which get memory each time when we create an object of the class.
class Counter{
   int count=0;//will get memory each time when the instance is created
   Counter(){
      count++;//incrementing value
      System.out.println(count);
   }

   public static void main(String args[]){
      //Creating objects
      Counter c1=new Counter();
      Counter c2=new Counter();
      Counter c3=new Counter();
   }
}  // 1
   // 1
   // 1


//Java Program to illustrate the use of static variable which is shared with all objects.
class Counter2{
   static int count=0;//will get memory only once and retain its value
   Counter2(){
      count++;//incrementing the value of static variable
      System.out.println(count);
   }

   public static void main(String args[]){
      //creating objects
      Counter2 c1=new Counter2();
      Counter2 c2=new Counter2();
      Counter2 c3=new Counter2();
   }
}  // 1
   // 2
   // 3


// Example of static method
class Student{
   int rollno;
   String name;
   static String college = "ITS";
   //static method to change the value of static variable
   static void change(){
      college = "BBDIT";
   }
   //constructor to initialize the variable
   Student(int r, String n){
       rollno = r;
       name = n;
   }
   //method to display values
   void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod{
   public static void main(String args[]){
       Student.change();//calling change method
       //creating objects
       Student s1 = new Student(111,"Karan");
       Student s2 = new Student(222,"Aryan");
       Student s3 = new Student(333,"Sonoo");
       //calling display method
       s1.display();
       s2.display();
       s3.display();
       }
}  // 111 Karan BBDIT
   // 222 Aryan BBDIT
   // 333 Sonoo BBDIT


// Restrictions for the static method
class A{
 int a=40;//non static

 public static void main(String args[]){
  System.out.println(a);
 }
} // Compile time error


//Example of static block
class A2{
  static{System.out.println("static block is invoked");}
  public static void main(String args[]){
   System.out.println("Hello main");
  }
}  // static block is invoked
   // Hello main
