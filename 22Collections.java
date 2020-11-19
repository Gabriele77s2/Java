/*
Collections:
 Framework (architettura) per memorizzare e manipolare un gruppo di oggetti.
 Operazioni: ricerca, ordinamento, inserimento, eliminazione, manipolazione.
 Interfacce: Set, List, Queue, Deque.
 Classi: ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet.

 Interfaccia Iterabile:
  Principale per tutte le classi Collection.
  Interfaccia Collection estende e la Iterabile.
  Quindi tutte le sottoclassi di Collection implementano anche l'Iterabile.
  Solo un metodo astratto: Iterator<T> iterator().
  Restituisce l'iteratore sugli elementi di tipo T.

 Interfaccia Collection:
  Implementata da tutte le classi.
  Dichiara i metodi che ogni Collection avrà.
  Costituisce la base da cui dipende il Framework.
  Es. metodi: Boolean add(Object obj), void clear(), implementati da tutte le sottoclassi.

 Interfaccia List:
  Struttura dati di tipo List.
  Memorizzare Collection ordinata di oggetti.
  Può avere valori duplicati.
  Implementata dalle classi ArrayList, LinkedList, Vector, Stack.
  Per istanziare:
   List<data-type> list1 = new ArrayList();
   List<data-type> list2 = new LinkedList();
   List<data-type> list3 = new Vector();
   List<data-type> list4 = new Stack();

 ArrayList:
  Implementa l'interfaccia List.
  Usa un array dinamico per memorizzare l'elemento duplicato di diversi tipi di dati.
  Mantiene l'ordine di inserimento.
  Non è sincronizzata.
  Si può accedere in modo casuale agli elementi archiviati.

 LinkedList:
  Implementa l'interfaccia Collection.
  Usa una lista doppiamente collegata internamente per memorizzare gli elementi.
  Può avere elementi duplicati.
  Mantiene l'ordine di inserimento e non è sincronizzata.

 Vector:
  Simile ad ArrayList.
  Usa un array dinamico per memorizzare gli elementi di dati.
  Sincronizzato e contiene metodi che non fanno parte del Framework Collection.

 Stack:
  Sottoclasse di Vector.
  Implementa LIFO.
  Ha i metodi di Vector ma anche i suoi, come: boolean push(), boolean peek().

 Interfaccia Queue:
  Ordine FIFO.
  Lista ordinata per contenere gli elementi che devono essere eleaborati.
  Implementata dalle classi: PriorityQueue, Deque, ArrayDeque.
  Per istanziare:
   Queue<String> q1 = new PriorityQueue();
   Queue<String> q2 = new ArrayDeque();

 PriorityQueue:
  Implementa l'interfaccia Queue.
  Ha gli elementi o oggetti che devono essere eleaborati in base alle loro priorità.
  Non consente l'archiviazione di valori null in Queue.

 Interfaccia Deque:
  Estende l'interfaccia Queue.
  Possiamo rimuovere e aggiungere elementi da entrambi i lati (testa e coda).
  Per istanziare:
   Deque d = new ArrayDeque();

 ArrayDeque:
  Implementa l'interfaccia Deque.
  Può rimuovere e aggiungere elementi da entrambi i lati (testa e coda).
  Più veloce di ArrayList e Stack.
  Non ha limitazioni di capacità.

 Interfaccia Set:
  Estende l'interfaccia Collection.
  Insieme di elementi non ordinati.
  Non consente di memorizzare elementi duplicati.
  Può memorizzare al massimo un valore null.
  Implementata da: HashSet, LinkedHashSet, TreeSet.
  Per istanziare:
   Set<data-type> s1 = new HashSet<data-type>();
   Set<data-type> s2 = new LinkedHashSet<data-type>();
   Set<data-type> s3 = new TreeSet<data-type>();

 HashSet:
  Implementa l'interfaccia Set.
  Usa una tabella Hash per l'archiviazione (Hashing).
  Contiene oggetti unici.

 LinkedHashSet:
  Estende HashSet.
  Implementa l'interfaccia Set.
  Contiene elementi unici.
  Mantiene l'ordine di inserimento e consente elementi nulli.

 Interfaccia SortedSet:
  Alternativa all'interfaccia Set.
  Ordinamento totale sugli elementi disposti in ordine crescente.
  Metodi aggiuntivi che inibiscono l'ordinamento naturale degli elementi.
  Per istanziare:
   SortedSet<data-type> set = new TreeSet();

 TreeSet:
  Implementa l'interfaccia Set.
  Usa un albero per l'archiviazione.
  Contine elementi unici.
  Memorizza gli elementi in ordine crescente.

*/

// Interfaccia List
// ArrayList
import java.util.*;
class TestJavaCollection1 {
   public static void main(String args[]){
      ArrayList<String> list = new ArrayList<String>(); // Creazione di un elenco di array
      list.add("Ravi"); // Aggiunta di un oggetto nella lista di array
      list.add("Vijay");
      list.add("Ravi");
      list.add("Ajay");
      // Elenco di attraversamento tramite Iterator
      Iterator itr = list.iterator();
      while (itr.hasNext()){
         System.out.println(itr.next());
      }
   }
} /* Ravi
     Vijay
     Ravi
     Ajay */

// LinkedList
import java.util.*;
public class TestJavaCollection2{
   public static void main(String args[]){
      LinkedList<String> al = new LinkedList<String>();
      al.add("Ravi");
      al.add("Vijay");
      al.add("Ravi");
      al.add("Ajay");
      Iterator<String> itr = al.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
} /* Ravi
     Vijay
     Ravi
     Ajay */

// Vector
import java.util.*;
public class TestJavaCollection3{
   public static void main(String args[]){
      Vector<String> v = new Vector<String>();
      v.add("Ayush");
      v.add("Amit");
      v.add("Ashish");
      v.add("Garima");
      Iterator<String> itr = v.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
} /* Ayush
     Amit
     Ashish
     Garima */

// Stack
import java.util.*;
public class TestJavaCollection4{
   public static void main(String args[]){
      Stack<String> stack = new Stack<String>();
      stack.push("Ayush");
      stack.push("Garvit");
      stack.push("Amit");
      stack.push("Ashish");
      stack.push("Garima");
      stack.pop();
      Iterator<String> itr = stack.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
} /* Ayush
     Garvit
     Amit
     Ashish */


// Interfaccia Queue
// PriorityQueue
import java.util.*;
public class TestJavaCollection5{
   public static void main(String args[]){
      PriorityQueue<String> queue = new PriorityQueue<String>();
      queue.add("Amit Sharma");
      queue.add("Vijay Raj");
      queue.add("JaiShankar");
      queue.add("Raj");
      System.out.println("head:" + queue.element());
      System.out.println("head:" + queue.peek());
      System.out.println("iterating the queue elements:");
      Iterator itr = queue.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
      queue.remove();
      queue.poll();
      System.out.println("after removing two elements:");
      Iterator<String> itr2 = queue.iterator();
      while(itr2.hasNext()){
         System.out.println(itr2.next());
      }
   }
} /* head:Amit Sharma
     head:Amit Sharma
     iterating the queue elements:
     Amit Sharma
     Raj
     JaiShankar
     Vijay Raj
     after removing two elements:
     Raj
     Vijay Raj */


// Interfaccia Deque
// ArrayDeque
import java.util.*;
public class TestJavaCollection6{
   public static void main(String[] args) {
      //Creating Deque and adding elements
      Deque<String> deque = new ArrayDeque<String>();
      deque.add("Gautam");
      deque.add("Karan");
      deque.add("Ajay");
      //Traversing elements
      for (String str : deque) {
         System.out.println(str);
      }
   }
} /* Gautam
     Karan
     Ajay */


// Interfacce Set
// HashSet
import java.util.*;
public class TestJavaCollection7{
   public static void main(String args[]){
      //Creating HashSet and adding elements
      HashSet<String> set=new HashSet<String>();
      set.add("Ravi");
      set.add("Vijay");
      set.add("Ravi");
      set.add("Ajay");
      //Traversing elements
      Iterator<String> itr=set.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
} /* Vijay
     Ravi
     Ajay */

// LinkedHashSet
import java.util.*;
public class TestJavaCollection8{
   public static void main(String args[]){
      LinkedHashSet<String> set=new LinkedHashSet<String>();
      set.add("Ravi");
      set.add("Vijay");
      set.add("Ravi");
      set.add("Ajay");
      Iterator<String> itr=set.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
} /* Ravi
     Vijay
     Ajay */


// Interfaccia SortedSet
// TreeSet
import java.util.*;
public class TestJavaCollection9{
   public static void main(String args[]){
      //Creating and adding elements
      TreeSet<String> set = new TreeSet<String>();
      set.add("Ravi");
      set.add("Vijay");
      set.add("Ravi");
      set.add("Ajay");
      //traversing elements
      Iterator<String> itr = set.iterator();
      while(itr.hasNext()){
         System.out.println(itr.next());
      }
   }
} /* Ajay
     Ravi
     Vijay */
