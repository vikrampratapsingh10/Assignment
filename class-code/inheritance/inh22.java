class A{
    class B{
        public void m1(){
            System.out.println("A-m1()..");
        }
    }
    public void m2(){
        System.out.println("A-m2()");
    }
}
class Child extends A{
    class B{
        public void m1(){
            System.out.println("AAAAA-m1()..");
        }
    }
}
class TestMain{
    public static void main(String args[]){
        Child obj = new Child();
        Child.B ref = obj.new B();
        ref.m1();
    }
}