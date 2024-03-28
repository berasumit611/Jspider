class Student {
    static void main(int x,String y,String a)
    {
        System.out.println("Name: "+y);
        System.out.println("Roll: "+x);
        System.out.println("Course: "+a);

    }
    static void main(int roll,double marks,String name)
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Grade: "+marks);
        
    }
    public static void main(String[] args) {
        main(10,"Sumit Bera","Ruby on Rails");
        main(10,8.5,"Ashoke");

    }
}
