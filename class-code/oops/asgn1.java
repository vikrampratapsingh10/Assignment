class A{
  private A(){
  
  }
  public void m1(){
    A obj = new A();
  }
}
class TestMain{
  public static void main(String args[]){
    A obj = new A();
  }
}
