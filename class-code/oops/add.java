import java.util.Scanner;
class Addition{
  private int a,b;
  public Addition(int a, int b){
    this.a = a;
    this.b = b;
  }
  public Addition(){}
  public void setA(int a){
    this.a = a;
  }
  public void setB(int b){
    this.b = b;
  }
  public int getA(){
    return a;
  }
  public int getB(){
    return b;
  }
  public void add(){
    System.out.println("Addtion : "+(a+b));
  }
}
class TestMain{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 2 number");
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    Addition obj = new Addition(a,b);// obj--> a=0,b=0
    System.out.println("a prop "+obj.getA()+" b props "+obj.getB());
    obj.add();
    
  }
}
