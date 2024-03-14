class Triangle {
    double r;
    Triangle(int b,int h){
        double res=0.5*h*b;
        r=res;
    }
    public static void main(String[] args) {
       Triangle v= new Triangle(2,4 );
       System.out.println(v.r);//4.0
    }
    
}