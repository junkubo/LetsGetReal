class Tester {
  public static void main(String[] args) {
    RealNumber x = new RealNumber(5.0);
    RealNumber i = new RealNumber(5.0);
    RationalNumber y = new RationalNumber(10, 20);
    RationalNumber j = new RationalNumber(10, 20);
    System.out.println("x.getValue(): " + x.getValue());
    System.out.println("x.toString(): " + x.toString());
    System.out.println("x.equals(i): " + x.equals(i));
    System.out.println("x.add(i): " + x.add(i));
    System.out.println("x.multiply(i): " + x.multiply(i));
    System.out.println("x.divide(i): " + x.divide(i));
    System.out.println("x.subtract(i)" + x.subtract(i));
    System.out.println("y.getValue(): " + y.getValue());
    System.out.println("y.getNumerator(): " + y.getNumerator());
    System.out.println("y.getDenominator(): " + y.getDenominator());
    System.out.println("y.reciprocal(): " + y.reciprocal());
    System.out.println("y.equals(j): " + y.equals(j));
    System.out.println("y.toString(): " + y.toString());
    System.out.println("y.multiply(j): " + y.multiply(j));
    System.out.println("y.divide(j): " + y.divide(j));
    System.out.println("y.add(j):  " + y.add(j));
    System.out.println("y.subtract(j): " + y.subtract(j));
  }
}
