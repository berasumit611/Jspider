class Rectangle {
  int res;
  Rectangle(int w,int h){
    int r=w*h;
    res=r;
  }  
  public static void main(String[] args) {
    Rectangle v=new Rectangle(50, 40);
    System.out.println(v.res);//2000
  }
}
