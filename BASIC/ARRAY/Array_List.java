package ARRAY;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Array_List{
    public static void main(String[] args){
        List<String> animals = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        /* - Thêm mới các giá trị -  */
        animals.add("Lion");
        animals.add("Dog");
        animals.add("Monkey");
        animals.add("Cat");
        animals.add("Bird");
        System.out.println("ArrayList vua them la :");
        System.out.print(animals);
        scanner.close();
        
        /* - Truy cập các phần tử trong Array_List -  */
        List<String> topCompanies = new ArrayList<>();
        topCompanies.add("apple");
        topCompanies.add("amazon");
        topCompanies.add("Facebook");
        topCompanies.add("Microsoft");

        System.out.println("Kich thuoc list : "+ topCompanies.size());
        
        String get = topCompanies.get(1);
        System.out.println(get);
        topCompanies.set(1,"Chung");
        System.out.println(topCompanies.get(1));
    }
}

