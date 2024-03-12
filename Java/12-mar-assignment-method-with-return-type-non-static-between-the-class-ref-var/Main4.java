class Sub4{
    String ope(){
        String x="hi this is a sub class non static sub method";
        
        
        return x;
    }
}
//-----------------------
class Main4{
    public static void main(String[] args) {
        Sub4 v=new Sub4();
        String res=v.ope();
        System.out.println(res);//hi this is a sub class non static sub method
    }
}