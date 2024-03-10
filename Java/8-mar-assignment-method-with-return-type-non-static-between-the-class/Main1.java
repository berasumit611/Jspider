class Sub1{
    int add(){
        int x=10;
        int y=5;
        int z=x+y;
        return z;
    }
}
class Main1 {
    public static void main(String[] args) {
        
    
    int res=new Sub1().add();
    System.out.println(res);

    }
}
