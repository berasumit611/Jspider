class Demo3 {
    String y="sumit";
    static void disp(Demo3 ref1){
        System.out.println(ref1.y);
    }
    public static void main(String[] args) {
        Demo3 ref=new Demo3();

        disp(ref);
    }
}
