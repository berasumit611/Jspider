class Demo3  {
    void ope(double pi,int r){
        double area=2*pi*r;
        System.out.println(area);//31.42
    }
    public static void main(String[] args) {
        Demo3 v=new Demo3();
        v.ope(3.142,5);
    }
}
