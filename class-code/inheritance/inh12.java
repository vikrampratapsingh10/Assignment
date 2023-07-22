interface I{
  int x; // public static final int x = 200;    
}

class TestMain{
    public static void main(String args[]){
      I.x = 500;
      System.out.println(I.x);
    }
}