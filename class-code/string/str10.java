class TestMain{
    public static String removeDuplicateLetters(String s){
        String output = "";
        for(int i=0; i<s.length(); i++){
            String ch  = ""+s.charAt(i);
            if(output.contains(ch) == false)
             output = output+ch;
        }
        return output;
    }
    public static void main(String args[]){
        String input = "aabbccddd";
        String output = TestMain.removeDuplicateLetters(input);
        System.out.println("Input : "+input);
        System.out.println("Output : "+output);
    }
}