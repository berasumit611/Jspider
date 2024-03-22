class MCKV
{
    
    void joindetail(){
        System.out.println("Enrolled in MBA succesfully");
    }
}

class Studentcell {
    public static void main(String[] args) {
        MCKV ref=new MCKV();
        Sumit.detail(ref);
        Suman.detail(ref);
    }
}
class Sumit{
    static void detail(MCKV ref1){
        ref1.joindetail();
    }
}
class Suman{
    static void detail(MCKV ref2){
       ref2.joindetail();
    }
}

