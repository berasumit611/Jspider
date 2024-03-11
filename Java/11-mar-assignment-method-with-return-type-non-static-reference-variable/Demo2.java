class Demo2 {
    String ope(){
        String a="Hi ";
        String b="myself Sumit";
        String c=a+b;
        return c;
    }
    public static void main(String[] args) {
        Demo2 v=new Demo2();
        String res=v.ope();
        System.out.println(res);//Hi myself Sumit

    }
}
