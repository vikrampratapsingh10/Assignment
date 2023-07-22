// Bank Customer
// id,name,age,account,mobile
// deposite(), withdrawal(), balanceEnq()
// bal = 10000
import java.util.Scanner;
class Customer{
  private int id;
  private String name;
  private int age;
  private String accountNumber;
  private String mobile;
  private int bal=10000;
  public Customer(int id, String name, int age,String accountNumber, String mobile){
    this.id = id;
    this.name = name;
    this.age = age;
    this.accountNumber = accountNumber;
    this.mobile = mobile; 
    
  }
  /*
  public Customer(){
    this.bal = 10000;
  }
  */
  public void setId(int id){
    this.id = id;
  }  
  public void setName(String name){
    this.name = name;
  }
  public void setAge(int age){
    this.age = age;
  }
  public void setMobile(String mobile){
    this.mobile = mobile;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public String getAccountNumber(){
    return accountNumber;
  }
  public String getMobile(){
    return mobile;
  }
  public void withdrawal(int amount){
    if(amount > bal){
      System.out.println("Sorry ! Insufficient Balance");
    }
    else{
      bal = bal - amount;
      System.out.println("Withdrawal Success");
    }
  }
  public void deposite(int amount){
    bal = bal + amount;
    System.out.println("Deposite Success");
  }
  public void balanceEnq(){
    System.out.println("Total Bal : "+bal);
  }
  public void viewDetails(){
    System.out.println("Id : "+id);
    System.out.println("Name : "+name);
    System.out.println("AccountNumber : "+accountNumber);
    System.out.println("Age : "+age);
    System.out.println("Mobile : "+mobile);
    System.out.println("Balance : "+bal);
  }
}
class TestMain{
  public static void main(String args[]){
    Customer obj1 = new Customer(100,"Cheeku",23,"Chk1001","9009111222");
    Scanner sc = new Scanner(System.in);
    do{
      System.out.println("Press 1 for withdrawal");
      System.out.println("Press 2 for deposite");
      System.out.println("Press 3 balanceEnquiry");
      System.out.println("Press 4 view details");
      System.out.println("Press Any Key to Exit");
      System.out.println("Enter Choice");
      int choice = sc.nextInt();
      int amount;
      switch(choice){
         case 1: System.out.println("Enter Amount For With...");
                 amount = sc.nextInt();
                 obj1.withdrawal(amount);
                 break;
         case 2: System.out.println("Enter Amount For Deposite...");
                 amount = sc.nextInt();
                 obj1.deposite(amount);
                 break; 
         case 3: obj1.balanceEnq();
                 break;
         case 4: obj1.viewDetails();
                 break;
         default: System.exit(0);                                
      }
    }while(true);
       
  }
}
