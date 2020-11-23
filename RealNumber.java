public class RealNumber{
  private double value;
  public RealNumber(double v){
    value = v;
  }
  public double getValue(){
    return value;
  }
  public String toString(){
    return String.valueOf(value);
  }
  public boolean equals(RealNumber other){
    if(other.getValue() == 0) {
      if(value == 0) return true;
    }
    if(value == 0) {
      if(other.getValue() == 0) return true;
    }
    if(Math.abs(value - other.getValue()) / value < 0.00001) {
      return true;
    }
     return false;
  }
  public RealNumber add(RealNumber other){
      RealNumber ans = new RealNumber(value + other.getValue());
      return ans;
   }
   public RealNumber multiply(RealNumber other){
      RealNumber ans = new RealNumber(value * other.getValue());
       return ans;
 }
 public RealNumber divide(RealNumber other){
   if(other.getValue() == 0) {
     return null;
   }
   RealNumber ans = new RealNumber(value / other.getValue());
   return ans;
 }
 public RealNumber subtract(RealNumber other){
   RealNumber ans = new RealNumber(value -  other.getValue());
    return ans;
  }
}
