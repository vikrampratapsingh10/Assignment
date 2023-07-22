class Test{
    private String data;
    public Test(String data){
        this.data = data;
    }
    
    public String toString(){
        return data + " " +this.hashCode();
    }
    000
}
class TestMain{
    public static void main(String args[]){
       /* 
        String s = new String("Hello");
        System.out.println(s); // s.toString()
       */
       Test obj = new Test("Hi How r u ?");
       Test obj2 = new Test("Hello How r u ?");
       Test obj3 = new Test("Good Bye");
       
       System.out.println(obj); // obj.toString();
       System.out.println(obj2); // obj2.toString()
       System.out.println(obj3); // obj3.toString();
    }
}