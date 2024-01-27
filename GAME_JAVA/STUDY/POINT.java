import java.awt.Point;

public class POINT{
    public static void main(String[] args) {
        // Tạo đối tượng Point
        Point point = new Point(3, 7);

        // Truy cập và in ra tọa độ
        System.out.println("X coordinate: " + point.getX());
        System.out.println("Y coordinate: " + point.getY());

        // Cập nhật tọa độ
        point.setLocation(10, 20);

        // In ra tọa độ sau khi cập nhật
        System.out.println("Updated X coordinate: " + point.getX());
        System.out.println("Updated Y coordinate: " + point.getY());
    }
}