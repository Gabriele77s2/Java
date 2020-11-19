// If
public class IfExample {
public static void main(String[] args) {
    // defining an 'age' variable
    int age = 20;
    // checking the age
    if(age > 18) {
        System.out.print("Age is greater than 18");
    }
}
} // Age is greater than 18


// If-else
public class IfElseExample {
public static void main(String[] args) {
    // defining a variable
    int number = 13;
    // Check if the number is divisible by 2 or not
    if(number % 2 == 0) {
        System.out.println("even number");
    }
    else {
        System.out.println("odd number");
    }
}
} // odd number


public class LeapYearExample {
public static void main(String[] args) {
    int year = 2020;
    if(((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
        System.out.println("LEAP YEAR");
    }
    else {
        System.out.println("COMMON YEAR");
    }
} // LEAP YEAR


// Using Ternary Operator
public class IfElseTernaryExample {
public static void main(String[] args) {
    int number = 13;
    //Using ternary operator
    String output=(number % 2 == 0)?"even number" : "odd number";
    System.out.println(output);
}
} // odd number


// If-else-if
public class IfElseIfExample {
public static void main(String[] args) {
    int marks = 65;
    if(marks < 50) {
        System.out.println("fail");
    }
    else if(marks >= 50 && marks < 60) {
        System.out.println("D grade");
    }
    else if(marks >= 60 && marks < 70) {
        System.out.println("C grade");
    }
    else if(marks >= 70 && marks < 80) {
        System.out.println("B grade");
    }
    else if(marks >= 80 && marks < 90) {
        System.out.println("A grade");
    }
    else if(marks >= 90 && marks < 100) {
        System.out.println("A+ grade");
    }
    else {
        System.out.println("Invalid!");
    }
}
} // C grade


// Nested if
public class JavaNestedIfExample2 {
public static void main(String[] args) {
    int age = 25;
    int weight = 48;
    if(age >= 18) {
        if(weight > 50) {
            System.out.println("You are eligible to donate blood");
        }
        else {
            System.out.println("You are not eligible to donate blood");
        }
    } else {
      System.out.println("Age must be greater than 18");
    }
}
} // You are not eligible to donate blood


// Switch
public class SwitchMonthExample {
public static void main(String[] args) {
    int month = 2;
    String monthString = "";
    switch(month) {
      case 1: monthString = "1 - January";
         break;
      case 2: monthString = "2 - February";
         break;
      case 3: monthString = "3 - March";
         break;
      case 4: monthString = "4 - April";
         break;
      case 5: monthString = "5 - May";
         break;
      case 6: monthString = "6 - June";
         break;
      case 7: monthString = "7 - July";
         break;
      case 8: monthString = "8 - August";
         break;
      case 9: monthString = "9 - September";
         break;
      case 10: monthString = "10 - October";
         break;
      case 11: monthString = "11 - November";
         break;
      case 12: monthString = "12 - December";
         break;
      default: System.out.println("Invalid Month!");
    }
    //Printing month of the given number
    System.out.println(monthString);
}
} // 2 - February


// Switch without break
public class SwitchExample2 {
public static void main(String[] args) {
    int number = 20;
    switch(number) {
        case 10: System.out.println("10");
        case 20: System.out.println("20");
        case 30: System.out.println("30");
        default: System.out.println("Not in 10, 20 or 30");
    }
}
} // 20
  // 30
  // Not in 10, 20 or 30


// Nested Switch
public class NestedSwitchExample {
public static void main(String args[]){
   //C - CSE, E - ECE, M - Mechanical
   char branch = 'C';
   int collegeYear = 4;
   switch(collegeYear) {
      case 1: System.out.println("English, Maths, Science");
         break;
      case 2:
         switch(branch) {
            case 'C': System.out.println("Operating System, Java, Data Structure");
               break;
            case 'E': System.out.println("Micro processors, Logic switching theory");
               break;
            case 'M': System.out.println("Drawing, Manufacturing Machines");
               break;
         }
         break;
      case 3:
         switch(branch) {
            case 'C': System.out.println("Computer Organization, MultiMedia");
               break;
            case 'E': System.out.println("Fundamentals of Logic Design, Microelectronics");
               break;
            case 'M': System.out.println("Internal Combustion Engines, Mechanical Vibration");
               break;
         }
         break;
      case 4:
         switch(branch) {
            case 'C': System.out.println("Data Communication and Networks, MultiMedia");
               break;
            case 'E': System.out.println("Embedded System, Image Processing");
               break;
            case 'M': System.out.println("Production Technology, Thermal Engineering");
               break;
         }
         break;
   }
}
} // Data Communication and Networks, MultiMedia


// Enum in Switch
public class JavaSwitchEnumExample {
   public enum Day {Sun, Mon, Tue, Wed, Thu, Fri, Sat}
   public static void main(String args[]){
      Day[] DayNow = Day.values();
      for (Day Now : DayNow){
         switch (Now) {
            case Sun: System.out.println("Sunday");
               break;
            case Mon: System.out.println("Monday");
               break;
            case Tue: System.out.println("Tuesday");
               break;
            case Wed: System.out.println("Wednesday");
               break;
            case Thu: System.out.println("Thursday");
               break;
            case Fri: System.out.println("Friday");
               break;
            case Sat: System.out.println("Saturday");
               break;
         }
      }
}
} // Sunday
  // Monday
  // Twesday
  // Wednesday
  // Thursday
  // Friday
  // Saturday


  // For
  public class ForExample {
  public static void main(String[] args) {
      for(int i = 1; i <= 3; i++) {
          System.out.println(i);
      }
  }
  } // 1
    // 2
    // 3


  // Nested for
  public class NestedForExample {
  public static void main(String[] args) {
     for(int i = 1; i <= 2; i++) {
        for(int j = 1; j <= 2; j++) {
          System.out.println(i + " " + j);
       }
    }
  }
  } // 1   1
    // 1   2
    // 2   1
    // 2   2


  // For-each
  public class ForEachExample {
  public static void main(String[] args) {
      int arr[] = {12, 23, 44};
      for(int i : arr) {
          System.out.println(i);
      }
  }
  } // 12
    // 23
    // 44


  // Labeled for
  public class LabeledForExample {
  public static void main(String[] args) {
      aa:
        for(int i = 1; i <= 3; i++){
           bb:
              for(int j = 1; j <= 3; j++) {
                 if(i == 2 && j == 2) {
                    break aa;
                 }
                  System.out.println(i + " " + j);
              }
        }
  }
  } // 1   1
    // 1   2
    // 1   3
    // 2   1


  // While
  public class WhileExample {
  public static void main(String[] args) {
      int i = 1;
      while(i <= 3) {
          System.out.println(i);
          i++;
      }
  }
  } // 1
    // 2
    // 3


  // Do-while
  public class DoWhileExample {
  public static void main(String[] args) {
      int i = 1;
      do {
          System.out.println(i);
          i++;
       } while(i<=3);
  }
  } // 1
    // 2
    // 3
