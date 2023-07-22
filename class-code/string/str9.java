import java.util.Scanner;
import java.util.LinkedHashSet;
class TestMain{
    public static boolean isPalindrome(String s){
       boolean status = true;
       for(int i=0,j=s.length()-1; i<=j; i++,j--){
          char ch1 = s.charAt(i);
          char ch2 = s.charAt(j);
          if(ch1 != ch2){
            status = false;
            break;
          }  
       }
       return status;
    }
    public static void main(String args[]){
      String input = "aaabbbacccababacccaabb";
      String output = "";
      LinkedHashSet<String> lhs = new LinkedHashSet<String>();
      for(int i=0; i<input.length()-1; i++){
        for(int j=i+1; j<input.length(); j++){
           String part =  input.substring(i,j+1);
           boolean status = TestMain.isPalindrome(part);
           if(status)
             lhs.add(part);
             
        }
      }
      for(String data : lhs)
        System.out.println(data);
    }

}