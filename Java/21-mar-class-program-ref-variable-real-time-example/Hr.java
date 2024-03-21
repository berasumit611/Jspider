//----------common-class
class Jspider
{
    //non static method
    void dev_course(String name){
        System.out.println(name + " have enrolled successfully");
    }
}
 
 //-----------main class
 class Hr {
    public static void main(String[] args) {
        //reference variable
        Jspider ref=new Jspider();//Jspider class obj

        //call satic member of another class
        //by passing ref variable
        Sumit.join(ref);

        Rim.join(ref);
    }
}
//----------sub class
class Sumit
{
    //static memeber
    static void join(Jspider ref1)
    {
        ref1.dev_course("Sumit");
    }
}
//----------sub class
class Rim
{
    static void join(Jspider ref2)
    {
        ref2.dev_course("Rim");
    }

}
// output
//Sumit have enrolled successfully
//Rim have enrolled successfully
