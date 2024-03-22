class BankAccount
{
    String holder;
    int balance;
    void disp(){
        System.out.println("Account holder name "+holder);
        System.out.println("Account balance "+balance);

    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount ref=new BankAccount();
        Sumit.detail(ref);
        Suman.detail(ref);
    }
}
class Sumit{
    static void detail(BankAccount ref1){
        ref1.holder="Sumit Bera";
        ref1.balance=1000;
        ref1.disp();
    }
}
class Suman{
    static void detail(BankAccount ref2){
        ref2.holder="Suman Bera";
        ref2.balance=500;
        ref2.disp();
    }
}

