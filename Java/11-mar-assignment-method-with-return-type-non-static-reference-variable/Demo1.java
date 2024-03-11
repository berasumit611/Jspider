class Demo1{
    int add(){
        int a=10;
        int b=5;
        int res=a+b;
        return res;
    }
    public static void main(String[] args) {
        Demo1 v=new Demo1();
        int res=v.add();
        System.out.println(res);//15

    }
}