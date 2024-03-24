 class Nonstatic_mwp2 {
    void ope(double pi,int r){
        double area=2*pi*r;
        System.out.println(area);
    }
    public static void main(String[] args) {
        new Nonstatic_mwp2().ope(3.142,5);
    }
}
//31.419999999999998