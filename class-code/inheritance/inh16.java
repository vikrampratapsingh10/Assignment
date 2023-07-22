abstract class I{
    public abstract void m1();
    public abstract void m2();
}

class TestMain{
    public static void main(String args[]){
        I obj = new  I() {
           public void m1(){
            System.out.println("m1-called..."+l);
           }
           public void m2(){
            System.out.println("m2-called...");
           }
        };
        obj.m1();
        obj.m2();
    }
}