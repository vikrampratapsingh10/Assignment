class A{
    public void m1(){
        System.out.println("A-m1");
    }
}
class B extends A{
    public void m1(){
        System.out.println("B-m1");
    }
    public void m2(){
        System.out.println("B-m2()");
    }
}
class C extends B{
    public void m1(){
        System.out.println("C-m1");
    }
    public void m3(){
        System.out.println("C-m3");
    }
}
class TestMain{
    public static void main(String args[]){
        B obj = new C();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}