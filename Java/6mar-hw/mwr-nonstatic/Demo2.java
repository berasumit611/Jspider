class Demo2 {
    String add() {
        String x="hi ";
        String y="Sumit";
        return x + y;
    }

    public static void main(String[] args) {
    
        String result = new Demo2().add();
        System.out.println(result);
    }
}
