interface I{
    void m1();
    void m2();
    default void wish(){
        System.out.println("GM....");
    } 
}
class Test implements I{
    public void m1(){
        System.out.println("m1-called..");
    }
    public void m2(){
        System.out.println("m2-called....");
    }
    public void wish(){
        System.out.println("GN.....");
    }
}
class TestMain{
    public static void main(String args[]){
        I obj = new Test();
        obj.m1();
        obj.m2();
        obj.wish();
    }
}