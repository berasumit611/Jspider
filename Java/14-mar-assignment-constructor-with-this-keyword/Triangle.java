class Triangle {
    double res;
    Triangle(int b,int h){
        double res=0.5*h*b;
        this.res=res;
    }
    public static void main(String[] args) {
       Triangle v= new Triangle(2,4 );
       System.out.println(v.res);//4.0
    }
    
}