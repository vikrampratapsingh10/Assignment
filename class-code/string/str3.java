
class TestMain{
    public static void main(String args[]){
      String s1 = args[0];
      String s2 = args[1];

      //int x = s1.compareTo(s2);
      int x = s1.compareToIgnoreCase(s2);
      // 0 , +ve, -ve
      if(x == 0)
        System.out.println(s1+" == "+s2);
      else if(x > 0)
            System.out.println(s1+" > "+s2);
           else
            System.out.println(s1+" < "+s2);    
    }
}