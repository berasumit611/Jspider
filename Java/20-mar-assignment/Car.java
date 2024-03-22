class Car {
    String brand="OLA";

    static void disp(Car ref2) {
        System.out.println("Car Brand: " + ref2.brand);
    }

    public static void main(String[] args) {
        Car ref=new Car();
        
        disp(ref);

       
    }
}
