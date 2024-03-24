class Nonstatic_cm1{
    void ope(){
        String x="My name is ";
        String y="Sumit Bera";
        String res=x+y;
        System.out.println(res);
    }
    public static void main(String[] args) {
        //call non static memeber as calling method
        new Nonstatic_cm1().ope();

    }
}