class Sub3
{
    String ope(){
        String x="this is non statc sub method body";

        return x;
    }

} 
class Main3 {
    public static void main(String[] args) {
        String res=new Sub3().ope();
        System.out.println(res);
    }
}
