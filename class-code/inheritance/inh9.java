interface I1{
    int add(int x, int y);
    int sub(int x, int y);
}

class Child implements I1{
   public int add(int x, int y){
    System.out.println("Addition : "+(x+y));
    return 0;
   }
   public int sub(int x, int y){
    System.out.println("Subtraction : "+(x-y));
    return 0; 
   }
}
class TestMain{
    public static void main(String args[]){
       I1 obj = new Child();
       obj.add(20,10);
       obj.sub(20,10);
    }
}