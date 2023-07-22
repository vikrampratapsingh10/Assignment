// I1.class
// I2.class
// Test.class
// TestMain.class
interface I1{
   public static void m1(){
    System.out.println("I1-m1....");
   }
}

interface I2{
    public static void m1(){
        System.out.println("I2-m1....");
    }
}

class Test implements I1{
  public static void m1(){
    System.out.println("Test-m1.....");
  }    
}
class TestMain{
    public static void main(String rgs[]){
      Test.m1();
    }
}