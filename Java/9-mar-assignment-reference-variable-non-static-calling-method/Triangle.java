class Triangle {
    void area()
    {
        int b=2;
        int h=4;
        double res=0.5*h*b;
        System.out.println(res);
    }
    public static void main(String[] args) {
        //reference variable
        Triangle v=new Triangle();
        v.area();
    }
}
