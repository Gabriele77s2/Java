public class Lists {
   public static void main(String[] args) {

   // Sorting a generic list
   List<User> users = Lists.newArrayList(
      new User(33L, "A"),
      new User(25L, "B"),
      new User(28L, "C"));
   Collections.sort(users);
   System.out.print(users); // [B:25, C:28, A:33]

   Collections.sort(users, new Comparator<User>() {
      @Override
      /* Order two 'User' objects based on their names. */
      public int compare(User left, User right) {
         return left.username.compareTo(right.username);
      }
   });
   System.out.print(users); // [A:33, B:25, C:28]

   // Convert a list of integers to a list of strings
   List<Integer> nums = Arrays.asList(1, 2, 3);
   List<String> strings = nums.stream()
      .map(Object::toString)
      .collect(Collectors.toList());

   // Finding common elements between 2 lists
   List<Integer> numbersA = new ArrayList<>();
   List<Integer> numbersB = new ArrayList<>();
   numbersA.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 7, 5, 2 }));
   numbersB.addAll(Arrays.asList(new Integer[] { 13, 32, 533, 3, 4, 2 }));

   System.out.println("A: " + numbersA);
   System.out.println("B: " + numbersB);
   List<Integer> numbersC = new ArrayList<>();
   numbersC.addAll(numbersA);
   numbersC.retainAll(numbersB);

   System.out.println("List A : " + numbersA);
   System.out.println("List B : " + numbersB);
   System.out.println("Common elements between A and B: " + numbersC);

   // In-place replacement of a List element
   List<String> strings = new ArrayList<String>();
   strings.add("Program starting!");
   strings.add("Hello world!");
   strings.add("Goodbye world!");
   // If we know the index of the element we want to replace:
   strings.set(1, "Hi world");
   // If we don't know the index, we can search for it first:
   int pos = strings.indexOf("Goodbye world!");
   if (pos >= 0) {
      strings.set(pos, "Goodbye cruel world!");
   }

   // Making a list unmodifiable
   List<String> ls = new ArrayList<String>();
   List<String> unmodifiableList = Collections.unmodifiableList(ls);
   // If you want an unmodifiable list with one item you can use:
   List<String> unmodifiableList = Collections.singletonList("Only string in the list");

   // Moving objects around in the list
   // Reversing a list:
   Collections.reverse(ls);
   // Rotating positions of elements in a list
   List<String> ls = new ArrayList<String>();
   ls.add(" how");
   ls.add(" are");
   ls.add(" you?");
   ls.add("hello,");
   Collections.rotate(ls, 1);

   for(String line : ls) System.out.print(line);
   System.out.println(); // "hello, how are you?"

   // Shuffling elements around in a list
   Collections.shuffle(ls);
   // We can also give it a java.util.Random object that it uses to randomly place objects in spots:
   Random random = new Random(12);
   Collections.shuffle(ls, random);

   // Creating, Adding and Removing element from an ArrayList
   List<T> myArrayList = new ArrayList<>();
   myArrayList.add(element);
   myArrayList.add(index, element); //index of the element should be an int (starting from 0)
   myArrayList.remove(element);
   myArrayList.remove(index); //index of the element should be an int (starting from 0)

   // Positional Access Operations
   List<String> strings = new ArrayList<String>();
   strings.add("Hello world!");
   strings.add("Goodbye world!");
   strings.add(0, "Program starting!"); // The first element is 0.
   strings.remove("Goodbye world!");
   strings.remove(0);
   // In order to retrieve an element of the list at a specified position by using:
   strings.get(0);
   // You can replace any element at a specified position by using:
   strings.set(0, "This is a replacement");
   // Returns the position of the first occurrence of the object passed as argument:
   strings.indexOf("This is a replacement")
   strings.add("This is a replacement");
   strings.lastIndexOf("This is a replacement");
   // This time the 1 will be returned and not the 0

   // Removing elements from list B that are present in the list A
   List<Integer> numbersA = new ArrayList<>();
   List<Integer> numbersB = new ArrayList<>();
   numbersA.addAll(Arrays.asList(new Integer[] { 1, 3, 4, 7, 5, 2 }));
   numbersB.addAll(Arrays.asList(new Integer[] { 13, 32, 533, 3, 4, 2 }));
   System.out.println("A: " + numbersA);
   System.out.println("B: " + numbersB);
   numbersB.removeAll(numbersA);
   System.out.println("B cleared: " + numbersB);
   }
   /* A: [1, 3, 4, 7, 5, 2]
      B: [13, 32, 533, 3, 4, 2]
      B cleared: [13, 32, 533]
   */

  }
}
