interface I{
    void operation(int x, int y);
    default void m1(){
        System.out.println("m1-called....");
    }
}

class TestMain{
    public static void main(String args[]){
        I obj1 = (a,b)-> System.out.println("Addition : "+(a+b));
        I obj2 = (a,b)-> System.out.println("Multi : "+(a*b));
        I obj3 = (a,b)-> {
            if(a > b)
              System.out.println(a+" > "+b);
            else
              System.out.println(a+" < "+b);  
        };
        obj1.operation(20,10); //  30
        obj2.operation(20,10);
        obj3.operation(20,10);

        obj1.m1();
    }
}
