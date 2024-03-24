
class Nonstatic_cm2 {

    void add(){
        int x=10;
        int y=50;

        int res = x+ y;
        System.out.println(res);

    }
    public static void main(String[] args) {
        //calling non static member as calling method
        new Nonstatic_cm2().add();
    }
}
//60