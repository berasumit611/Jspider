public class Demo3 {
    int div(){
        int x=10;
        int y=5;
        int r=x/y;
        return r;
    }
    public static void main(String[] args) {
        Demo3 v=new Demo3();
        int res=v.div();
        System.out.println(res);//2
    }
}
