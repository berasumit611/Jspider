 class Sector {
    Sector(int r,int theta)
    {
        double res=0.5*r*theta*r;
        System.out.println(res);//3000.0
    }
    public static void main(String[] args) {
        new Sector(10,60);
    }
}
