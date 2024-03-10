class Sub4{
    int div(){
        int x=10;
        int y=5;
        int r=x/y;
        return r;
    }
}
class Main4 {
    public static void main(String[] args) {
        int res=new Sub4().div();
        System.out.println(res);
    }
    
}
