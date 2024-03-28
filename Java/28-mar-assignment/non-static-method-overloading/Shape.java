class Shape {
    
    void area(int length, int width) {
        System.out.println("Rectangle: "+(length * width));
    }

   
    void area(double radius,double pi) {
        System.out.println("Circle: "+( pi * radius * radius));
    }

    void area(double base, int height) {
        System.out.println("Triangle: "+(0.5 * base * height)); 
    }

    public static void main(String[] args) {
        Shape r=new Shape();

       r.area(5,3);
       r.area(2.5,3.142);
       r.area(4.5,6);
    }
}
