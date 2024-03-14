class Square {
    int res;
    Square(int a){
        int res=a*a;
        this.res=res;
    }
    public static void main(String[] args) {
        Square v=new Square(4);
        System.out.println(v.res);//16
    }
}
