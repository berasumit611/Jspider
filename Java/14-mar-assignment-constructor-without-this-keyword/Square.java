class Square {
    int res;
    Square(int a){
        int r=a*a;
        res=r;
    }
    public static void main(String[] args) {
        Square v=new Square(4);
        System.out.println(v.res);//16
    }
}
