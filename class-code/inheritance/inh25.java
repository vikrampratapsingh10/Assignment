class A{
    public class B{
        public void m1(){
            System.out.println("m1-called...");
        }
    }
    public class C extends B{
       public void m2(){
         System.out.println("m2-called.....");
       } 
    }
}
class TestMain{
    public static void main(String args[]){
      A.C ref = new A().new C();
      ref.m1();
      ref.m2();       
    }
}