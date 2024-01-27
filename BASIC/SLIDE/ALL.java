import java.util.ArrayList;
import java.util.List;

public class ALL {
    public static void main(String[] args) {
        // Khởi tạo danh sách
        List<String> listA = new ArrayList<>();
        listA.add("Apple");
        listA.add("Banana");
        listA.add("Orange");

        System.out.println("Danh sách ban đầu (listA): " + listA);

        // Sử dụng phương thức addAll()
        List<String> listB = new ArrayList<>();
        listB.add("Banana");
        listB.add("Cherry");
        listB.add("Orange");

        listA.addAll(listB);
        System.out.println("Danh sách sau khi sử dụng addAll(): " + listA);

        // Sử dụng phương thức retainAll()
        List<String> listC = new ArrayList<>();
        listC.add("Banana");
        listC.add("Cherry");

        listA.retainAll(listC);
        System.out.println("Danh sách sau khi sử dụng retainAll(): " + listA);

        // Sử dụng phương thức removeAll()
        listA.removeAll(listC);
        System.out.println("Danh sách sau khi sử dụng removeAll(): " + listA);
    }
}
