/*
 Polymorphism :-One thing has a different implementation
   1. Compile Time / Static Binding / Early Binding
      Method Overloading

   2. Run Time / Dynamic Binding / Late Binding
      Method Overriding
 */
class Operation{
    public void execute(int a, int b){
       System.out.println("Override it to perform operation");
    }
}

// Ajay
class Addition extends Operation{
    public void execute(int a, int b){
        System.out.println("Addition : "+(a+b));
    }
}

// Lokesh
class Greater extends Operation{
    public void execute(int a, int b){
        if(a>b)
          System.out.println(a+" > "+b);
        else
          System.out.println(a+" < "+b);  
    }
}
class TestMain{
    public static void main(String args[]){
           
    }
}