// We can change the return type in case of co-varient
/*
  If parent class method is returning parent object
  then while overriding it in child class we can 
  easily return any child class object
 */
class A{
    public A m1(){
        System.out.println("A-m1()");
        return new A();
    }
}
class C extends A{

}
class B extends A{
    public C m1(){
        System.out.println("B-m1()");
        return new C(); 
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
    }
}