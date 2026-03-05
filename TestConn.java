class conn {
  int a, b;
  conn() {
    a = 0;
    b = 0;
    System.out.println("a = " + a + ",b = " + b);
  }
  conn(int x, int y) {
  int c = x + y;
  System.out.println("Sum is : " + c);
  }
}

class TestConn {
  public static void main(String[] args) {
    conn ob1 = new conn();
    conn ob2 = new conn(10, 40);
  }
}