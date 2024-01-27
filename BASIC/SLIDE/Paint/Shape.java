package Paint;
public interface Shape {
    /* - Tính diện tích -  */
         float area();
    /* - Tính chu vi =  */
         float perimeter();
    /* - tính khoảng cách - */
         float distance(Shape other);

    /* - Di chuyển - */
         void Move(float X ,float Y);
    /* - Xoay - */
         void Rotate(float angle);

    /* - zoom - */
        void zoom(float ratio);
}


