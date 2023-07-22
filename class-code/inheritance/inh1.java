class J5{
   public void recevingCall(){
     System.out.println("Call Received....");
   }
   public void rejectingCall(){
     System.out.println("Call rejected.....");
   }
   private void testing(){

   }
}
class J7 extends J5{
    public void camera(){
        System.out.println("Photo Cliked...");
    }
}
class TestMain{
    public static void main(String args[]){
        J7 j7 = new J7();
        j7.recevingCall();
        j7.rejectingCall();
        j7.camera();
        j7.testing();
    }
}
