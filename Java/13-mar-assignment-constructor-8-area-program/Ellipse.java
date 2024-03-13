class Ellipse {
    Ellipse(double pi,int a,int b){
        double res=pi*a*b;
        System.out.println(res);//25.136
    }
    public static void main(String[] args) {
        new Ellipse(3.142,2,4);
    }
}
