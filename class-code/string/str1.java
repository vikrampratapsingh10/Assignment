class TestMain{
    public static void main(String args[]){
      String s1 = "Hello";
      String s2 = new String("Hello").intern();
    
      System.out.println(s1==s2); // true
      /*
      String s3 = new String("ABC").intern();
      String s4 = "ABC";
      System.out.println(s3 == s4);

      String s6 = new String("BCD");
      String s7 = "BCD";
      String s8  = s6.intern();

      System.out.println(s7 == s8);
      */
    }
}