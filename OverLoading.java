package MethodsOverloadOverride;


class Shapes {
    public void area()
   {
      System.out.println("Find area ");
    }
  public void area(int radius)
   {
      System.out.println("Circle area = "+3.14*radius*radius);
    }
      //TRIANGLE
  public void area(double base, double height) 
   {
      System.out.println("Triangle area="+0.5*base*height);
    }

    //RECTANGLE
  public void area(int leng, int widt)
   {
      System.out.println("Rectangle area="+leng*widt);
    }
  
  
  }
  
  class Main {
    public static void main(String[] args) {
      Shapes myShape = new Shapes();  // Create a Shapes object
      
      myShape.area();
      myShape.area(100);
      myShape.area(32.5,72.2);
      myShape.area(20,10);
      
    }
}