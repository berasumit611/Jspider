 class Circle {
    void area()
    {
        double pi=3.142;
        int r=2;
        double res=pi*r*r;
        System.out.println(res);
    }
    public static void main(String[] args) {
        Circle v=new Circle();
        v.area();
    }
}
