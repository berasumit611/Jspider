class Book
{
    String name;
    int price;
    void disp(){
        System.out.println("Book name "+name);
        System.out.println("Book price "+price);
        System.out.println("-------------------");

    }
}


class Library {
    public static void main(String[] args) {
        Book ref=new Book();
        Sumit.rent(ref);
        Suman.rent(ref);
    }
}

class Sumit{
    static void rent(Book ref1)
    {
        ref1.name="ABC";
        ref1.price=100;
        ref1.disp();
    }
}
class Suman{
    static void rent(Book ref2)
    {
        ref2.name="XYZ";
        ref2.price=500;
        ref2.disp();
    }
}

