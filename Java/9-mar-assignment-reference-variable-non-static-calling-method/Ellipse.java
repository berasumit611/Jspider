class Ellipse {
    void area(){
        final double pi=3.142;
        int a=2;
        int b=4;
        double res=pi*a*b;
        System.out.println(res);
    }
    public static void main(String[] args) {
        Ellipse v=new Ellipse();
        v.area();
    }
}
