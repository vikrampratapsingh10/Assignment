class A{
  public A(){
   this(20);
   System.out.println("Default version cont called..");
  }
  public A(int x){
    this(20,10);
    System.out.println("Int-version conts. called");
  }
  public A(int x, int y){
    System.out.println("Int Int version consts. called");
  }
}
class TestMain{
  public static void main(String args[]){
     new A();
  }
}
