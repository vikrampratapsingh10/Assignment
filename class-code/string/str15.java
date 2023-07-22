import java.util.Scanner;
class Validate{
    public static boolean isSpecialLetterOrSpace(String email){
        for(int i=1; i<email.length(); i++){
            char ch = email.charAt(i);
            if((ch>='a' && ch <='z') || (ch>='0' && ch<='9') || ch == '.' || ch == '_' || ch=='@')
              continue;
            return false;  
        }
        return true;
    }
    public static boolean isAlphabate(String s){
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch >='a' && ch <='z')
              continue;
            return false;  
        }
        return true;
    }
    public static boolean isValidName(User user){
        String name = user.getName();
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(!((ch >='A' && ch <='Z') || (ch>='a' && ch <='z')))
             return false; 
        }
        return true;
    }
    public static boolean isValidEmail(User user){
      String email  = user.getEmail();
      if(email.charAt(0)<'a' || email.charAt(0) > 'z')
        return false;
      else{
        //System.out.println("Starting with letter.........");
        int isAtTheRateAvailable = email.indexOf('@');
        if(isAtTheRateAvailable<0)
          return false;

        else{
           //System.out.println("@ available......."); 
           int isAtTheRateAvailableTwice = email.lastIndexOf('@');
           if(isAtTheRateAvailable != isAtTheRateAvailableTwice)
             return false;
           else{
             //System.out.println("only one @ is availble .......");
             String domain = email.substring(isAtTheRateAvailable);
             int isDotAvailable = domain.indexOf('.');
             if(isDotAvailable < 0)
               return false;
             else{
                //System.out.println(". available after @......");
                int isDotAvailbleTwice = domain.lastIndexOf('.');
                if(isDotAvailable != isDotAvailbleTwice)
                  return false;
                else{
                    //System.out.println("Only one . is available......");
                    String domainName = domain.substring(1,isDotAvailable);
                    //System.out.println(domainName+" ki length "+domainName.length());
                    if(domainName.length() <= 1)
                      return false;
                    else{
                      //System.out.println("Domain is correct......");  
                      boolean status =  Validate.isAlphabate(domainName);           
                      if(!status)
                        return false;
                      else{
                        //System.out.println("Domain Name is valide...");
                        status = Validate.isSpecialLetterOrSpace(email);
                        if(!status)
                          return false;
                        else
                        {
                            //System.out.println("No invalid letter availbel......");
                            String afterLastDot[] = domain.split("\\.");
                            //System.out.println(domain+" cross check......");
                            if(afterLastDot[0].length() <=1)
                              return false;
                            //System.out.println("All are valide...............");  
                            return true;  
                        }  
                      }  
                    }  
                }  
             }    
           }  
        }  
      }  
      
    }
    public static boolean isValidatePassword(User user){
      String password = user.getPassword();
      boolean isCapital,isLower,isSpecial,isDigit;
      isCapital = isLower = isSpecial = isDigit = false;
      if(password.length() < 8)
        return false;
      else{
        for(int i=0; i<password.length(); i++){
            char ch = password.charAt(i);
            if(ch >= 'A' && ch<='Z'){
                isCapital = true;
                continue;
            }
            if(ch >= 'a' && ch<='z'){
                isLower = true;
                continue;
            }
            if(ch >='0' && ch<='9'){
                isDigit = true;
                continue;
            }
            else
             isSpecial = true;
        }
        if(isCapital && isLower && isDigit && isSpecial)
          return true;
        else
          return false;  
      }  
      
    }
}
class User{
    private String name;
    private String email;
    private String password;
    public User(String name,String email,String password){
        this.email = email;
        this.password = password;
        this.name = name;
    }
    public User(String email, String password){
        this.email = email;
        this.password = password;
    }
    public User(){}
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public void registeration(){
      boolean status;
      Scanner sc = new Scanner(System.in);
      do{
        status = Validate.isValidName(this);
        if(!status){
          System.out.println("Only Alphabate is allowed. Please Re-enter");
          System.out.println("Enter Name");
          String name = sc.next();
          this.setName(name);
        }
      }while(status == false);
        
      do{
        status = Validate.isValidEmail(this);
        if(!status){
          System.out.println("Invalid Email Id. Please Re-enter");
          String email = sc.next();
          this.setEmail(email);
        }
      }while(status == false);

      do{
        status = Validate.isValidatePassword(this);
        
        if(!status){
          String password = "", confirmPassword = "";
          do{  
            System.out.println("Invalid Password. Please Re-enter");
            password = sc.next();
            System.out.println("Confrim Password");
            confirmPassword = sc.next();
          }  
          while(password.equals(confirmPassword) == false);
          
          this.setPassword(password);
        }
      }while(status == false);

      System.out.println("Registraion Success...");
      
      this.login();
    }
    public void login(){
       if(this.getEmail() == null){
          System.out.println("User Not Exist. Please Register First");
          this.registeration();
       }      
       else{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter Email Id");
         String email = sc.next();
         System.out.println("Enter Password");
         String password = sc.next();

         if(email.equals(this.email) && password.equals(this.password))
           System.out.println("Login Success..");
         else
          System.out.println("Login Failed....");  
       }
    }

}
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Press 1 for registeration");
      System.out.println("Press 2 for login");
      System.out.println("Enter Your choice");
      int choice = sc.nextInt();
      User user = new User(); // user->name=null,email=null,password=null
      if(choice == 1){
         System.out.println("Enter Name");
         String name = sc.next();
         System.out.println("Enter Emal");
         String email = sc.next();
         String password = "";
         String confirmPassword = "";
         do{
           System.out.println("Enter Password");
           password = sc.next();
           System.out.println("Confirm Password");
           confirmPassword = sc.next();
         }while((password.equals(confirmPassword))==false);
         user.setName(name);
         user.setEmail(email);
         user.setPassword(password);
         user.registeration();
      } 
      else if(choice == 2){
         user.login();
      }        
    }
}