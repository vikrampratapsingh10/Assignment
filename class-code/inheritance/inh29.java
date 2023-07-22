interface I{
    class A{
        public void m1(){
            System.out.println("m1-called....");
        }
    }
}

class TestMain{
    public static void main(String args[]){
     new I.A().m1();
    }
}