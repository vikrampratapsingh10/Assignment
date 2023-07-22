interface I1{
    void m1();
}
interface I2{
    void m1();
}

class Child implements I1,I2{
    public void m1(){
        System.out.println("m1-called...");
    }
}
class TestMain{
    public static void main(String args[]){
        I1 obj = new Child();
        obj.m1();
    }
}