import java.util.Scanner;
class Area{
   private double radius;
   private double result;
   public void init(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter Radius");
     radius = sc.nextDouble();
   }
   public void calc(){
     result = 3.14 * radius * radius;
   }
   public void display(){
     System.out.println("Area Of Circle : "+result);
   }  
}
class TestMain{
    public static void main(String args[]){
        Area obj = new Area(); //obj--> radius=0.0,result=0.0
        obj.init(); // obj-> readus=2.0, result=0.0
        obj.calc();// obj--> readius=2.0, result=12.5
        obj.display();
    }
}