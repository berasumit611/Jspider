 class Shape {
    
    static void area(int length, int width) {
        System.out.println("Rectangle: "+(length * width));
    }

   
    static void area(double radius,double pi) {
        System.out.println("Circle: "+( pi * radius * radius));
    }

    static void area(double base, int height) {
        System.out.println("Triangle: "+(0.5 * base * height)); 
    }

    public static void main(String[] args) {
       area(5,3);
       area(2.5,3.142);
       area(4.5,6);
    }
}
