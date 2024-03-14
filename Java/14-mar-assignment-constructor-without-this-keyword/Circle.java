class Circle{
    double result;

    Circle(double pi,int r){
        double res=pi*r*r;
        result=res;
    }
    public static void main(String[] args){
        Circle v=new Circle(3.142,5);
        System.out.println(v.result);//78.55
    }
}