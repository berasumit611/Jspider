class Demo1 {
    int add() {
        int num1=10;
        int num2=5;
        return num1 + num2;
    }

    public static void main(String[] args) {
    
        int result = new Demo1().add();
        System.out.println("Sum: " + result);
    }
}
