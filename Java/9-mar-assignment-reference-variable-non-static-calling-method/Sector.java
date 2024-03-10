 class Sector {
    void area(){
        int r=10;
        int theta=60;
        double res=0.5*r*r*theta;
        System.out.println(res);
    }
    public static void main(String[] args) {
        Sector v=new Sector();
        v.area();
    }
}
