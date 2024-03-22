class Emp2 {
    String name;
    int sal;
    Emp2(String name,int sal){
        this.name=name;
        this.sal=sal;
    }
    public static void main(String[] args) {
        Emp2 r=new Emp2("sumit", 23110);
        System.out.println(r.name);
        System.out.println(r.sal);

    }
}
