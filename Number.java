public abstract class Number {
  public abstract double getValue();

  public boolean equals(RealNumber other){
    if(other.getValue() == 0) {
      if(getValue() == 0) return true;
    }
    if(getValue() == 0) {
      if(other.getValue() == 0) return true;
    }
    if(Math.abs(getValue() - other.getValue()) / getValue() < 0.00001) {
      return true;
    }
     return false;
  }
  public int compareTo(Number other) {
    if (other.getValue() == getValue()) return 0;
    return (int) getValue() - (int) other.getValue();
  }
  public boolean equals(Number other){
    if (Math.abs(other.getValue() - getValue() / getValue()) <=  0.00001) return true;
    return false;
  }
}
