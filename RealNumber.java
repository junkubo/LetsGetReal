public class RealNumber{
  private double value;
  public RealNumber(double v){
    value = v;
  }
  public double getValue(){
    return value;
  }
  public String toString(){
    return ""+getValue();
  }
  public boolean equals(RealNumber other){
    if(other == 0) {
      if(value == 0) return true;
    }
    if(value == 0) {
      if(other == 0) return true;
    }
    if(Math.abs(value - other) / value < 0.00001) {
      return true;
    }
     return false;
  }
  public RealNumber add(RealNumber other){
      return value + other;
   }
   public RealNumber multiply(RealNumber other){
       return value * other;
 }
 public RealNumber divide(RealNumber other){
   if(other == 0) {
     return null;
   }
   return value / other;
 }
 public RealNumber subtract(RealNumber other){
    return value - other;
  }
}
