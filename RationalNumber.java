public class RationalNumber extends Number {
  private int numerator, denominator;

  /**Initialize the RationalNumber with the provided values
  *  if the denominator is 0, make the fraction 0/1 instead
  *@param nume the numerator
  *@param deno the denominator
  */
  public RationalNumber(int nume, int deno){
    //super(0.0);//this value is ignored!
    if(deno == 0) {
      numerator = 0;
      denominator = 1;
    } else {
      numerator = nume;
      denominator = deno;
    }
    reduce();
  }
  public double getValue(){
    double nume_d = numerator;
    double deno_d = denominator;
    return nume_d / deno_d;
  }

  public int getNumerator(){
    return numerator;
  }
  public int getDenominator(){
    return denominator;
  }
    /**
    *@return a new RationalNumber that has the same numerator
    *and denominator as this RationalNumber but reversed.
    */
  public RationalNumber reciprocal(){
    RationalNumber recip = new RationalNumber(denominator, numerator);
    return recip;
  }
    /**
    *@return true when the RationalNumbers have the same numerators and denominators, false otherwise.
    */
  public boolean equals(RationalNumber other){
    if (other.getNumerator() == numerator && other.getDenominator() == denominator) {
      return true;
    }
    return false;
  }

    /**
    *@return the value expressed as "3/4" or "8/3"
    */
  public String toString(){
    return Integer.toString(numerator) + "/" + Integer.toString(denominator);
  }

    /**Calculate the GCD of two integers.
    *@param a the first integers
    *@param b the second integer
    *@return the value of the GCD
    */
  private static int gcd(int a, int b){
    for(int i = Math.min(a, b); i > 0; i--) {
      if(a % i == 0 && b % i == 0){
        return i;
      }
    }
    return 1;
  }

    /**
    *Divide the numerator and denominator by the GCD
    *This must be used to maintain that all RationalNumbers are
    *reduced after construction.
    */
  private void reduce(){
    int common = gcd(numerator, denominator);
    numerator = numerator / common;
    denominator = denominator / common;
  }
    /******************Operations Return a new RationalNumber!!!!****************/
  /**
  *Return a new RationalNumber that is the product of this and the other
  */
  public RationalNumber multiply(RationalNumber other){
    int new_nume = numerator * other.getNumerator();
    int new_deno = denominator * other.getDenominator();
    RationalNumber new_rational = new RationalNumber(new_nume, new_deno);
    return new_rational;
  }

  /**
  *Return a new RationalNumber that is the this divided by the other
  */
  public RationalNumber divide(RationalNumber other){
    int new_nume = numerator * other.getDenominator();
    int new_deno = denominator * other.getNumerator();
    RationalNumber new_rational = new RationalNumber(new_nume, new_deno);
    return new_rational;
  }

  /**
  *Return a new RationalNumber that is the sum of this and the other
  */
  public RationalNumber add(RationalNumber other){
    int common = gcd(denominator, other.getDenominator());
    int new_nume = numerator * common + other.getNumerator() * common;
    int new_deno = denominator * common;
    RationalNumber ans = new RationalNumber(new_nume, new_deno);
    return ans;
  }
  /**
  *Return a new RationalNumber that this minus the other
  */
  public RationalNumber subtract(RationalNumber other){
    int common = gcd(denominator, other.getDenominator());
    int new_nume = numerator * common - other.getNumerator() * common;
    int new_deno = denominator * common;
    RationalNumber ans = new RationalNumber(new_nume, new_deno);
    return ans;
  }
}
