class Sub4{
    void ope(double x,int y){
        double res=x+y;
        System.out.println(res);//62.23
    }
}
//-----------------------------------
class Main4{
    public static void main(String[] args) {
        Sub4 v=new Sub4();
        v.ope( 52.23, 10);
    }
}