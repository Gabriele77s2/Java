public class Arrays {
   public static void main(String[] args) {

      int[] numbers1 = new int[3]; // Array for 3 int values, default value is 0
      int[] numbers2 = { 1, 2, 3 }; // Array literal of 3 int values
      int[] numbers3 = new int[] { 1, 2, 3 }; // Array of 3 int values initialized
      int[][] numbers4 = { { 1, 2 }, { 3, 4, 5 } }; // Jagged array literal
      int[][] numbers5 = new int[5][]; // Jagged array, one dimension 5 long
      int[][] numbers6 = new int[5][4]; // Multidimensional array: 5x4

      float[] boats = new float[5]; // Array of five 32-bit floating point numbers.
      double[] header = new double[] { 4.56, 332.267, 7.0, 0.3367, 10.0 }; // Array of five 64-bit floating point numbers.

      // Array of three strings (reference type).
      String[] theory = new String[] { "a", "b", "c" };
      // Array of three Objects (reference type).
      Object[] dArt = new Object[] { new Object(), "We love Stack Overflow.", new Integer(3) };

      // Auto-boxing happening for int 127 here
      Integer[] initial = { 127, Integer.valueOf( 42 ) };
      List<Integer> toList = Arrays.asList( initial ); // Fixed size!
      // Note: Works with all collections
      Integer[] fromCollection = toList.toArray( new Integer[toList.size()] );
      //Java doesn't allow you to create an array of a parameterized type
      List<String>[] list = new ArrayList<String>[2]; // Compilation error!

      // Streams - JDK 8+
      Stream<Integer> toStream = Arrays.stream( initial );
      Integer[] fromStream = toStream.toArray( Integer[]::new );

      int[] array1 = new int[] { 1, 2, 3 }; // Create an array with new operator and array initializer.
      int[] array2 = { 1, 2, 3 }; // Shortcut syntax with array initializer.
      int[] array3 = new int[3]; // Equivalent to { 0, 0, 0 }
      int[] array4 = null; // The array itself is an object, so it can be set as null.

      int array5[]; /* equivalent to */ int[] array5;
      int a, b[], c[][]; /* equivalent to */ int a; int[] b; int[][] c;
      int[] a, b[]; /* equivalent to */ int[] a; int[][] b;
      int a, []b, c[][]; /* Compilation Error, because [] is not part of the type at beginning of the declaration, rather it is before 'b'. */
      // The same rules apply when declaring a method that returns an array:
      int foo()[] { ... } /* equivalent to */ int[] foo() { ... }

      String[] array6 = new String[] { "Laurel", "Hardy" }; // Create an array with new operator and array initializer.
      String[] array7 = { "Laurel", "Hardy" }; // Shortcut syntax with array initializer.
      String[] array8 = new String[3]; // { null, null, null }
      String[] array9 = null; // null

      Arrays.fill(array8, "abc"); // { "abc", "abc", "abc" }
      Arrays.fill(array8, 1, 2, "aaa"); // Placing "aaa" from index 1 to 2.

      int[] array = new int[5];
      Arrays.setAll(array, i -> i); // The array becomes { 0, 1, 2, 3, 4 }.

      int[] array9; // Array declaration - uninitialized
      array9 = new int[3]; // Initialize array - { 0, 0, 0 }
      array9[0] = 10; // Set index 0 value - { 10, 0, 0 }
      array9[1] = 20; // Set index 1 value - { 10, 20, 0 }
      array9[2] = 30; // Set index 2 value - { 10, 20, 30 }

      // Creating a List from an Array

      // Using Arrays.asList()
      String[] stringArray = {"foo", "bar", "baz"};
      List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

      // Using ArrayList.addAll()
      String[] stringArray = {"foo", "bar", "baz"};
      ArrayList<String> list = new ArrayList<>();
      list.addAll(Arrays.asList(stringArray));

      // Using Collections.addAll()
      String[] stringArray = {"foo", "bar", "baz"};
      ArrayList<String> list = new ArrayList<>();
      Collections.addAll(list, stringArray);

      // Using Streams
      int[] ints = {1, 2, 3};
      List<Integer> list = Arrays.stream(ints).boxed().collect(Collectors.toList());
      String[] stringArray = {"foo", "bar", "baz"};
      List<Object> list = Arrays.stream(stringArray).collect(Collectors.toList());

      int[] arr = {1, 2, 3}; // primitive array of int
      System.out.println(Arrays.asList(arr).contains(1)); // false
      Integer[] arr = {1, 2, 3}; // object array of Integer (wrapper for int)
      System.out.println(Arrays.asList(arr).contains(1)); // true

      // Creating an Array from a Collection
      Set<String> set = new HashSet<String>();
      set.add("red");
      set.add("blue");
      // although set is a Set<String>, toArray() returns an Object[] not a String[]
      Object[] objectArray = set.toArray();

      Set<String> set = new HashSet<String>();
      set.add("red");
      set.add("blue");
      // The array does not need to be created up front with the correct size.
      // Only the array type matters. (If the size is wrong, a new array will
      // be created with the same type.)
      String[] stringArray = set.toArray(new String[0]);
      // If you supply an array of the same size as collection or bigger, it
      // will be populated with collection values and returned (new array
      // won't be allocated)
      String[] stringArray2 = set.toArray(new String[set.size()]);

      // Multidimensional and Jagged Arrays
      int[][][] arr = new int[3][3][3];
      int[][] arr1 = arr[0]; // get first 3x3-dimensional array from arr
      int[] arr2 = arr1[0]; // get first 3-dimensional array from arr1
      int[] arr3 = arr[0]; // error: cannot convert from int[][] to int[]

      // ArrayIndexOutOfBoundsException
      String[] people = new String[] { "Carol", "Andy" };
      // An array will be created:
      // people[0]: "Carol"
      // people[1]: "Andy"
      // Notice: no item on index 2. Trying to access it triggers the exception:
      System.out.println(people[2]); // throws an ArrayIndexOutOfBoundsException.
      /* Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
      at your.package.path.method(YourClass.java:15) */
      // To avoid this, simply check that the index is within the limits of the array
      int index = 2;
      if (index >= 0 && index < people.length) {
         System.out.println(people[index]);
      }

      // Array Covariance
      Integer[] integerArray = {1, 2, 3};
      Number[] numberArray = integerArray; // valid
      Number firstElement = numberArray[0]; // valid
      numberArray[0] = 4L; // throws ArrayStoreException at runtime

      List<Integer> integerList = Arrays.asList(1, 2, 3);
      //List<Number> numberList = integerList; // compile error
      List<? extends Number> numberList = integerList;
      Number firstElement = numberList.get(0);
      //numberList.set(0, 4L); // compile error

      interface I {}
      class A implements I {}
      class B implements I {}
      class C implements I {}
      I[] array10 = new I[] { new A(), new B(), new C() }; // Create an array with new
      // operator and array initializer.
      I[] array11 = { new A(), new B(), new C() }; // Shortcut syntax with array
      // initializer.
      I[] array12 = new I[3]; // { null, null, null }
      I[] array13 = new A[] { new A(), new A() }; // Works because A implements I.
      Object[] array14 = new Object[] { "Hello, World!", 3.14159, 42 }; // Create an array with
      // new operator and array initializer.
      Object[] array15 = { new A(), 64, "My String" }; // Shortcut syntax with array initializer.

      // Converting an array of objects to Stream
      String[] arr = new String[] {"str1", "str2", "str3"};
      Stream<String> stream = Arrays.stream(arr);

      // Converting an array of primitives to Stream using Arrays.stream()
      int[] intArr = {1, 2, 3};
      IntStream intStream = Arrays.stream(intArr);

      int[] values = {1, 2, 3, 4};
      IntStream intStream = Arrays.stream(values, 2, 4);

      // Converting an array of primitives to Stream using Stream.of()
      Stream<Integer> intStream = Stream.of(1, 2, 3);
      Stream<String> stringStream = Stream.of("1", "2", "3");
      Stream<Double> doubleStream = Stream.of(new Double[]{1.0, 2.0});

      // Using temporary Arrays to reduce code repetition
      // we want to print out all of these
      String name = "Margaret";
      int eyeCount = 16;
      double height = 50.2;
      int legs = 9;
      int arms = 5;
      // copy-paste approach:
      System.out.println(name);
      System.out.println(eyeCount);
      System.out.println(height);
      System.out.println(legs);
      System.out.println(arms);
      // temporary array approach:
      for(Object attribute : new Object[]{name, eyeCount, height, legs, arms})
         System.out.println(attribute);
      // using only numbers
      for(double number : new double[]{eyeCount, legs, arms, height})
         System.out.println(Math.sqrt(number));

      // Arrays to a String
      int[] arr = {1, 2, 3, 4, 5};
      System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5]

      int[][] arr = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
      };
      System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [4, 5, 6], [7, 8, 9]]

      // Sorting arrays
      // creating an array with integers
      int[] array = {7, 4, 2, 1, 19};
      // this is the sorting part just one function ready to be used
      Arrays.sort(array);
      // prints [1, 2, 4, 7, 19]
      System.out.println(Arrays.toString(array));

      // Increasing Order
      String[] names = {"John", "Steve", "Shane", "Adam", "Ben"};
      System.out.println("String array before sorting : " + Arrays.toString(names));
      Arrays.sort(names);
      System.out.println("String array after sorting in ascending order : " + Arrays.toString(names));
      // String array before sorting : [John, Steve, Shane, Adam, Ben]
      // String array after sorting in ascending order : [Adam, Ben, John, Shane, Steve]

      // Decreasing Order
      Arrays.sort(names, 0, names.length, Collections.reverseOrder());
      System.out.println("String array after sorting in descending order : " + Arrays.toString(names));
      // String array after sorting in descending order : [Steve, Shane, John, Ben, Adam]

      // Sorting an Object array
      // How to Sort Object Array in Java using Comparator and Comparable
      Course[] courses = new Course[4];
      courses[0] = new Course(101, "Java", 200);
      courses[1] = new Course(201, "Ruby", 300);
      courses[2] = new Course(301, "Python", 400);
      courses[3] = new Course(401, "Scala", 500);
      System.out.println("Object array before sorting : " + Arrays.toString(courses));
      Arrays.sort(courses);
      System.out.println("Object array after sorting in natural order : " + Arrays.toString(courses));
      Arrays.sort(courses, new Course.PriceComparator());
      System.out.println("Object array after sorting by price : " + Arrays.toString(courses));
      Arrays.sort(courses, new Course.NameComparator());
      System.out.println("Object array after sorting by name : " + Arrays.toString(courses));
      /* Object array before sorting : [#101 Java@200 , #201 Ruby@300 , #301 Python@400 , #401 Scala@500 ]
      Object array after sorting in natural order : [#101 Java@200 , #201 Ruby@300 , #301 Python@400 ,
      #401 Scala@500 ]
      Object array after sorting by price : [#101 Java@200 , #201 Ruby@300 , #301 Python@400 , #401
      Scala@500 ]
      Object array after sorting by name : [#101 Java@200 , #301 Python@400 , #201 Ruby@300 , #401
      Scala@500 ] */

      // Getting the Length of an Array
      int[] arr1 = new int[0];
      int[] arr2 = new int[2];
      int[] arr3 = new int[]{1, 2, 3, 4};
      int[] arr4 = {1, 2, 3, 4, 5, 6, 7};
      int len1 = arr1.length; // 0
      int len2 = arr2.length; // 2
      int len3 = arr3.length; // 4
      int len4 = arr4.length; // 7

      // Finding an element in an array
      String[] strings = new String[] { "A", "B", "C" };
      int[] ints = new int[] { 1, 2, 3, 4 };

      // Using Arrays.binarySearch (for sorted arrays only)
      int index = Arrays.binarySearch(strings, "A");
      int index2 = Arrays.binarySearch(ints, 1);

      // Using a Arrays.asList (for non-primitive arrays only)
      int index = Arrays.asList(strings).indexOf("A");
      int index2 = Arrays.asList(ints).indexOf(1); // compilation error

      // Using a Stream
      int index = IntStream.range(0, strings.length)
      .filter(i -> "A".equals(strings[i]))
      .findFirst()
      .orElse(-1); // If not present, gives us -1.

      // Linear search using a loop
      int index = -1;
      for (int i = 0; i < array.length; i++) {
         if ("A".equals(array[i])) {
            index = i;
            break;
         }
      }

      // Change the size of an array
      String[] listOfCities = new String[3]; // array created with size 3.
      listOfCities[0] = "New York";
      listOfCities[1] = "London";
      listOfCities[2] = "Berlin";

      String[] newArray = new String[listOfCities.length + 1];
      System.arraycopy(listOfCities, 0, newArray, 0, listOfCities.length);
      newArray[listOfCities.length] = "Sydney";

      String[] newArray = Arrays.copyOf(listOfCities, listOfCities.length + 1);
      newArray[listOfCities.length] = "Sydney";

      // Remove an element from an array
      // Using ArrayList
      String[] array = new String[]{"foo", "bar", "baz"};
      List<String> list = new ArrayList<>(Arrays.asList(array));
      list.remove("foo");
      // Creates a new array with the same size as the list and copies the list elements to it.
      array = list.toArray(new String[list.size()]);
      System.out.println(Arrays.toString(array)); //[bar, baz]

      // Using System.arraycopy
      int[] array = new int[] { 1, 2, 3, 4 }; // Original array.
      int[] result = new int[array.length - 1]; // Array which will contain the result.
      int index = 1; // Remove the value "2".
      // Copy the elements at the left of the index.
      System.arraycopy(array, 0, result, 0, index);
      // Copy the elements at the right of the index.
      System.arraycopy(array, index + 1, result, index, array.length - index - 1);
      System.out.println(Arrays.toString(result)); //[1, 3, 4]

      // Using Apache Commons Lang
      int[] array = new int[]{1,2,3,4};
      array = ArrayUtils.removeElement(array, 2); //remove first occurrence of 2
      System.out.println(Arrays.toString(array)); //[1, 3, 4]

      // Comparing arrays for equality
      int[] a = new int[]{1, 2, 3};
      int[] b = new int[]{1, 2, 3};
      System.out.println(a.equals(b)); //prints "false" because a and b refer to different objects
      System.out.println(Arrays.equals(a, b)); //prints "true" because the elements of a and b have the same values

      int a[] = { 1, 2, 3 };
      int b[] = { 1, 2, 3 };
      Object[] aObject = { a }; // aObject contains one element
      Object[] bObject = { b }; // bObject contains one element
      System.out.println(Arrays.equals(aObject, bObject)); // false
      System.out.println(Arrays.deepEquals(aObject, bObject));// true

      // Copying arrays
      // for loop
      int[] a = { 4, 1, 3, 2 };
      int[] b = new int[a.length];
      for (int i = 0; i < a.length; i++) {
         b[i] = a[i];
      }

      // Object.clone()
      int[] a = { 4, 1, 3, 2 };
      int[] b = a.clone(); // [4, 1, 3, 2]

      // Arrays.copyOf()
      int[] a = {4, 1, 3, 2};
      int[] b = Arrays.copyOf(a, a.length); // [4, 1, 3, 2]

      // System.arraycopy()
      int[] a = { 4, 1, 3, 2 };
      int[] b = new int[a.length];
      System.arraycopy(a, 0, b, 0, a.length); // [4, 1, 3, 2]

      // Array.copyOfRange()
      int[] a = { 4, 1, 3, 2 };
      int[] b = Arrays.copyOfRange(a, 0, a.length); // [4, 1, 3, 2]

  }
}
