class MathOperation{
    public static void multiply(int x, int y){
        System.out.println("Multiplication Of Integer : "+(x*y));
    }
    public static void multiply(float x, float y, float z){
        System.out.println("Multiplication Of Float : "+(x*y*z));
    }
    public static void multiply(int x[]){
        int result = 1;
        for(int element : x)
          result = result * element;
        System.out.println("Mutl of Array : "+result);  
    }
    public static void multiply(double x, int y){
        System.out.println("Mulit of double and int : "+(x*y));
    }
}
class TestMain{
    public static void main(String args[]){
      MathOperation.multiply(20,10); // 200
      MathOperation.multiply(1,2,5.5f); //
      int x[] = {1,2,3,4,5};
      MathOperation.multiply(x);       
      MathOperation.multiply(5.5,2);
    }
}