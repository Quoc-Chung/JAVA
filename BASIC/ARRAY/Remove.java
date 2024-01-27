package ARRAY;
import java.util.ArrayList;
import java.util.Arrays;
public class Remove {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Loại bỏ phần tử ở vị trí index 1 (Banana)
       // fruits.remove(1);
      //  fruits.remove("Banana");
     //   fruits.clear();
        System.out.println("Các phần tử sau khi loại bỏ:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Tạo một danh sách mới chứa các phần tử cần xóa
        ArrayList<String> elementsToRemove = new ArrayList<>(Arrays.asList("Banana", "Orange"));
        // Xóa tất cả các phần tử có trong danh sách elementsToRemove
        fruits.removeAll(elementsToRemove);

        /* -Xoa mot phan tu thoa man mot dieu kien nao do  -  */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        // Xóa bỏ các phần tử lớn hơn 15
        numbers.removeIf(n-> n > 15);

         // Kiểm tra xem "Banana" có trong ArrayList không
         boolean containsBanana = fruits.contains("Banana");
         System.out.println("Có chứa \"Banana\" không? " + containsBanana);

         // Tìm chỉ mục của "Banana" trong ArrayList
         int indexOfBanana = fruits.indexOf("Banana");
         System.out.println("Chỉ mục của \"Banana\": " + indexOfBanana);

         // Tìm chỉ mục của lần xuất hiện cuối cùng của "Banana" trong ArrayList
        int lastIndexOfBanana = fruits.lastIndexOf("Banana");
        System.out.println("Chỉ mục của lần xuất hiện cuối cùng của \"Banana\": " + lastIndexOfBanana);


    }
}
