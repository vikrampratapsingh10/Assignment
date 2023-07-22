import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      //Scanner sc = new Scanner(System.in);
      String s1 = "    Info     Beans         ";
      //int x = s1.length();
      System.out.println("$"+s1+"$");
      s1 = s1.trim();
      System.out.println("$"+s1+"$");
    
      String s2 = "Ab";
      String s3 = s2.toUpperCase(); 
    
      System.out.println("AB" == s3);
           
    }
}