import java.util.Scanner;
class ICICI{
   private int bal = 10000;
   
   public void withdrawal(int amount){
      if(bal > amount){
        bal = bal - amount;
        System.out.println("Withdrawal Success");
      }
      else
        System.out.println("Insufficient Balance..");
   }
   
   public void deposite(int amount){
      bal = bal + amount;
      System.out.println("Total Bal : "+bal);
   }
   
   public void balanceEnq(){
     System.out.println("Current Balance : "+bal);
   }
}
class TestMain{
   public static void main(String args[]){
      ICICI obj = new ICICI();
      Scanner sc = new Scanner(System.in);
      
      do{
        System.out.println("Press 1 for withdrawal");
        System.out.println("Press 2 for deposite");
        System.out.println("Press 3 for balance Enq ");
        System.out.println("Press Any key for exit..");
        System.out.println("Please enter your choice");
        int choice = sc.nextInt();
        int amount;
        switch(choice){
          case 1: System.out.println("Enter Amount for wit..");
                  amount = sc.nextInt();
                  obj.withdrawal(amount);
                  break;
          case 2: System.out.println("Enter Amount for depo..");
                  amount = sc.nextInt();
                  obj.deposite(amount);
                  break;
          case 3: obj.balanceEnq();
                  break;                    
          case 4: System.exit(0); 
        }
      }while(true);
      
      
           
   }
   
}
