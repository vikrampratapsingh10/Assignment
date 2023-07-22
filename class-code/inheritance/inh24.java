class A{
    public void m1(){
        System.out.println("A-m1()....");
        m2();
    }
    class B{
        public void m2(){
            System.out.println("B-m2()....");
        }
    }
}
class TestMain{
    public static void main(String args[]){
      new A().m1();
    }
}