 class Demo4 {
    String ope(){
        String x="Hi this is a non static method";
        return x;
    }
    public static void main(String[] args) {
        Demo4 v=new Demo4();
    String res=v.ope();
    System.out.println(res);//Hi this is a non static method
    }
   


 
}
