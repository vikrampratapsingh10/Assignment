class Area{
    private int l,w;
    public void setData(int l, int w){
        this.l = l;
        this.w = w;
    }
    public int getArea(){
        return l*w;
    }
}
class Volume extends Area{
    private int h;
    public void setData(int l, int w, int h){
      setData(l,w);
      this.h = h;       
    }
    public int getVolume(){
        return getArea()*h;
    }
}
class Density extends Volume{
  private double m;
  public void setData(int l, int w, int h, double m){
     setData(l,w,h);
     this.m = m;   
  }
  public double getDensity(){
    return m/getVolume();
  }
}
class TestMain{
    public static void main(String args[]){
        Density d = new Density(); // d->l,w,h,m
        d.setData(2,3,4,2400);
        System.out.println("Area : "+d.getArea());
        System.out.println("Volume : "+d.getVolume());
        System.out.println("Density : "+d.getDensity());
    }
}