/*
   length() : int
   toUpperCase() : String
   toLowerCase() : String
   indexOf(char) : int
   lastIndexOf(char) : int
   charAt(int) : char
   "        fdfadf           "
   trim() : String
   substring(int) : String 
   substring(int,int) : String
   compareTo(String) : int
   compareToIgnoreCase(String) : int

 */
class TestMain{
    public static void main(String args[]){
      //           01234567890123456789
      String s1 = "InfoBeans Foundation";
      int x = s1.length();
      System.out.println("Length : "+x);

      String s2 = s1.toUpperCase();
      System.out.println(s2);  
    }
}