class Demo3 {
    int add() {
        int num1=10;
        int num2=5;
        int r=num1/num2;
        return r;
    }

    public static void main(String[] args) {
    
        int result = new Demo3().add();
        System.out.println( result);
    }
}
