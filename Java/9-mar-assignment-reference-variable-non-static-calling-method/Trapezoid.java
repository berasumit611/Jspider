class Trapezoid {
    void area(){
        int a=5;
        int b=10;
        int h=3;
        double res=0.5*(a+b)*h;
        System.out.println(res);
    }
    public static void main(String[] args) {
        Trapezoid v=new Trapezoid();
        v.area();
    }
}
