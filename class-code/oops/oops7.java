class Distance{
  private int km,meter;
  public Distance(int km, int meter){
    this.km = km;
    this.meter = meter;
  }
  public Distance(){}
  
  public Distance addDistance(Distance k){
     Distance temp = new Distance();
     temp.km = this.km + k.km;
     temp.meter = this.meter + k.meter;
     if(temp.meter>=1000){
       temp.km++;
       temp.meter -= 1000;
     }
     return temp;
  }
  public void addDistance(Distance k1, Distance k2){
     this.km = k1.km + k2.km;
     this.meter = k1.meter + k2.meter;
     if(this.meter >=1000){
       this.km++;
       this.meter -= 1000;
     }
  } 
  public void showDistance(){
    System.out.println(km+" km "+meter+" meter");
  }
}
class TestMain{
  public static void main(String args[]){
    Distance d1 = new Distance(5,700); // d1->km=5,meter=700
    Distance d2 = new Distance(6,500);// d2->km=6, meter=500
    //Distance d3 = d1.addDistance(d2);   
    Distance d3 = new Distance();
    
    d3.addDistance(d1,d2);
    
    d1.showDistance();
    d2.showDistance();
    d3.showDistance();   
  }
}
