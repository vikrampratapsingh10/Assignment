class A{
    public void m1(){
        System.out.println("A-m1()....");
    }
    class B{
        public void m2(){
            System.out.println("B-m2()....");
            m1();
        }
    }
}
class TestMain{
    public static void main(String args[]){
       A.B ref = new A().new B();
       ref.m2();
    }
}