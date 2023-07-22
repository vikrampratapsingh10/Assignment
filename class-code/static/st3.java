class A{
  static{
    System.out.println("Block-A");
  }
}

class B{
  static{
    System.out.println("Block-B");
  }
}
class C{
  static{
    System.out.println("Block-C");
  }
}
class TestMain{
  public static void main(String args[]){
    System.out.println("Main-started....");
    new A();
    new B();
    new A();
    System.out.println("Main-end.....");
  }
}

