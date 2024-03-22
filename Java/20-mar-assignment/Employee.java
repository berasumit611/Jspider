class Employee {
    String name;

    static void disp(Employee ref1) {
        System.out.println("Employee Name: " + ref1.name);
    }

    public static void main(String[] args) {
        Employee ref = new Employee();
        ref.name = "sumit";
        disp(ref);

    }
}
