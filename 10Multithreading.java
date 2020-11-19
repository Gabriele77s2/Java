/*
Multithreading:
 Processo di esecuzione simultanea di più thread.
 Un thred è un sottoprocesso, la più piccola unità di elaborazione.
 Per il multitasking.
 Non allocano un'area di memoria separata.
 Più operazioni contemporaneamente.
 Indipendente, non influisce sugli altri thread se si verifica un'eccezione in un singolo thread.

Multitasking:
 Processo di esecuzione di più attività contemporaneamente.
 Basato su processi (multiprocessing):
  Ogni processo alloca un'area di memoria (indirizzo).
  Costo della comunicazione tra il processo è elevato.
  Passaggio da un processo all'altro richiede tempo per il salvataggio e il caricamento di registri...
 Basato su thread (multithreading):
  Thread condividono lo stesso spazio degli indirizzi.
  Costo della comunicazione tra thread è basso.
  Richiesto almeno un processo per ogni thread.

Ciclo di vita di un thread:
 Controllato da JVM.
 Stati: New -> Runnable (Non Runnable) -> Running -> Terminated.
 New: Thread in nuovo stato se crei un'istanza della classe Thread ma prima dell'invocazione del metodo start().
 Runnable: Thread in stato di eseguibile dopo l'invocazione del metodo start().
           Ma lo scheduler del thread non lo ha selezionato come thread in esecuzione.
 Non Runnable: Thread in stato attivo, ma non idoneo per l'esecuzione.
 Running: Thread in stato di esecuzione se è stato selezionato dallo scheduler del thread.
 Terminated: Thread in stato terminato quando il suo metodo run() termina.

Creare un Thread:
 Due modi: Estendendo la classe Thread, Implementando l'interfaccia Runnable.
 Classe Thread: Fornisce costruttori e metodi per creare ed eseguire operazioni su un thread.
                Estende la classe Object e implementa l'interfaccia Runnable.

 Costruttori classe Thread: Thread(), Thread(String name), Thread(Runnable r), Thread(Runnable r, String name).
 Metodi classe Thread:
  public void run(): per eseguire un'azione per un thread.
  public void start(): avvia l'esecuzione del thread. JVM chiama il metodo run() sul thread.
  public void sleep(long miliseconds): il thread attualmente in esecuzione viene sospeso temporaneamente per i millisecondi specificati.
  public void join(): attende che un thread muoia.
  public void join(long miliseconds): attende che un thread muoia per i millisecondi specificati.
  public int getPriority(): restituisce la priorità del thread.
  public int setPriority(int priorità): cambia la priorità del thread.
  public String getName(): restituisce il nome del thread.

 Interfaccia Runnable: Implementata da qualsiasi classe le cui istanze devono essere eseguite da un thread.
                       Ha un solo metodo: public void run(): per eseguire un'azione per un thread.

 Avvio di un Thread: metodo start() usato appena creato un thread.
                     Inizia un nuovo thread (con un nuovo stack di chiamate).
                     Il thread passa dallo stato New allo stato Runnable.
                     Quando il thread ha la possibilità di essere eseguito, verrà eseguito il metodo run().

Thread Scheduler:


*/

// Esempio di thread Java estendendo la classe Thread
class Multi extends Thread{
   public void run(){
      System.out.println("thread è in esecuzione ...");
   }
   public static void main(String args[]){
      Multi t1 = new Multi();
      t1.start();
   }
} // thread in esecuzione ...

// Esempio di thread Java implementando l'interfaccia Runnable
class Multi3 implements Runnable{
   public void run(){
      System.out.println("thread è in esecuzione ...");
   }
  public static void main(String args[]){
     Multi3 m1 = new Multi3();
     Thread t1 = new Thread(m1);
     t1.start ();
  }
} // thread in esecuzione ...
// Se non stai estendendo la classe Thread, il tuo oggetto di classe non verrebbe trattato come un oggetto thread.
// Quindi devi creare esplicitamente un oggetto di classe Thread.
// Stiamo passando l'oggetto della tua classe che implementa Runnable in modo che la tua classe run() metodo può eseguire.
