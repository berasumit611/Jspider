class Demo4 {
    String add() {
        String x="this is non static method body";

        return x;
    }

    public static void main(String[] args) {
    
        String result = new Demo4().add();
        System.out.println( result);
    }
}
