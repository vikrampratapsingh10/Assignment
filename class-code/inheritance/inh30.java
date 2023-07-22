class A{
    public void m1(){
        class B{
            public void m2(){
                System.out.println("Local B ka m2()");
            }
        }

        new B().m2();
    }

}
class TestMain{
    public static void main(String args[]){
        new A().m1();
    }
}