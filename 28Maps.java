public class MyClass {
   public static void main(String[] args) {

   // Implementation using Iterator with Map.Entry 1.
   Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
   while (it.hasNext()) {
      Map.Entry<Integer, Integer> pair = it.next();
      sum += pair.getKey() + pair.getValue();
   }

   // Implementation using for with Map.Entry 2.
   for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
      sum += pair.getKey() + pair.getValue();
   }

   // Implementation using Map.forEach (Java 8+) 3.
   map.forEach((k, v) -> sum[0] += k + v);

   // Implementation using Map.keySet with for 4.
   for (Integer key : map.keySet()) {
      sum += key + map.get(key);
   }

   // Implementation using Map.keySet with Iterator 5.
   Iterator<Integer> it = map.keySet().iterator();
   while (it.hasNext()) {
      Integer key = it.next();
      sum += key + map.get(key);
   }

   // Implementation using for with Iterator and Map.Entry 6.
   for (Iterator<Map.Entry<Integer, Integer>> entries =
      map.entrySet().iterator(); entries.hasNext(); ) {
         Map.Entry<Integer, Integer> entry = entries.next();
         sum += entry.getKey() + entry.getValue();
   }

   // Implementation using Stream.forEach (Java 8+)
   map.entrySet().stream().forEach(e -> sum += e.getKey() + e.getValue());

   // Implementation using Stream.forEach with Stream.parallel (Java 8+) 8.
   map.entrySet()
      .stream()
      .parallel()
      .forEach(e -> sum += e.getKey() + e.getValue());

   // Implementation using IterableMap from Apache Collections 9.
   MapIterator<Integer, Integer> mit = iterableMap.mapIterator();
   while (mit.hasNext()) {
      sum += mit.next() + it.getValue();
   }

   // Implementation using MutableMap from Eclipse Collections 10.
   mutableMap.forEachKeyValue((key, value) -> {
      sum += key + value;
   });

   // Declaring HashMap
   Map<String,Integer> myMap = new HashMap<String,Integer>();

   // Putting values in HashMap.
   myMap.put("key1", 1);
   myMap.put("key2", 2);

   // Getting values from HashMap.
   myMap.get("key1"); //return 1 (class Integer)

   // Check whether the Key is in the Map or not.
   myMap.containsKey(varKey);

   // Check whether the Value is in the Map or not.
   myMap.containsValue(varValue);

   // Using Default Methods of Map
   // Using getOrDefault 1.
   Map<Integer, String> map = new HashMap<>();
   map.put(1, "First element");
   map.get(1); // => First element
   map.get(2); // => null
   map.getOrDefault(2, "Default element"); // => Default element

   // Using forEach 2.
   Map<Integer, String> map = new HashMap<Integer, String>();
   map.put(1, "one");
   map.put(2, "two");
   map.put(3, "three");
   map.forEach((key, value) -> System.out.println("Key: "+key+ " :: Value: "+value));
   // Key: 1 :: Value: one
   // Key: 2 :: Value: two
   // Key: 3 :: Value: three

   // Using replaceAll 3.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   map.replaceAll((key,value)->value+10); //{john=30, paul=40, peter=50}

   // Using putIfAbsent 4.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   map.putIfAbsent("kelly", 50); //{john=20, paul=30, peter=40, kelly=50}

   // Using remove 5.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   map.remove("peter",40); //{john=30, paul=40}

   // Using replace 6.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   map.replace("peter",50); //{john=20, paul=30, peter=50}
   map.replace("jack",60); //{john=20, paul=30, peter=50}

   // Using computeIfAbsent 7.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   map.computeIfAbsent("kelly", k->map.get("john")+10); //{john=20, paul=30, peter=40, kelly=30}
   map.computeIfAbsent("peter", k->map.get("john")+10); //{john=20, paul=30, peter=40, kelly=30}
   //peter already present
   // Using computeIfPresent 8.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   map.computeIfPresent("kelly", (k,v)->v+10); //{john=20, paul=30, peter=40} //kelly not present
   map.computeIfPresent("peter", (k,v)->v+10); //{john=20, paul=30, peter=50} // peter present, so increase the value

   // Using compute 9.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   map.compute("peter", (k,v)->v+50); //{john=20, paul=30, peter=90} //Increase the value

   // Using merge 10.
   Map<String, Integer> map = new HashMap<String, Integer>();
   map.put("john", 20);
   map.put("paul", 30);
   map.put("peter", 40);
   //Adds the key-value pair to the map, if key is not present or value for the key is null
   map.merge("kelly", 50 , (k,v)->map.get("john")+10); // {john=20, paul=30, peter=40, kelly=50}
   //Replaces the value with the newly computed value, if the key is present
   map.merge("peter", 50 , (k,v)->map.get("john")+10); //{john=20, paul=30, peter=30, kelly=50}
   //Key is removed from the map , if new value computed is null
   map.merge("peter", 30 , (k,v)->map.get("nancy")); //{john=20, paul=30, kelly=50}

   // Iterating through the contents of a Map
   Map<String, Integer> repMap = new HashMap<>();
   repMap.put("Jon Skeet", 927_654);
   repMap.put("BalusC", 708_826);
   repMap.put("Darin Dimitrov", 715_567);
   // Iterating through map keys:
   for (String key : repMap.keySet()) {
      System.out.println(key);
   }
   /* Darin Dimitrov
      Jon Skeet
      BalusC */

   //Iterating through map values:
   for (Integer value : repMap.values()) {
      System.out.println(value);
   }
   /* 715567
      927654
      708826 */

   // Iterating through keys and values together
   for (Map.Entry<String, Integer> entry : repMap.entrySet()) {
      System.out.printf("%s = %d\n", entry.getKey(), entry.getValue());
   }
   /* Darin Dimitrov = 715567
      Jon Skeet = 927654
      BalusC = 708826 */

   // Merging, combine and composing Maps
   Map<String, Integer> numbers = new HashMap<>();
   numbers.put("One", 1)
   numbers.put("Three", 3)

   Map<String, Integer> other_numbers = new HashMap<>();
   other_numbers.put("Two", 2)
   other_numbers.put("Three", 4)
   numbers.putAll(other_numbers)

   "One" -> 1
   "Two" -> 2
   "Three" -> 4 //old value 3 was overwritten by new value 4

   for (Map.Entry<String, Integer> e : other_numbers.entrySet())
      numbers.merge(e.getKey(), e.getValue(), Integer::sum);
      //or instead of the above loop
      other_numbers.forEach((k, v) -> numbers.merge(k, v, Integer::sum));

   mapA.forEach((k, v) ->
      mapB.merge(k, v, (v1, v2) ->
         {throw new AssertionError("duplicate values for key: "+k);}));

   // Composing Map<X,Y> and Map<Y,Z> to get Map<X,Z>
   // If you want to compose two mappings, you can do it as follows
   Map<String, Integer> map1 = new HashMap<String, Integer>();
   map1.put("key1", 1);
   map1.put("key2", 2);
   map1.put("key3", 3);

   Map<Integer, Double> map2 = new HashMap<Integer, Double>();
   map2.put(1, 1.0);
   map2.put(2, 2.0);
   map2.put(3, 3.0);

   Map<String, Double> map3 = new new HashMap<String, Double>();
   map1.forEach((key,value)->map3.put(key,map2.get(value)));

   "key1" -> 1.0
   "key2" -> 2.0
   "key3" -> 3.0

   // Add multiple items
   String currentVal;
   Map<Integer, String> map = new TreeMap<>();
   currentVal = map.put(1, "First element.");
   System.out.println(currentVal);// Will print null
   currentVal = map.put(2, "Second element.");
   System.out.println(currentVal); // Will print null yet again
   currentVal = map.put(2, "This will replace 'Second element'");
   System.out.println(currentVal); // will print Second element.
   System.out.println(map.size()); // Will print 2 as key having
   // value 2 was replaced.
   Map<Integer, String> map2 = new HashMap<>();
   map2.put(2, "Element 2");
   map2.put(3, "Element 3");
   map.putAll(map2);
   System.out.println(map.size()); // 3

   // To add many items you can use an inner classes like this:
   Map<Integer, String> map = new HashMap<>() {{
      // This is now an anonymous inner class with an unnamed instance constructor
      put(5, "high");
      put(4, "low");
      put(1, "too slow");
   }};

   static Map<Integer, String> map = new HashMap<>();
   static {
      // Now no inner classes are created so we can avoid memory leaks
      put(5, "high");
      put(4, "low");
      put(1, "too slow");
   }

   // Creating and Initializing Maps
   // Way 1:
   Map<String, Object> map = new HashMap<String, Object>(){{
      put("name", "A");
      put("address", "Malviya-Nagar");
      put("city", "Jaipur");
   }};
   System.out.println(map);

   // Way 2:
   Map<String, Object> map = new TreeMap<String, Object>();
      map.put("name", "A");
      map.put("address", "Malviya-Nagar");
      map.put("city", "Jaipur");
   System.out.println(map);

   // Way 3:
   final Map<String, String> map =
      Arrays.stream(new String[][] {
         { "name", "A" },
         { "address", "Malviya-Nagar" },
         { "city", "jaipur" },
      }).collect(Collectors.toMap(m -> m[0], m -> m[1]));
   System.out.println(map);

   // Way 4:
   //This way for initial a map in outside the function
   final static Map<String, String> map;
   static
   {
      map = new HashMap<String, String>();
      map.put("a", "b");
      map.put("c", "d");
   }

   // Way 5: Creating an immutable single key-value map.
   // Immutable single key-value map
   Map<String, String> singletonMap = Collections.singletonMap("key", "value");
   // Please note, that it is impossible to modify such map.
   // Any attemts to modify the map will result in throwing the UnsupportedOperationException.
   // Immutable single key-value pair
   Map<String, String> singletonMap = Collections.singletonMap("key", "value");
   singletonMap.put("newKey", "newValue"); //will throw UnsupportedOperationException
   singletonMap.putAll(new HashMap<>()); //will throw UnsupportedOperationException
   singletonMap.remove("key"); //will throw UnsupportedOperationException
   singletonMap.replace("key", "value", "newValue"); //will throw UnsupportedOperationException

   // Check if key exists
   Map<String, String> num = new HashMap<>();
   num.put("one", "first");
   if (num.containsKey("one")) {
      System.out.println(num.get("one")); // => first
   }
   // Maps can contain null values

   Map<String, String> map = new HashMap<>();
   map.put("one", null);
   if (map.containsKey("one")) {
      System.out.println("This prints !"); // This line is reached
   }
   if (map.get("one") != null) {
      System.out.println("This is never reached !"); // This line is never reached
   }

   // Add an element
   // Addition
   Map<Integer, String> map = new HashMap<>();
   map.put(1, "First element.");
   System.out.println(map.get(1)); // First element.
   // Override
   Map<Integer, String> map = new HashMap<>();
   map.put(1, "First element.");
   map.put(1, "New element.");
   System.out.println(map.get(1)); // New element.

   // Clear the map
   Map<Integer, String> map = new HashMap<>();
   map.put(1, "First element.");
   map.put(2, "Second element.");
   map.put(3, "Third element.");
   map.clear();
   System.out.println(map.size()); // => 0

   // LinkedHashMap
   LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
   lhm.put("Ramesh", "Intermediate");
   lhm.put("Shiva", "B-Tech");
   lhm.put("Santosh", "B-Com");
   lhm.put("Asha", "Msc");
   lhm.put("Raghu", "M-Tech");

   Set set = lhm.entrySet();
   Iterator i = set.iterator();
   while (i.hasNext()) {
      Map.Entry me = (Map.Entry) i.next();
      System.out.println(me.getKey() + " : " + me.getValue());
   }
   System.out.println("The Key Contains : " + lhm.containsKey("Shiva"));
   System.out.println("The value to the corresponding to key : " + lhm.get("Asha"));

   // WeakHashMap
   Map hashMap= new HashMap();
   Map weakHashMap = new WeakHashMap();
   String keyHashMap = new String("keyHashMap");
   String keyWeakHashMap = new String("keyWeakHashMap");

   hashMap.put(keyHashMap, "Ankita");
   weakHashMap.put(keyWeakHashMap, "Atul");
   System.gc();
   System.out.println("Before: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map
   value:"+weakHashMap.get("keyWeakHashMap"));

   keyHashMap = null;
   keyWeakHashMap = null;
   System.gc();
   System.out.println("After: hash map value:"+hashMap.get("keyHashMap")+" and weak hash map
   value:"+weakHashMap.get("keyWeakHashMap"));

   // SortedMap
   // Create a hash map
   TreeMap tm = new TreeMap();
   // Put elements to the map
   tm.put("Zara", new Double(3434.34));
   tm.put("Mahnaz", new Double(123.22));
   tm.put("Ayan", new Double(1378.00));
   tm.put("Daisy", new Double(99.22));
   tm.put("Qadir", new Double(-19.08));
   // Get a set of the entries
   Set set = tm.entrySet();
   // Get an iterator
   Iterator i = set.iterator();
   // Display elements
   while(i.hasNext()) {
      Map.Entry me = (Map.Entry)i.next();
      System.out.print(me.getKey() + ": ");
      System.out.println(me.getValue());
   }
   System.out.println();
   // Deposit 1000 into Zara's account
   double balance = ((Double)tm.get("Zara")).doubleValue();
   tm.put("Zara", new Double(balance + 1000));
   System.out.println("Zara's new balance: " + tm.get("Zara"));

   // TreeMap and TreeSet
   TreeMap<Integer, String> treeMap = new TreeMap<>();
   treeMap.put(10, "ten");
   treeMap.put(4, "four");
   treeMap.put(1, "one");
   treeSet.put(12, "twelve");
   System.out.println(treeMap.firstEntry()); // Prints 1=one
   System.out.println(treeMap.lastEntry()); // Prints 12=twelve
   System.out.println(treeMap.size()); // Prints 4, since there are 4 elemens in the map
   System.out.println(treeMap.get(12)); // Prints twelve
   System.out.println(treeMap.get(15)); // Prints null, since the key is not found in the map

   for (Entry<Integer, String> entry : treeMap.entrySet()) {
      System.out.print(entry + " "); //prints 1=one 4=four 10=ten 12=twelve
   }
   Iterator<Entry<Integer, String>> iter = treeMap.entrySet().iterator();
   while (iter.hasNext()) {
      System.out.print(iter.next() + " "); //prints 1=one 4=four 10=ten 12=twelve
   }

   // TreeSet of a simple Java Type
   TreeSet<Integer> treeSet = new TreeSet<>();
   treeSet.add(10);
   treeSet.add(4);
   treeSet.add(1);
   treeSet.add(12);
   System.out.println(treeSet.first()); // Prints 1
   System.out.println(treeSet.last()); // Prints 12
   System.out.println(treeSet.size()); // Prints 4, since there are 4 elemens in the set
   System.out.println(treeSet.contains(12)); // Prints true
   System.out.println(treeSet.contains(15)); // Prints false

   for (Integer i : treeSet) {
      System.out.print(i + " "); //prints 1 4 10 12
   }
   Iterator<Integer> iter = treeSet.iterator();
   while (iter.hasNext()) {
      System.out.print(iter.next() + " "); //prints 1 4 10 12
   }

   // TreeMap/TreeSet of a custom Java type
   private int id;
   private String firstName, lastName;
   private Date birthday;
   //... Constuctors, getters, setters and various methods
   TreeSet<Person2> set = ...
   set.add(new Person(1,"first","last",Date.from(Instant.now())));

  }
}
