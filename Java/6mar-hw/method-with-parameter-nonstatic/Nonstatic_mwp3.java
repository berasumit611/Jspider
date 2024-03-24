 class Nonstatic_mwp3 {
    void ope(String x, String y){
        String res=x+y;
        System.out.println(res);
    }
    public static void main(String[] args) {
        new Nonstatic_mwp3().ope("hi myself Sumit.","And my age is 23.");
    }
}
