class Circle{
    double result;

    Circle(double pi,int r){
        double result=pi*r*r;
        this.result=result;
    }
    public static void main(String[] args){
        Circle v=new Circle(3.142,5);
        System.out.println(v.result);//78.55
    }
}