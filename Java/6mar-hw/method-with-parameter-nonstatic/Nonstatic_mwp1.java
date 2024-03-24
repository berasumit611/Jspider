class Nonstatic_mwp1{
    void ope(int x,int y){
        int res=x+y;
        System.out.println(res);
    }
    public static void main(String[] args) {
        new Nonstatic_mwp1().ope(50,23);
    }
}
//73