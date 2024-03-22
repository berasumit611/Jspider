class Product
{
    String name;
    int price;
}


class Order {
    public static void main(String[] args) {
        Product ref=new Product();

        ref.name="DELL";
        ref.price=30;
        Disp.display(ref);
        //-----------
        ref.name="HP";
        ref.price=50;
        Disp.display(ref);
    }
}

class Disp
{
    static void display(Product ref1)
    {
        System.out.println("Order Product name "+ref1.name);
        System.out.println("Order Product name "+ref1.price);
        System.out.println("------------------------------");

    }
}
