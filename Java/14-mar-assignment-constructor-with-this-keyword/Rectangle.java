class Rectangle {
    int res;
    Rectangle(int w,int h){
      int res=w*h;
      this.res=res;
    }  
    public static void main(String[] args) {
      Rectangle v=new Rectangle(50, 40);
      System.out.println(v.res);//2000
    }
  }
  