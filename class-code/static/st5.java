import java.util.Scanner;
class A{
  private static int x;
  static{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number...");
    x = sc.nextInt();
    System.out.println("x : "+x);
  }
  public static void setX(int x){
    A.x = x;
  }
}
class TestMain{
 
  public static void main(String args[]){
    System.out.println("Main-started/Executed...");
    new A();
  }
}

