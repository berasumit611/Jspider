class Sub2{
    void ope(String x,String y){
        String res=x+y;
        System.out.println(res);//Java Teacher: Sachin Sir
    }
}
//-----------------------------------
class Main2{
    public static void main(String[] args) {
        Sub2 v=new Sub2();
        v.ope("Java Teacher: ", "Sachin Sir");
    }
}