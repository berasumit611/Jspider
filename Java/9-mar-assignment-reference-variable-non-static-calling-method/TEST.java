 class TEST {
    void demo(){
        System.out.println("Hi this is non static method body.");
    }
    public static void main(String[] args) {
        TEST v=new TEST();
        System.out.println(v);
        //TEST@372f7a8d
        //output-->object or object name or fullly qalified path
        //syntax-->package name.classname@HEXADECMAL NO
        v.demo();
    }
}
