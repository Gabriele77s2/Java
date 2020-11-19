/*
Ereditarietà:
 Meccanismo in cui un oggetto acquisisce tutte le proprietà e i comportamenti di un oggetto genitore.
 Relazione is-a, nota come genitore-figlio.
 Per l'override del metodo ottenendo il polimorfismo runtime.
 Per la riusabilità del codice.
 Classe:
  Gruppo di oggetti con proprietà comuni.
  Modello o progetto da cui vengono creati gli oggetti.
 Sottoclasse/Classe figlio:
  Classe che eredita da un'altra classe.
 Superclasse/Classe genitore:
  Classe da cui una Sottoclasse eredita le caratteristiche.
 Riusabilità:
  Creare nuove classi costruite su classi esistenti.
  Possibilità di riutilizzare metodi e campi della classe genitore.
  Aggiungere nuovi metodi e campi alla classe corrente.
 Singola:
  Una classe eredita da un'altra classe.
 Multipla:
  Una classe eredita da più classi.
  Non supportata in Java tramite la classe.
  Supportata solo tramite interfaccia.
 Gerarchica:
  Classi che ereditano dalla stessa classe.
*/

// Esempio di ereditarietà singola
class Animal{
   void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
   void bark(){System.out.println("barking...");}
}
class TestInheritance{
   public static void main(String args[]){
      Dog d=new Dog();
      d.bark();
      d.eat();
}
} // barking ...
  // eating ...

// Esempio di ereditarietà multilivello
class Animal{
   void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
   void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{
   void weep(){System.out.println("weeping...");}
}
class TestInheritance2{
   public static void main(String args[]){
      BabyDog d=new BabyDog();
      d.weep();
      d.bark();
      d.eat();
}
} // weeping ...
  // barking ...
  // eating ...

// Esempio di ereditarietà Gerarchica
class Animal{
   void eat(){System.out.println("eating...");}
}
class Dog extends Animal{
   void bark(){System.out.println("barking...");}
}
class Cat extends Animal{
   void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
   public static void main(String args[]){
      Cat c=new Cat();
      c.meow();
      c.eat();
      //c.bark();//C.T.Error
}
} // meowing ...
  // eating ...


/*
Aggregazione:
 Quando una classe ha un riferimento all'entità.
 Relazione has-a.
 Per la riusabilità del codice.
 L'ereditarietà dovrebbe essere usata solo se la relazione is-a viene mantenuta per tutta la durata degli oggetti coinvolti.
 Altrimenti, la scelta migliore è l'aggregazione.
*/

// Address.java
public class Address {
   String city,state,country;

   public Address(String city, String state, String country) {
      this.city = city;
      this.state = state;
      this.country = country;
   }
}
// Emp.java
public class Emp {
   int id;
   String name;
   Address address;

   public Emp(int id, String name,Address address) {
      this.id = id;
      this.name = name;
      this.address=address;
   }

   void display(){
      System.out.println(id+" "+name);
      System.out.println(address.city+" "+address.state+" "+address.country);
   }

   public static void main(String[] args) {
      Address address1=new Address("gzb","UP","india");
      Address address2=new Address("gno","UP","india");

      Emp e=new Emp(111,"varun",address1);
      Emp e2=new Emp(112,"arun",address2);

      e.display();
      e2.display();
}
} // 111 varun
  // gzb UP india
  // 112 arun
  // gno UP india
