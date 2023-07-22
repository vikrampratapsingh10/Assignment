class A{
    class B{
      public void m1(){
        System.out.println("B-m1...");
      }
    }
    public void m2(){
        System.out.println("m2-called...");
    }
}

class C extends A.B{
  
}
class TestMain{
    public static void main(String args[]){
    }
}