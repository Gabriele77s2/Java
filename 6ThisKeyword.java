/*
This:
 Per riferimento alla variabile d'istanza della classe corrente.
 Per invocare il metodo della classe corrente (implicitamente)
 Per invocare il costruttore della classe corrente (this()).
 Può essere passato come argomento nella chaimata al metodo o costruttore.
 Per restituire l'istanza della classe corrente dal metodo.
*/

// senza this
class Student{
   int rollno;
   String name;
   float fee;
   Student(int rollno,String name,float fee){
      rollno=rollno;
      name=name;
      fee=fee;
   }
   void display(){System.out.println(rollno+" "+name+" "+fee);}
   }
class TestThis1{
   public static void main(String args[]){
      Student s1=new Student(111,"ankit",5000f);
      Student s2=new Student(112,"sumit",6000f);
      s1.display();
      s2.display();
}
} // 0 null 0.0
  // 0 null 0.0


// con this
class Student{
   int rollno;
   String name;
   float fee;
   Student(int rollno,String name,float fee){
      this.rollno=rollno;
      this.name=name;
      this.fee=fee;
   }
   void display(){System.out.println(rollno+" "+name+" "+fee);}
   }
class TestThis2{
   public static void main(String args[]){
      Student s1=new Student(111,"ankit",5000f);
      Student s2=new Student(112,"sumit",6000f);
      s1.display();
      s2.display();
}
} // 111 ankit 5000
  // 112 sumit 6000


// senza this ma con variabili d'istanza
class Student{
   int rollno;
   String name;
   float fee;
   Student(int r,String n,float f){
      rollno=r;
      name=n;
      fee=f;
   }
   void display(){System.out.println(rollno+" "+name+" "+fee);}
   }
class TestThis3{
   public static void main(String args[]){
      Student s1=new Student(111,"ankit",5000f);
      Student s2=new Student(112,"sumit",6000f);
      s1.display();
      s2.display();
}
} // 111 ankit 5000
  // 112 sumit 6000


// per invocare il metodo della classe corrente
// se non usi this, il compilatore lo aggiunge automaticamente mentre richiama il metodo
class A{
   void m(){
      System.out.println("hello m");
   }
   void n(){
      System.out.println("hello n");
      //m();//same as this.m()
      this.m();
   }
}
class TestThis4{
   public static void main(String args[]){
      A a=new A();
      a.n();
}
} // hello n
  // hello m

// Chiamata al costruttore predefinito dal costruttore parametrizzato:
class A{
   A(){System.out.println("hello a");}
   A(int x){
      this();
      System.out.println(x);
   }
}
class TestThis5{
   public static void main(String args[]){
      A a=new A(10);
}
} // hello a
  // 10


// Chiamata al costruttore parametrizzato dal costruttore predefinito:
class A{
   A(){
      this(5);
      System.out.println("hello a");
   }
   A(int x){
      System.out.println(x);
   }
}
class TestThis6{
   public static void main(String args[]){
      A a=new A();
}
} // 5
  // hello a


// passare come argomento nel metodo
class S2{
  void m(S2 obj){
    System.out.println("method is invoked");
  }
  void p(){
    m(this);
  }
  public static void main(String args[]){
    S2 s1 = new S2();
    s1.p();
  }
}  // method is invoked


// da passare come argomento nella chiamata al costruttore
class B{
  A4 obj;
  B(A4 obj){
    this.obj=obj;
  }
  void display(){
    System.out.println(obj.data);//using data member of A4 class
  }
}
class A4{
  int data=10;
  A4(){
   B b=new B(this);
   b.display();
  }
  public static void main(String args[]){
   A4 a=new A4();
  }
} // 10

// this restituita come istruzione (istanza) dal metodo
class A{
   A getA(){
      return this;
   }
   void msg(){System.out.println("Hello java");}
   }
class Test1{
   public static void main(String args[]){
      new A().getA().msg();
   }
}  // Hello java


// Dimostrazione che this si riferisce alla variabile d'istanza della classe corrente
class A5{
   void m(){
      System.out.println(this);//prints same reference ID
   }
   public static void main(String args[]){
      A5 obj=new A5();
      System.out.println(obj);//prints the reference ID
      obj.m();
   }
}  // A5@22b3ea59
   // A5@22b3ea59
