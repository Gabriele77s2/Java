public class Queues {
   public static void main(String[] args) {

   //The type of the PriorityQueue is Integer.
   PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
   //The elements are added to the PriorityQueue
   queue.addAll( Arrays.asList( 9, 2, 3, 1, 3, 8 ) );
   //The PriorityQueue sorts the elements by using compareTo method of the Integer Class
   //The head of this queue is the least element with respect to the specified ordering
   System.out.println( queue ); //The Output: [1, 2, 3, 9, 3, 8]
   queue.remove();
   System.out.println( queue ); //The Output: [2, 3, 3, 9, 8]
   queue.remove();
   System.out.println( queue ); //The Output: [3, 8, 3, 9]
   queue.remove();
   System.out.println( queue ); //The Output: [3, 8, 9]
   queue.remove();
   System.out.println( queue ); //The Output: [8, 9]
   queue.remove();
   System.out.println( queue ); //The Output: [9]
   queue.remove();
   System.out.println( queue ); //The Output: []

   // Deque
   // Adding and Accessing Elements
   Deque<String> dequeA = new LinkedList<>();
   dequeA.add("element 1"); //add element at tail
   dequeA.addFirst("element 2"); //add element at head
   dequeA.addLast("element 3"); //add element at tail

   String firstElement0 = dequeA.element();
   String firstElement1 = dequeA.getFirst();
   String lastElement = dequeA.getLast();

   // Removing Elements
   String firstElement = dequeA.remove();
   String firstElement = dequeA.removeFirst();
   String lastElement = dequeA.removeLast();

   // Stacks
   Stack() //Creates an empty Stack
   isEmpty() //Is the Stack Empty? Return Type: Boolean
   push(Item item) //push an item onto the stack
   pop() //removes item from top of stack Return Type: Item
   size() //returns # of items in stack Return Type: Int

   Stack st = new Stack();
   System.out.println("stack: " + st);

   st.push(10);
   System.out.println("10 was pushed to the stack");
   System.out.println("stack: " + st);

   st.push(15);
   System.out.println("15 was pushed to the stack");
   System.out.println("stack: " + st);

   st.push(80);
   System.out.println("80 was pushed to the stack");
   System.out.println("stack: " + st);

   st.pop();
   System.out.println("80 was popped from the stack");
   System.out.println("stack: " + st);

   st.pop();
   System.out.println("15 was popped from the stack");
   System.out.println("stack: " + st);

   st.pop();
   System.out.println("10 was popped from the stack");
   System.out.println("stack: " + st);

   if(st.isEmpty()){
      System.out.println("empty stack");
   }
   /* stack: []
      10 was pushed to the stack
      stack: [10]
      15 was pushed to the stack
      stack: [10, 15]
      80 was pushed to the stack
      stack: [10, 15, 80]
      80 was popped from the stack
      stack: [10, 15]
      15 was popped from the stack
      stack: [10]
      10 was popped from the stack
      stack: []
      empty stack
   */

   // BlockingQueue
   BlockingQueue<String> bQueue = new ArrayBlockingQueue<>(2);
   bQueue.put("This is entry 1");
   System.out.println("Entry one done");
   bQueue.put("This is entry 2");
   System.out.println("Entry two done");
   bQueue.put("This is entry 3");
   System.out.println("Entry three done");
   // Entry one done
   // Entry two done

   // LinkedList as a FIFO Queue
   Queue<String> queue = new LinkedList<String>();
   queue.offer( "first element" );
   queue.offer( "second element" );
   queue.offer( "third element" );
   queue.offer( "fourth. element" );
   queue.offer( "fifth. element" );

   while ( !queue.isEmpty() ) {
      System.out.println( queue.poll() );
   }
   /* first element
      second element
      third element
      fourth element
      fifth element
   */

   // Queue Interface
   boolean add(E e);
   boolean offer(E e);
   E remove();
   E poll();
   E element();
   E peek();

   // Dequeue Interface
   // Adding Elements to Deque
   Deque deque = new LinkedList();
   // Adding element at tail
   deque.add("Item1");
   // Adding element at head
   deque.addFirst("Item2");
   // Adding element at tail
   deque.addLast("Item3");

   // Removing Elements from Deque
   // Retrieves and removes the head of the queue represented by this deque
   Object headItem = deque.remove();
   // Retrieves and removes the first element of this deque.
   Object firstItem = deque.removeFirst();
   // Retrieves and removes the last element of this deque.
   Object lastItem = deque.removeLast();

   // Retrieving Element without Removing
   // Retrieves, but does not remove, the head of the queue represented by this deque
   Object headItem = deque.element();
   // Retrieves, but does not remove, the first element of this deque.
   Object firstItem = deque.getFirst();
   // Retrieves, but does not remove, the last element of this deque.
   Object lastItem = deque.getLast();

   // Iterating through Deque
   // Using Iterator
   Iterator iterator = deque.iterator();
   while(iterator.hasNext(){
   String Item = (String) iterator.next();
   }
   // Using For Loop
   for(Object object : deque) {
   String Item = (String) object;
   }

  }
}
