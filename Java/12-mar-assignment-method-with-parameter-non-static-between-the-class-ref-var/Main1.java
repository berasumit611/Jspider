class Sub1{
    void ope(double x,int y){
        double res=x/y;
        System.out.println(res);//11.248000000000001
    }
}
//-----------------------------------
class Main1{
    public static void main(String[] args) {
        Sub1 v=new Sub1();
        v.ope(56.24, 5);
    }
}