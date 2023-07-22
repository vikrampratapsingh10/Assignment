interface I{
  void m1();
  default void wish(){
    System.out.println("GM....");
  }
  public static void greetUser(){
    System.out.println("Hello Friends....");
  }
}
class TestMain{
    public static void main(String args[]){
        I.greetUser();
    }
}