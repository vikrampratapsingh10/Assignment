import java.util.Scanner;
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
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String");
       String s = sc.next();
       boolean result = TestMain.isPalindrome(s);
       if(result)
         System.out.println("Given String is palindorme");
       else
         System.out.println("Not palindrome..");  
    }
}