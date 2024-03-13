class Circle{
    Circle(double pi,int r){
        double res=pi*r*r;
        System.out.println(res);//78.55
    }
    public static void main(String[] args){
        new Circle(3.142,5);
    }
}