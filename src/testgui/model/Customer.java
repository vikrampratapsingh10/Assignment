package testgui.model;
public class Customer {
  private int id;
  private String customerName;
  private String email;
  private String mobile;
  private int age;
  private String address;
  private String aadharNo;
  private String accountNo;
  private String panCard;
  private String gender;
  private String dob;
  private int cityId;
  private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
  
         

    public Customer(int id, String customerName, String email, String mobile, int age, String address, String aadharNo, String accountNo, String panCard, String gender, String dob, int cityId) {
        this.id = id;
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
        this.address = address;
        this.aadharNo = aadharNo;
        this.accountNo = accountNo;
        this.panCard = panCard;
        this.gender = gender;
        this.dob = dob;
        this.cityId = cityId;
    }

    public Customer(String customerName, String email, String mobile, int age, String address, String aadharNo, String accountNo, String panCard, String gender, String dob, int cityId) {
        this.customerName = customerName;
        this.email = email;
        this.mobile = mobile;
        this.age = age;
        this.address = address;
        this.aadharNo = aadharNo;
        this.accountNo = accountNo;
        this.panCard = panCard;
        this.gender = gender;
        this.dob = dob;
        this.cityId = cityId;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAadharNo() {
        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {
        this.aadharNo = aadharNo;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
  
  
}
