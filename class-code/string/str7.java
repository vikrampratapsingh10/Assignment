class TestMain{
    public static String reverse(String s){
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
          rev = rev + s.charAt(i);
        }
        return rev;
    }
    public static void main(String args[]){
        String s1 = "Java is very simple";
        // "avaJ si yrev elpmis"
        String s2[] = s1.split(" ");
        String output = "";
        for(String data : s2){
          output = output+" "+TestMain.reverse(data);
        }  
        System.out.println(output);
    }
}