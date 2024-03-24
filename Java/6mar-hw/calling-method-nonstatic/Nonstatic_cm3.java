class Nonstatic_cm3 {
    void ope(){
      double x=53.62;
      int y=2;
      double res=x/y;
      System.out.println("Result is-->"+ res);  
    }
    public static void main(String[] args) {
        new Nonstatic_cm3().ope();
    }
}
//Result is-->26.81