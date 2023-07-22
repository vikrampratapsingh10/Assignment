// Inner Class / Nested Class
class Outer{
  class Inner{
    public void m1(){
        System.out.println("m1-called...");
    }
  }
  public void m2(){
    System.out.println("m2-called...");
  }
}
class TestMain{
    public static void main(String arg[]){
      Outer outer = new Outer();
      Outer.Inner inner = outer.new Inner();
      inner.m1();
    }
}