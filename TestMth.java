class Methd {
  int a, b;
  void mth1() {
    a = 0;
    b = 0;
    System.out.println("a = " + a + ",b = " + b);
  }
  static int mth2(int x, int y) {
  int c = x + y;
  return c;
  }
}

class TestMth {
  public static void main(String[] args) {
    int x = 10, y = 30;
    Methd ob1 = new Methd();
    ob1.mth1();
    System.out.println("Sum is : " + Methd.mth2(x, y));
  }
}