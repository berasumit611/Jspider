class Student {
     void main(int x,String y,String a)
    {
        System.out.println("Name: "+y);
        System.out.println("Roll: "+x);
        System.out.println("Course: "+a);

    }
     void main(int roll,double marks,String name)
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Grade: "+marks);
        
    }
    void main (String name,String course){
        System.out.println("Name "+name);
        System.out.println("Course "+course);
    }
    
    public static void main(String[] args) {
        Student r=new Student();

        r.main(10,"Sumit Bera","Ruby on Rails");
        r.main(10,8.5,"Ashoke");
        r.main("Skr","SDLC");

    }
}
