class Sub3{
    int div(){
        int x=10;
        int y=5;
        int z=x/y;
        return z;
    }
}
//-----------------------
class Main3{
    public static void main(String[] args) {
        Sub3 v=new Sub3();
        int res=v.div();
        System.out.println(res);//2
    }
}