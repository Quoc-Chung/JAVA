package Paint;
public class Point implements Shape {
  private float x,y;
  public Point(float x , float y){
    this.x = x;
    this.y =y;
  }
  @Override
  public float area(){
    return 0; 
  }
  @Override
  public float perimeter(){
      return 0;
  }
  @Override
  public float distance(Shape other) {
    if (other instanceof Point) {
        Point otherPoint = (Point) other;
        return (float)Math.sqrt(Math.pow(this.x - otherPoint.x, 2) + Math.pow(this.y - otherPoint.y, 2));
    }
    return -1; // Hoặc có thể ném một ngoại lệ.
}

@Override
    public void Move(float deltaX, float deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    @Override
    public void Rotate(float angle) {
        // Không cần triển khai cho điểm.
    }

    @Override
    public void zoom(float ratio) {
        // Không cần triển khai cho điểm.
    }

    // Các phương thức getters và setters
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
