public class Sets {
   public static void main(String[] args) {

      // HashSet:
      Set<T> set = new HashSet<T>();
      // TreeSet:
      TreeSet<T> sortedSet = new TreeSet<T>();
      // LinkedHashSet:
      LinkedHashSet<T> linkedhashset = new LinkedHashSet<T>();

      // Creating a set
      Set<Integer> set = new HashSet<Integer>(); // Creates an empty Set of Integers
      Set<Integer> linkedHashSet = new LinkedHashSet<Integer>(); //Creates a empty Set of Integers, with predictable iteration order

      // Adding elements
      set.add(12); // Adds element 12 to the set
      set.add(13); // Adds element 13 to the set
                  // set = [12,13]

      // Delete all the elements of a Set
      set.clear(); // Removes all objects from the collection.
                  // set = []

      // Check whether an element is part of the Se
      set.contains(0); // Returns true if a specified object is an element within the set.
                        // False
      // Check whether a Set is empty
      set.isEmpty(); //Returns true if the set has no elements
                     // True

      // Check the Size of the Set
      set.size(); //Returns the number of elements in the collection

      // Remove an element from the Set
      set.remove(0); // Removes first occurrence of a specified object from the collection

      // Types and Usage of Sets
      // HashSet - Random Sorting
      Set<String> set = new HashSet<> ();
      set.add("Banana");
      set.add("Banana");
      set.add("Apple");
      set.add("Strawberry");
      // Set Elements: ["Strawberry", "Banana", "Apple"]

      // LinkedHashSet - Insertion Order
      Set<String> set = new LinkedHashSet<> ();
      set.add("Banana");
      set.add("Banana");
      set.add("Apple");
      set.add("Strawberry");
      // Set Elements: ["Banana", "Apple", "Strawberry"]

      // TreeSet - By compareTo() or Comparator
      Set<String> set = new TreeSet<> ();
      set.add("Banana");
      set.add("Banana");
      set.add("Apple");
      set.add("Strawberry");
      // Set Elements: ["Apple", "Banana", "Strawberry"]

      Set<String> set = new TreeSet<> ((string1, string2) -> string2.compareTo(string1));
      set.add("Banana");
      set.add("Banana");
      set.add("Apple");
      set.add("Strawberry");
      // Set Elements: ["Strawberry", "Banana", "Apple"]

      // Create a list from an existing Set
      // Using a new List
      List<String> list = new ArrayList<String>(listOfElements);

      // Using List.addAll() method
      Set<String> set = new HashSet<String>();
      set.add("foo");
      set.add("boo");
      List<String> list = new ArrayList<String>();
      list.addAll(set);

      // Using Java 8 Steam API
      List<String> list = set.stream().collect(Collectors.toList());

      // Eliminating duplicates using Set
      List<String> names = new ArrayList<>(
         Arrays.asList("John", "Marco", "Jenny", "Emily", "Jenny", "Emily", "John"));
      Set<String> noDuplicates = new HashSet<>(names);
      System.out.println("noDuplicates = " + noDuplicates);
      // noDuplicates = [Marco, Emily, John, Jenny]

      // Declaring a HashSet with values
      Set<String> h = new HashSet<String>() {{
         add("a");
         add("b");
      }};
      // One line solution:
      Set<String> h = new HashSet<String>(Arrays.asList("a", "b"));

      // Using guava:
      Sets.newHashSet("a", "b", "c")
      // Using Streams:
      Set<String> set3 = Stream.of("a", "b", "c").collect(toSet());

      // List vs Set
      // List
      System.out.println("List example .....");
      List list = new ArrayList();
      list.add("1");
      list.add("2");
      list.add("3");
      list.add("4");
      list.add("1");

      for (String temp : list){
         System.out.println(temp);
      }
      // Set
      System.out.println("Set example .....");
      Set<String> set = new HashSet<String>();
      set.add("1");
      set.add("2");
      set.add("3");
      set.add("4");
      set.add("1");
      set.add("2");
      set.add("5");

      for (String temp : set){
         System.out.println(temp);
      }
      
  }
}
