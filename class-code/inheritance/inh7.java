class A{
    public void m1(Object x){
        System.out.println("x in parent :  "+x);
    }
}
class B extends A{
   public void m1(String x){
    System.out.println("x in child : "+x);
   }
}
class TestMain{
    public static void main(String args[]){
        B obj = new B();
        obj.m1("Hello...");
    }
}