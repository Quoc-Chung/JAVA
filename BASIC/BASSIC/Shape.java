
class Shape{
   public void draw(){
    System.out.println("Drawing a shape.");
   }
}
class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println(" Vẽ hình tròn ");
    }
}
class Rectangle extends Shape {
    @Override
    public void draw(){
        System.out.println("\nVe hinh chu nhat ");
    }
}


