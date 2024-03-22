 class Student1 {
    String name;
    int age;
    Student1(String x,int y){
        name=x;
        age=y;
    }
    public static void main(String[] args) {
        Student1 r=new Student1("sumit", 23);
        System.out.println(r.name);
        System.out.println(r.age);

    }
}
