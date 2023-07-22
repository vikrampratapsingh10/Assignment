import java.util.Scanner;
class Arithmetic{
  private int a,b;
  public void setData(int a, int b){
    this.a = a;
    this.b = b;
  }
  public void add(){
    System.out.println("Addition  : "+(a+b));
  }
  public void sub(){
    System.out.println("Subtr : "+(a-b));
  }
  public void mult(){
    System.out.println("Mulitplication : "+(a*b));
  } 
  public int getA(){
    return a;
  } 
  public int getB(){
    return b;
  }
  public void setA(int a){
    this.a = a;
  }
  public void setB(int b){
    this.b = b;
  }
}
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Arithmetic obj = new Arithmetic(); // obj-->a,b
    
    System.out.println("Enter 2 number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    obj.setData(a,b); // obj--> a , b
    obj.add();
    obj.sub();
    obj.mult();   
  }
}
