// this is a keyword which referes the current object
class Addition{
  private int a,b;
  public void setData(int a, int b){
    this.a = a;
    this.b = b;
  }  
  public void add(){
    System.out.println("Addition : "+(a+b));
  }
  
  public void display(){
    System.out.println("a : "+a+" b : "+b);
  }
}

class TestMain{
   public static void main(String args[]){
      Addition obj = new Addition(); // obj--> a=0,b=0
      obj.setData(20,10); // obj was the current Object
      obj.display();  // obj-->a = 0, b=0    
   }
}
