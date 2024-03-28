class Calculator {
    void add(int a, int b) {
        System.out.println("result "+(a+b));
    }
    void add(double a, double b) {
        System.out.println("result "+ (a+b));
    }
    void add(int a,int b,int c){
        System.out.println("result"+(a+b+c));
    }

    public static void main(String[] args) {
        Calculator r=new Calculator();

      r.add(5,10);
      r.add(2.5,3.5);
      r.add(10,15,5);
    }
}
