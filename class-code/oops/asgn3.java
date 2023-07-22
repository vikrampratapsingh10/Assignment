import java.util.Scanner;
class MathOperation{
    private int x, y;
    private double r;
    public void init(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter X and Y");
      x = sc.nextInt();
      y = sc.nextInt();
    }
    public void add(){
        r = x + y;
    }
    public void multiply(){
        r = x * y;
    }
    public void power(){
        r = Math.pow(x,y);
    }
    public void display(){
        System.out.println("Result : "+r);
    }
}
class TestMain{
    public static void main(String args[]){
      MathOperation obj = new MathOperation();// obj->x,y,r;
      obj.init(); // obj-> x=2,y=4,r=0
      
      obj.add(); // obj-> x=2, y=4,r=6
      obj.display();

      obj.multiply(); // x=2,y=4,r=8
      obj.display();
      
      obj.power(); // x=2,y=4,4=16
      obj.display();       
    }
}