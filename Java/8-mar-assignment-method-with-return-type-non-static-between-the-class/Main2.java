class Sub2
{   String ope()
    {
        String x="Hi ";
        String y="Sumit";
        String res=x+y;
        return res;
    }

} 
//----------------
class Main2 {
    public static void main(String[] args) {
        String y=new Sub2().ope();
        System.out.println(y);
        
    }
    
}
