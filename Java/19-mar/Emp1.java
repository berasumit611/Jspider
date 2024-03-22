class Emp1 {
    String name;
    int sal;
    Emp1(String x,int y){
        name=x;
        sal=y;
    }
    public static void main(String[] args) {
        Emp1 r=new Emp1("sumit", 23110);
        System.out.println(r.name);
        System.out.println(r.sal);

    }
}
