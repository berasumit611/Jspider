class Mobile {
    String brand;

    static void disp(Mobile phone) {
        System.out.println("Phone Brand: " + phone.brand);
    }

    public static void main(String[] args) {
        Mobile phone1 = new Mobile();
        phone1.brand = "Samsung";
        disp(phone1);

       
    }
}
