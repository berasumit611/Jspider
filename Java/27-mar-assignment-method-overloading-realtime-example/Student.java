class Student
{
    static void detail(String name,int roll){
        System.out.println(name);
        System.out.println(roll);
        System.out.println("+++++++++++++");
    }
    static void detail(String name,int roll,String course){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(course);
    }
    public static void main(String[] args) {
        detail("Sumit", 10);
        detail("Suman", 9,"JavaScript");
    }
}