class TestMain{
    public static String wordWithMaximumLength(String s){
       String words[] = s.split(" ");
       int maxLength = words[0].length();
       String output = words[0];
       for(int i=1; i<words.length; i++){
          if(words[i].length() > maxLength){
            maxLength  = words[i].length();
            output = words[i];
          }          
       }  
       return output;
    }
    public static void main(String args[]){
        String input = "Dear Student ,You have need to work hard";
        String output = TestMain.wordWithMaximumLength(input);
        System.out.println(output);
    }
}