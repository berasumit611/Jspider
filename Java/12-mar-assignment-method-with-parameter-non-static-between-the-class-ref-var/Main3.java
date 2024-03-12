class Sub3{
    void ope(double pi,int r){
        double area=2*pi*r;
        System.out.println(area);//31.419999999999998

    }
}
//-----------------------------------
class Main3{
    public static void main(String[] args) {
        Sub3 v=new Sub3();
        v.ope(3.142, 5);
    }
}