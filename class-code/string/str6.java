class TestMain{
    public static void main(String args[]){
        String s1 = "Hi hello how r you miss u want to meet u";
        
        boolean status = s1.contains("hellooo");
        if(status)
          System.out.println("Found");
        else
          System.out.println("Not Found");  
    }
}