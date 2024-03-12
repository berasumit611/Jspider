class Sub2{
    String ope(){
        String x="hi ";
        String y="myself sumit";
        String z=x+y;
        return z;
    }
}
//-----------------------
class Main2{
    public static void main(String[] args) {
        Sub2 v=new Sub2();
        String res=v.ope();
        System.out.println(res);//hi myself sumit
    }
}