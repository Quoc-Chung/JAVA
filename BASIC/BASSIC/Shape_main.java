public class  Shape_main{
    public static void main(String[] args){
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Shape(); // Đối tượng của lớp cha

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}