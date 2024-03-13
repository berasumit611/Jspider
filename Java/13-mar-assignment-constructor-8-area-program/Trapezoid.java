 class Trapezoid {
    Trapezoid(int a,int b,int h){
        double res=0.5*(a+b)*h;
        System.out.println(res);//22.5
    }
    public static void main(String[] args) {
        new Trapezoid(5, 10, 3);
    }
}
