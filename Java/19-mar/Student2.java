class Student2 {
    String name;
    int age;
    Student2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Student2 r=new Student2("sumit", 23);
        System.out.println(r.name);
        System.out.println(r.age);

    }
}
