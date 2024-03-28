class Operation {
    static void main(int a,int b)
    {
        System.out.println("Addition of two values "+(a+b));
    }
    static void main(int a,int b,int x)
    {
        System.out.println("Addition of three values "+(a+b+x));
    }
    public static void main(String[] args) {
        main(10,5);
        main(10,5,55);
    }
}
