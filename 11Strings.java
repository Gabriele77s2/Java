public class Strings {
   public static void main(String[] args) {

      String firstName = "John";
      String lastName = "Doe";
      String fullName = firstName + lastName;
      System.out.println(fullName); // = John Doe

      int x = 5, y = 6, z = 50;
      System.out.println(x + y + z);   // = 61

      int myNum = 15;
      myNum = 20; // now is 20

      // final
      final int myNum = 15; // used to costants or variabile that doesn't change in the time
      myNum = 20; // error

      // Casting
      int myInt = 9;
      double myDouble = myInt;
      System.out.println(myInt);    // = 9
      System.out.println(myDouble); // = 9.0

      // Explicit casting
      double myDouble = 9.78;
      int myInt = (int) myDouble;
      System.out.println(myDouble); // = 9.78
      System.out.println(myInt);    // = 9

      // Comparing
      String firstString = "Test123";
      String secondString = "Test" + 123;
      if (firstString.equals(secondString)) {
         // Both Strings have the same content.
      }

      String firstString = "Test123";
      String secondString = "TEST123";
      if (firstString.equalsIgnoreCase(secondString)) {
         // Both Strings are equal, ignoring the case of the individual characters.
      }

      String firstString = "Taki";
      String secondString = "TAKI";
      System.out.println(firstString.equalsIgnoreCase(secondString)); //prints true

      Locale locale = Locale.forLanguageTag("tr-TR");
      System.out.println(firstString.toLowerCase(locale).equals(
      secondString.toLowerCase(locale))); //prints false

      String stringToSwitch = "A";
      switch (stringToSwitch) {
         case "a":
            System.out.println("a");
            break;
         case "A":
            System.out.println("A"); //the code goes here
            break;
         case "B":
            System.out.println("B");
            break;
         default:
            break;
      }

      String strObj = new String("Hello!");
      String str = "Hello!";
      // The two string references point two strings that are equal
      if (strObj.equals(str)) {
         System.out.println("The strings are equal");
      }

      // The two string references do not point to the same object
      if (strObj != str) {
         System.out.println("The strings are not the same object");
      }

      // If we intern a string that is equal to a given literal, the result is
      // a string that has the same reference as the literal.
      String internedStr = strObj.intern();
      if (internedStr == str) {
         System.out.println("The interned string and the literal are the same object");
      }

      String upper = string.toUpperCase();
      String lower = string.toLowerCase();
      System.out.println(string); // prints "This is a Random String"
      System.out.println(lower); // prints "this is a random string"
      System.out.println(upper); // prints "THIS IS A RANDOM STRING"

      // Finding a String Within Another String

      String str1 = "Hello World";
      String str2 = "Hello";
      String str3 = "helLO";
      System.out.println(str1.contains(str2)); //prints true
      System.out.println(str1.contains(str3)); //prints false

      String s = "this is a long sentence";
      int i = s.indexOf('i'); // the first 'i' in String is at index 2
      int j = s.indexOf("long"); // the index of the first occurrence of "long" in s is 10
      int k = s.indexOf('z'); // k is -1 because 'z' was not found in String s
      int h = s.indexOf("LoNg"); // h is -1 because "LoNg" was not found in String s

      String str1 = "Hello World";
      String str2 = "wOr";
      str1.indexOf(str2); // -1
      str1.toLowerCase().contains(str2.toLowerCase()); // true
      str1.toLowerCase().indexOf(str2.toLowerCase()); // 6

      // String pool and heap storage
      String a = "alpha";
      String b = "alpha";
      String c = new String("alpha");
      //All three strings are equivalent
      System.out.println(a.equals(b) && b.equals(c)); // true
      //Although only a and b reference the same heap object
      System.out.println(a == b); // true
      System.out.println(a != c); // true
      System.out.println(b != c); // true

      // Splitting Strings
      String lineFromCsvFile = "Mickey;Bolton;12345;121216";
      String[] dataCells = lineFromCsvFile.split(";");
      // Result is dataCells = { "Mickey", "Bolton", "12345", "121216"};

      String lineFromInput = "What do you need from me?";
      String[] words = lineFromInput.split("\\s+"); // one or more space chars
      // Result is words = {"What", "do", "you", "need", "from", "me?"};

      String[] firstNames = "Mickey, Frank, Alicia, Tom".split(", ");
      // Result is firstNames = {"Mickey", "Frank", "Alicia", "Tom"};

      String str = "the lazy fox jumped over the brown fence";
      StringTokenizer tokenizer = new StringTokenizer(str);
      while (tokenizer.hasMoreTokens()) {
         System.out.println(tokenizer.nextToken());
      }
      // the
      // lazy
      // fox
      // jumped
      // over
      // the
      // brown
      // fence

      String str = "jumped over";
      // In this case character `u` and `e` will be used as delimiters
      StringTokenizer tokenizer = new StringTokenizer(str, "ue");
      while (tokenizer.hasMoreTokens()) {
         System.out.println(tokenizer.nextToken());
      }
      // j
      // mp
      // d ov
      // r

      // Joining Strings with a delimiter
      String[] elements = { "foo", "bar", "foobar" };
      String singleString = String.join(" + ", elements);
      System.out.println(singleString); // Prints "foo + bar + foobar"

      StringJoiner sj = new StringJoiner(", ", "[", "]");
      // The last two arguments are optional,
      // they define prefix and suffix for the result string
      sj.add("foo");
      sj.add("bar");
      sj.add("foobar");
      System.out.println(sj); // Prints "[foo, bar, foobar]"

      Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
      String joined = stringStream.collect(Collectors.joining(", "));
      System.out.println(joined); // Prints "foo, bar, foobar"

      Stream<String> stringStream = Stream.of("foo", "bar", "foobar");
      String joined = stringStream.collect(Collectors.joining(", ", "{", "}"));
      System.out.println(joined); // Prints "{foo, bar, foobar}"

      // String concatenation and StringBuilders
      String s1 = "a";
      String s2 = "b";
      String s3 = "c";
      String s = s1 + s2 + s3; // abc

      StringBuilder sb = new StringBuilder("a");
      String s = sb.append("b").append("c").toString(); // abc

      String s1 = "a";
      String s2 = "b";
      String s = s1 + s2 + 2; // ab2

      StringBuilder sb = new StringBuilder("a");
      String s = sb.append("b").append(2).toString(); // ab2

      String string1 = "Hello ";
      String string2 = "world";
      String string3 = string1.concat(string2); // "Hello world"

      // Substrings
      String s = "this is an example";
      String a = s.substring(11); // a will hold the string starting at character 11 until the end ("example")
      String b = s.substring(5, 10); // b will hold the string starting at character 5 and ending right before character 10 ("is an")
      String b = s.substring(5, b.length()-3); // b will hold the string starting at character 5 ending right before b' s lenght is out of 3 ("is an exam")

      // Reversing Strings
      String code = "code";
      System.out.println(code);
      StringBuilder sb = new StringBuilder(code);
      code = sb.reverse().toString();
      System.out.println(code);

      // Remove Whitespace
      String s = new String(" Hello World!! ");
      String t = s.trim(); // t = "Hello World!!"

      // Replacing parts of Strings
      String s = "popcorn";
      System.out.println(s.replace('p','W')); // WoWcorn

      String s = "metal petal et al.";
      System.out.println(s.replace("etal","etallica")); // metallica petallica et al.

      String s = "spiral metal petal et al.";
      System.out.println(s.replaceAll("(\\w*etal)","$1lica")); // spiral metallica petallica et al.

      // Getting the length of a String
      String str = "Hello, World!";
      System.out.println(str.length()); // Prints out 13

      // Getting the nth character in a String
      String str = "My String";
      System.out.println(str.charAt(0)); // "M"
      System.out.println(str.charAt(1)); // "y"
      System.out.println(str.charAt(2)); // " "
      System.out.println(str.charAt(str.length-1)); // Last character "g"

      // Counting occurrences of a substring or character in a string
      import java.util.regex.Matcher;
      import java.util.regex.Pattern;
      String text = "One fish, two fish, red fish, blue fish";
      System.out.println(countStringInString("fish", text)); // prints 4
      System.out.println(countStringInString(",", text)); // prints 3

      // StringBuffer
      String str = "study";
      str.concat("tonight");
      System.out.println(str); // Output: study
      StringBuffer strB = new StringBuffer("study");
      strB.append("tonight");
      System.out.println(strB); // Output: studytonight

      // StringBuilder
      int one = 1;
      String color = "red";
      StringBuilder sb = new StringBuilder();
      sb.append("One=").append(one).append(", Color=").append(color).append('\n');
      System.out.print(sb);
      // Prints "One=1, Colour=red" followed by an ASCII newline.

      // This does the same thing as the StringBuilder example above
      int one = 1;
      String color = "red";
      Formatter f = new Formatter();
      System.out.print(f.format("One=%d, colour=%s%n", one, color));
      // Prints "One=1, Colour=red" followed by the platform's line separator
      // The same thing using the `String.format` convenience method
      System.out.print(String.format("One=%d, color=%s%n", one, color));

      StringJoiner sj = new StringJoiner(", ", "[", "]");
      for (String s : new String[]{"A", "B", "C"}) { sj.add(s); }
      System.out.println(sj);
      // Prints "[A, B, C]"

  }
}
